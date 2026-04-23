public class Main {

    public static void main(String[] args) {

        Vehicule vehicule = new Vehicule(
                "VH001",
                "Tesla",
                "Model 3",
                "ELEC",
                42990,
                14.5,
                510,
                2022,
                5
        );

        TypeEnergie typeEnergie = new TypeEnergie(
                "ELEC",
                "Électrique",
                "kWh",
                0.25
        );

        TypeEntretien typeEntretien = new TypeEntretien(
                "TENT001",
                "pneus"
        );

        Entretien entretien = new Entretien(
                "ENT001",
                "VH001",
                "TENT001",
                600,
                40000
        );

        UtilisationAnnuelle utilisation = new UtilisationAnnuelle(
                "VH001",
                2022,
                15000
        );

        System.out.println("=== TEST VEHICULE ===");
        System.out.println("Id : " + vehicule.getIdVehicule());
        System.out.println("Marque : " + vehicule.getMarque());
        System.out.println("Modele : " + vehicule.getModele());
        System.out.println("Type energie : " + vehicule.getIdTypeEnergie());
        System.out.println("Prix achat : " + vehicule.getPrixAchat());
        System.out.println("Consommation : " + vehicule.getConsommation());
        System.out.println("Autonomie : " + vehicule.getAutonomieKm());
        System.out.println("Annee achat : " + vehicule.getAnneeAchat());
        System.out.println("Duree amortissement : " + vehicule.getDureeAmortissement());

        System.out.println();
        System.out.println("=== TEST TYPE ENERGIE ===");
        System.out.println("Id : " + typeEnergie.getIdTypeEnergie());
        System.out.println("Libelle : " + typeEnergie.getLibelle());
        System.out.println("Unite : " + typeEnergie.getUnite());
        System.out.println("Prix par unite : " + typeEnergie.getPrixParUnite());

        System.out.println();
        System.out.println("=== TEST TYPE ENTRETIEN ===");
        System.out.println("Id : " + typeEntretien.getIdTypeEntretien());
        System.out.println("Libelle : " + typeEntretien.getLibelle());

        System.out.println();
        System.out.println("=== TEST ENTRETIEN ===");
        System.out.println("Id : " + entretien.getIdEntretien());
        System.out.println("Id vehicule : " + entretien.getIdVehicule());
        System.out.println("Id type entretien : " + entretien.getIdTypeEntretien());
        System.out.println("Cout unitaire : " + entretien.getCoutUnitaire());
        System.out.println("Frequence km : " + entretien.getFrequenceKm());

        System.out.println();
        System.out.println("=== TEST UTILISATION ANNUELLE ===");
        System.out.println("Id vehicule : " + utilisation.getIdVehicule());
        System.out.println("Annee : " + utilisation.getAnnee());
        System.out.println("Km parcourus : " + utilisation.getKmParcourus());

        double coutEnergie = 543.75;
        double coutEntretienAnnuel = 346.875;
        double amortissement = 8598.0;

        System.out.println("TCO annuel : " + utilisation.getTcoAnnuel(coutEnergie, coutEntretienAnnuel, amortissement));
        System.out.println("Cout par km : " + utilisation.getCoutParKm(coutEnergie, coutEntretienAnnuel, amortissement));
    }
}
