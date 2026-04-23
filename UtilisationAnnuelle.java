/**
 * Représente l'utilisation annuelle d'un véhicule.
 */
public class UtilisationAnnuelle {

    private String idVehicule;
    private int annee;
    private int kmParcourus;

    /**
     * Constructeur classique.
     */
    public UtilisationAnnuelle(String idVehicule, int annee, int kmParcourus) {
        setIdVehicule(idVehicule);
        setAnnee(annee);
        setKmParcourus(kmParcourus);
    }

    /**
     * Constructeur de chargement CSV.
     * On garde ici seulement les colonnes non calculées.
     */
    public UtilisationAnnuelle(String[] champs) {
        this(
            champs[0],
            Integer.parseInt(champs[1].trim()),
            Integer.parseInt(champs[2].trim())
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

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        if (annee > 0) {
            this.annee = annee;
        } else {
            this.annee = 2000;
        }
    }

    public int getKmParcourus() {
        return kmParcourus;
    }

    public void setKmParcourus(int kmParcourus) {
        if (kmParcourus >= 0) {
            this.kmParcourus = kmParcourus;
        } else {
            this.kmParcourus = 0;
        }
    }

    public double getTcoAnnuel(double coutEnergie, double coutEntretienAnnuel, double amortissement) {
        return coutEnergie + coutEntretienAnnuel + amortissement;
    }

    public double getCoutParKm(double coutEnergie, double coutEntretienAnnuel, double amortissement) {
        if (kmParcourus == 0) {
            return 0;
        }
        return getTcoAnnuel(coutEnergie, coutEntretienAnnuel, amortissement) / kmParcourus;
    }
}
