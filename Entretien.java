/**
 * Représente un entretien réalisé ou prévu pour un véhicule.
 * Un entretien est défini par un identifiant, un véhicule, un type d'entretien,
 * un coût unitaire et une fréquence en kilomètres.
 */
public class Entretien {

    private String idEntretien;
    private String idVehicule;
    private String idTypeEntretien;
    private double coutUnitaire;
    private int frequenceKm;

    /**
     * Construit un entretien.
     *
     * @param idEntretien identifiant de l'entretien
     * @param idVehicule identifiant du véhicule
     * @param idTypeEntretien identifiant du type d'entretien
     * @param coutUnitaire coût unitaire
     * @param frequenceKm fréquence en kilomètres
     */
    public Entretien(String idEntretien, String idVehicule, String idTypeEntretien,
                     double coutUnitaire, int frequenceKm) {
        setIdEntretien(idEntretien);
        setIdVehicule(idVehicule);
        setIdTypeEntretien(idTypeEntretien);
        setCoutUnitaire(coutUnitaire);
        setFrequenceKm(frequenceKm);
    }

    /**
     * Retourne l'identifiant de l'entretien.
     * @return l'identifiant
     */
    public String getIdEntretien() {
        return idEntretien;
    }

    /**
     * Modifie l'identifiant de l'entretien.
     * @param idEntretien nouvel identifiant
     */
    public void setIdEntretien(String idEntretien) {
        if (idEntretien != null && !idEntretien.trim().isEmpty()) {
            this.idEntretien = idEntretien;
        } else {
            this.idEntretien = "INCONNU";
        }
    }

    /**
     * Retourne l'identifiant du véhicule.
     * @return l'identifiant du véhicule
     */
    public String getIdVehicule() {
        return idVehicule;
    }

    /**
     * Modifie l'identifiant du véhicule.
     * @param idVehicule nouvel identifiant du véhicule
     */
    public void setIdVehicule(String idVehicule) {
        if (idVehicule != null && !idVehicule.trim().isEmpty()) {
            this.idVehicule = idVehicule;
        } else {
            this.idVehicule = "INCONNU";
        }
    }

    /**
     * Retourne l'identifiant du type d'entretien.
     * @return l'identifiant du type d'entretien
     */
    public String getIdTypeEntretien() {
        return idTypeEntretien;
    }

    /**
     * Modifie l'identifiant du type d'entretien.
     * @param idTypeEntretien nouvel identifiant du type d'entretien
     */
    public void setIdTypeEntretien(String idTypeEntretien) {
        if (idTypeEntretien != null && !idTypeEntretien.trim().isEmpty()) {
            this.idTypeEntretien = idTypeEntretien;
        } else {
            this.idTypeEntretien = "INCONNU";
        }
    }

    /**
     * Retourne le coût unitaire.
     * @return le coût unitaire
     */
    public double getCoutUnitaire() {
        return coutUnitaire;
    }

    /**
     * Modifie le coût unitaire.
     * @param coutUnitaire nouveau coût unitaire
     */
    public void setCoutUnitaire(double coutUnitaire) {
        if (coutUnitaire >= 0) {
            this.coutUnitaire = coutUnitaire;
        } else {
            this.coutUnitaire = 0;
        }
    }

    /**
     * Retourne la fréquence en kilomètres.
     * @return la fréquence
     */
    public int getFrequenceKm() {
        return frequenceKm;
    }

    /**
     * Modifie la fréquence en kilomètres.
     * @param frequenceKm nouvelle fréquence
     */
    public void setFrequenceKm(int frequenceKm) {
        if (frequenceKm >= 0) {
            this.frequenceKm = frequenceKm;
        } else {
            this.frequenceKm = 0;
        }
    }
}
