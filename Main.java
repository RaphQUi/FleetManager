import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        try {
            Map<String, Vehicule> vehicules = chargerVehicules("data/vehicule.csv");
            Map<String, TypeEnergie> typesEnergie = chargerTypesEnergie("data/typeEnergie.csv");
            Map<String, TypeEntretien> typesEntretien = chargerTypesEntretien("data/typeEntretien.csv");
            Map<String, Entretien> entretiens = chargerEntretiens("data/entretien.csv");
            List<UtilisationAnnuelle> utilisations = chargerUtilisations("data/utilisationAnnuelle.csv");

            lierVehiculesEtTypesEnergie(vehicules, typesEnergie);
            lierVehiculesEtEntretiens(vehicules, entretiens, typesEntretien);
            lierVehiculesEtUtilisations(vehicules, utilisations);

            System.out.println("=== CHARGEMENT CSV OK ===");
            System.out.println("Nombre de vehicules : " + vehicules.size());
            System.out.println("Nombre de types energie : " + typesEnergie.size());
            System.out.println("Nombre de types entretien : " + typesEntretien.size());
            System.out.println("Nombre d'entretiens : " + entretiens.size());
            System.out.println("Nombre d'utilisations annuelles : " + utilisations.size());

            System.out.println();
            System.out.println("=== EXEMPLES DE DONNEES CHARGEES ===");

            Vehicule vehicule = vehicules.get("VH001");
            if (vehicule != null) {
                System.out.println("Vehicule VH001 : " + vehicule.getMarque() + " " + vehicule.getModele());
                System.out.println("Nombre d'entretiens pour VH001 : " + vehicule.getEntretiens().size());
                System.out.println("Nombre d'utilisations annuelles pour VH001 : " + vehicule.getUtilisationsAnnuelles().size());
            }

            TypeEnergie typeEnergie = typesEnergie.get("ELEC");
            if (typeEnergie != null) {
                System.out.println("Type energie ELEC : " + typeEnergie.getLibelle() + " - " + typeEnergie.getPrixParUnite());
                System.out.println("Nombre de vehicules ELEC : " + typeEnergie.getVehicules().size());
            }

            TypeEntretien typeEntretien = typesEntretien.get("TENT001");
            if (typeEntretien != null) {
                System.out.println("Type entretien TENT001 : " + typeEntretien.getLibelle());
                System.out.println("Nombre d'entretiens de ce type : " + typeEntretien.getEntretiens().size());
            }

            Entretien entretien = entretiens.get("ENT001");
            if (entretien != null) {
                System.out.println("Entretien ENT001 : cout = " + entretien.getCoutUnitaire()
                        + ", frequence = " + entretien.getFrequenceKm());
            }

            if (!utilisations.isEmpty()) {
                UtilisationAnnuelle utilisation = utilisations.get(0);
                System.out.println("Premiere utilisation : vehicule = " + utilisation.getIdVehicule()
                        + ", annee = " + utilisation.getAnnee()
                        + ", km = " + utilisation.getKmParcourus());

                double coutEnergie = 543.75;
                double coutEntretienAnnuel = 346.875;
                double amortissement = 8598.0;

                System.out.println("TCO annuel test : " + utilisation.getTcoAnnuel(coutEnergie, coutEntretienAnnuel, amortissement));
                System.out.println("Cout par km test : " + utilisation.getCoutParKm(coutEnergie, coutEntretienAnnuel, amortissement));
            }

        } catch (IOException e) {
            System.out.println("Erreur de lecture des fichiers CSV : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erreur dans le programme : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static Map<String, Vehicule> chargerVehicules(String chemin) throws IOException {
        Map<String, Vehicule> vehicules = new LinkedHashMap<>();
        List<String> lignes = Files.readAllLines(Path.of(chemin), StandardCharsets.UTF_8);

        for (int i = 1; i < lignes.size(); i++) {
            String ligne = lignes.get(i).trim();
            if (!ligne.isEmpty()) {
                String[] champs = ligne.split(",");
                Vehicule vehicule = new Vehicule(champs);
                vehicules.put(vehicule.getIdVehicule(), vehicule);
            }
        }

        return vehicules;
    }

    public static Map<String, TypeEnergie> chargerTypesEnergie(String chemin) throws IOException {
        Map<String, TypeEnergie> typesEnergie = new LinkedHashMap<>();
        List<String> lignes = Files.readAllLines(Path.of(chemin), StandardCharsets.UTF_8);

        for (int i = 1; i < lignes.size(); i++) {
            String ligne = lignes.get(i).trim();
            if (!ligne.isEmpty()) {
                String[] champs = ligne.split(",");
                TypeEnergie typeEnergie = new TypeEnergie(champs);
                typesEnergie.put(typeEnergie.getIdTypeEnergie(), typeEnergie);
            }
        }

        return typesEnergie;
    }

    public static Map<String, TypeEntretien> chargerTypesEntretien(String chemin) throws IOException {
        Map<String, TypeEntretien> typesEntretien = new LinkedHashMap<>();
        List<String> lignes = Files.readAllLines(Path.of(chemin), StandardCharsets.UTF_8);

        for (int i = 1; i < lignes.size(); i++) {
            String ligne = lignes.get(i).trim();
            if (!ligne.isEmpty()) {
                String[] champs = ligne.split(",");
                TypeEntretien typeEntretien = new TypeEntretien(champs);
                typesEntretien.put(typeEntretien.getIdTypeEntretien(), typeEntretien);
            }
        }

        return typesEntretien;
    }

    public static Map<String, Entretien> chargerEntretiens(String chemin) throws IOException {
        Map<String, Entretien> entretiens = new LinkedHashMap<>();
        List<String> lignes = Files.readAllLines(Path.of(chemin), StandardCharsets.UTF_8);

        for (int i = 1; i < lignes.size(); i++) {
            String ligne = lignes.get(i).trim();
            if (!ligne.isEmpty()) {
                String[] champs = ligne.split(",");
                Entretien entretien = new Entretien(champs);
                entretiens.put(entretien.getIdEntretien(), entretien);
            }
        }

        return entretiens;
    }

    public static List<UtilisationAnnuelle> chargerUtilisations(String chemin) throws IOException {
        List<UtilisationAnnuelle> utilisations = new ArrayList<>();
        List<String> lignes = Files.readAllLines(Path.of(chemin), StandardCharsets.UTF_8);

        for (int i = 1; i < lignes.size(); i++) {
            String ligne = lignes.get(i).trim();
            if (!ligne.isEmpty()) {
                String[] champs = ligne.split(",");
                UtilisationAnnuelle utilisation = new UtilisationAnnuelle(champs);
                utilisations.add(utilisation);
            }
        }

        return utilisations;
    }

    public static void lierVehiculesEtTypesEnergie(Map<String, Vehicule> vehicules,
                                                   Map<String, TypeEnergie> typesEnergie) {
        for (Vehicule vehicule : vehicules.values()) {
            TypeEnergie typeEnergie = typesEnergie.get(vehicule.getIdTypeEnergie());
            if (typeEnergie != null) {
                typeEnergie.addVehicule(vehicule);
            }
        }
    }

    public static void lierVehiculesEtEntretiens(Map<String, Vehicule> vehicules,
                                                 Map<String, Entretien> entretiens,
                                                 Map<String, TypeEntretien> typesEntretien) {
        for (Entretien entretien : entretiens.values()) {
            Vehicule vehicule = vehicules.get(entretien.getIdVehicule());
            if (vehicule != null) {
                vehicule.addEntretien(entretien);
            }

            TypeEntretien typeEntretien = typesEntretien.get(entretien.getIdTypeEntretien());
            if (typeEntretien != null) {
                typeEntretien.addEntretien(entretien);
            }
        }
    }

    public static void lierVehiculesEtUtilisations(Map<String, Vehicule> vehicules,
                                                   List<UtilisationAnnuelle> utilisations) {
        for (UtilisationAnnuelle utilisation : utilisations) {
            Vehicule vehicule = vehicules.get(utilisation.getIdVehicule());
            if (vehicule != null) {
                vehicule.addUtilisationAnnuelle(utilisation);
            }
        }
    }
}
