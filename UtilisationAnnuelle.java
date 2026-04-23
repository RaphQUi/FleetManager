/**
 * Représente l'utilisation annuelle d'un véhicule.
 * Cette classe contient les données non calculées de la ligne
 * et propose des méthodes de calcul pour le TCO annuel et le coût par km.
 */
public class UtilisationAnnuelle {

    private String idVehicule;
    private int annee;
    private int kmParcourus;

    /**
     * Construit une utilisation annuelle.
     *
     * @param idVehicule identifiant du véhicule
     * @param annee année d'utilisation
     * @param kmParcourus nombre de kilomètres parcourus
     */
    public UtilisationAnnuelle(String idVehicule, int annee, int kmParcourus) {
        setIdVehicule(idVehicule);
        setAnnee(annee);
        setKmParcourus(kmParcourus);
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
     * Retourne l'année.
     * @return l'année
     */
    public int getAnnee() {
        return annee;
    }

    /**
     * Modifie l'année.
     * @param annee nouvelle année
     */
    public void setAnnee(int annee) {
        if (annee > 0) {
            this.annee = annee;
        } else {
            this.annee = 2000;
        }
    }

    /**
     * Retourne le nombre de kilomètres parcourus.
     * @return les kilomètres parcourus
     */
    public int getKmParcourus() {
        return kmParcourus;
    }

    /**
     * Modifie le nombre de kilomètres parcourus.
     * @param kmParcourus nouveau kilométrage
     */
    public void setKmParcourus(int kmParcourus) {
        if (kmParcourus >= 0) {
            this.kmParcourus = kmParcourus;
        } else {
            this.kmParcourus = 0;
        }
    }

    /**
     * Calcule le TCO annuel.
     *
     * @param coutEnergie coût d'énergie annuel
     * @param coutEntretienAnnuel coût d'entretien annuel
     * @param amortissement amortissement annuel
     * @return le TCO annuel
     */
    public double getTcoAnnuel(double coutEnergie, double coutEntretienAnnuel, double amortissement) {
        return coutEnergie + coutEntretienAnnuel + amortissement;
    }

    /**
     * Calcule le coût par kilomètre.
     *
     * @param coutEnergie coût d'énergie annuel
     * @param coutEntretienAnnuel coût d'entretien annuel
     * @param amortissement amortissement annuel
     * @return le coût par kilomètre
     */
    public double getCoutParKm(double coutEnergie, double coutEntretienAnnuel, double amortissement) {
        if (kmParcourus == 0) {
            return 0;
        }
        return getTcoAnnuel(coutEnergie, coutEntretienAnnuel, amortissement) / kmParcourus;
    }
}
