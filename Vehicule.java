import java.util.ArrayList;
import java.util.List;

/**
 * Représente un véhicule de la flotte.
 */
public class Vehicule {

    private String idVehicule;
    private String marque;
    private String modele;
    private String idTypeEnergie;
    private double prixAchat;
    private double consommation;
    private int autonomieKm;
    private int anneeAchat;
    private int dureeAmortissement;

    private List<Entretien> entretiens;
    private List<UtilisationAnnuelle> utilisationsAnnuelles;

    /**
     * Constructeur classique.
     */
    public Vehicule(String idVehicule, String marque, String modele, String idTypeEnergie,
                    double prixAchat, double consommation, int autonomieKm,
                    int anneeAchat, int dureeAmortissement) {
        this.entretiens = new ArrayList<>();
        this.utilisationsAnnuelles = new ArrayList<>();

        setIdVehicule(idVehicule);
        setMarque(marque);
        setModele(modele);
        setIdTypeEnergie(idTypeEnergie);
        setPrixAchat(prixAchat);
        setConsommation(consommation);
        setAutonomieKm(autonomieKm);
        setAnneeAchat(anneeAchat);
        setDureeAmortissement(dureeAmortissement);
    }

    /**
     * Constructeur de chargement depuis une ligne CSV.
     */
    public Vehicule(String[] champs) {
        this(
            champs[0],
            champs[1],
            champs[2],
            champs[3],
            Double.parseDouble(champs[4].trim()),
            Double.parseDouble(champs[5].trim()),
            Integer.parseInt(champs[6].trim()),
            Integer.parseInt(champs[7].trim()),
            Integer.parseInt(champs[8].trim())
        );
    }

    public String getIdVehicule() {
        return idVehicule;
    }

    public void setIdVehicule(String idVehicule) {
        if (idVehicule != null && !idVehicule.trim().isEmpty()) {
            this.idVehicule = idVehicule;
        } else {
            this.idVehicule = "INCONNU";
        }
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        if (marque != null && !marque.trim().isEmpty()) {
            this.marque = marque;
        } else {
            this.marque = "Inconnue";
        }
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        if (modele != null && !modele.trim().isEmpty()) {
            this.modele = modele;
        } else {
            this.modele = "Inconnu";
        }
    }

    public String getIdTypeEnergie() {
        return idTypeEnergie;
    }

    public void setIdTypeEnergie(String idTypeEnergie) {
        if (idTypeEnergie != null && !idTypeEnergie.trim().isEmpty()) {
            this.idTypeEnergie = idTypeEnergie;
        } else {
            this.idTypeEnergie = "INCONNU";
        }
    }

    public double getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(double prixAchat) {
        if (prixAchat >= 0) {
            this.prixAchat = prixAchat;
        } else {
            this.prixAchat = 0;
        }
    }

    public double getConsommation() {
        return consommation;
    }

    public void setConsommation(double consommation) {
        if (consommation >= 0) {
            this.consommation = consommation;
        } else {
            this.consommation = 0;
        }
    }

    public int getAutonomieKm() {
        return autonomieKm;
    }

    public void setAutonomieKm(int autonomieKm) {
        if (autonomieKm >= 0) {
            this.autonomieKm = autonomieKm;
        } else {
            this.autonomieKm = 0;
        }
    }

    public int getAnneeAchat() {
        return anneeAchat;
    }

    public void setAnneeAchat(int anneeAchat) {
        if (anneeAchat > 0) {
            this.anneeAchat = anneeAchat;
        } else {
            this.anneeAchat = 2000;
        }
    }

    public int getDureeAmortissement() {
        return dureeAmortissement;
    }

    public void setDureeAmortissement(int dureeAmortissement) {
        if (dureeAmortissement > 0) {
            this.dureeAmortissement = dureeAmortissement;
        } else {
            this.dureeAmortissement = 1;
        }
    }

    public List<Entretien> getEntretiens() {
        return entretiens;
    }

    public void addEntretien(Entretien entretien) {
        if (entretien != null) {
            entretiens.add(entretien);
        }
    }

    public List<UtilisationAnnuelle> getUtilisationsAnnuelles() {
        return utilisationsAnnuelles;
    }

    public void addUtilisationAnnuelle(UtilisationAnnuelle utilisation) {
        if (utilisation != null) {
            utilisationsAnnuelles.add(utilisation);
        }
    }
}
