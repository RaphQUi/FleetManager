/**
 * Représente un véhicule de la flotte.
 * Un véhicule est défini par son identifiant, sa marque, son modèle,
 * son type d'énergie, son prix d'achat, sa consommation, son autonomie,
 * son année d'achat et sa durée d'amortissement.
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

    /**
     * Construit un véhicule avec tous ses attributs.
     *
     * @param idVehicule identifiant du véhicule
     * @param marque marque du véhicule
     * @param modele modèle du véhicule
     * @param idTypeEnergie identifiant du type d'énergie
     * @param prixAchat prix d'achat du véhicule
     * @param consommation consommation du véhicule
     * @param autonomieKm autonomie en kilomètres
     * @param anneeAchat année d'achat
     * @param dureeAmortissement durée d'amortissement en années
     */
    public Vehicule(String idVehicule, String marque, String modele, String idTypeEnergie,
                    double prixAchat, double consommation, int autonomieKm,
                    int anneeAchat, int dureeAmortissement) {
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
     * Retourne l'identifiant du véhicule.
     * @return l'identifiant du véhicule
     */
    public String getIdVehicule() {
        return idVehicule;
    }

    /**
     * Modifie l'identifiant du véhicule.
     * @param idVehicule nouvel identifiant
     */
    public void setIdVehicule(String idVehicule) {
        if (idVehicule != null && !idVehicule.trim().isEmpty()) {
            this.idVehicule = idVehicule;
        } else {
            this.idVehicule = "INCONNU";
        }
    }

    /**
     * Retourne la marque du véhicule.
     * @return la marque
     */
    public String getMarque() {
        return marque;
    }

    /**
     * Modifie la marque du véhicule.
     * @param marque nouvelle marque
     */
    public void setMarque(String marque) {
        if (marque != null && !marque.trim().isEmpty()) {
            this.marque = marque;
        } else {
            this.marque = "Inconnue";
        }
    }

    /**
     * Retourne le modèle du véhicule.
     * @return le modèle
     */
    public String getModele() {
        return modele;
    }

    /**
     * Modifie le modèle du véhicule.
     * @param modele nouveau modèle
     */
    public void setModele(String modele) {
        if (modele != null && !modele.trim().isEmpty()) {
            this.modele = modele;
        } else {
            this.modele = "Inconnu";
        }
    }

    /**
     * Retourne l'identifiant du type d'énergie.
     * @return l'identifiant du type d'énergie
     */
    public String getIdTypeEnergie() {
        return idTypeEnergie;
    }

    /**
     * Modifie l'identifiant du type d'énergie.
     * @param idTypeEnergie nouvel identifiant du type d'énergie
     */
    public void setIdTypeEnergie(String idTypeEnergie) {
        if (idTypeEnergie != null && !idTypeEnergie.trim().isEmpty()) {
            this.idTypeEnergie = idTypeEnergie;
        } else {
            this.idTypeEnergie = "INCONNU";
        }
    }

    /**
     * Retourne le prix d'achat.
     * @return le prix d'achat
     */
    public double getPrixAchat() {
        return prixAchat;
    }

    /**
     * Modifie le prix d'achat.
     * @param prixAchat nouveau prix d'achat
     */
    public void setPrixAchat(double prixAchat) {
        if (prixAchat >= 0) {
            this.prixAchat = prixAchat;
        } else {
            this.prixAchat = 0;
        }
    }

    /**
     * Retourne la consommation.
     * @return la consommation
     */
    public double getConsommation() {
        return consommation;
    }

    /**
     * Modifie la consommation.
     * @param consommation nouvelle consommation
     */
    public void setConsommation(double consommation) {
        if (consommation >= 0) {
            this.consommation = consommation;
        } else {
            this.consommation = 0;
        }
    }

    /**
     * Retourne l'autonomie en kilomètres.
     * @return l'autonomie
     */
    public int getAutonomieKm() {
        return autonomieKm;
    }

    /**
     * Modifie l'autonomie.
     * @param autonomieKm nouvelle autonomie
     */
    public void setAutonomieKm(int autonomieKm) {
        if (autonomieKm >= 0) {
            this.autonomieKm = autonomieKm;
        } else {
            this.autonomieKm = 0;
        }
    }

    /**
     * Retourne l'année d'achat.
     * @return l'année d'achat
     */
    public int getAnneeAchat() {
        return anneeAchat;
    }

    /**
     * Modifie l'année d'achat.
     * @param anneeAchat nouvelle année d'achat
     */
    public void setAnneeAchat(int anneeAchat) {
        if (anneeAchat > 0) {
            this.anneeAchat = anneeAchat;
        } else {
            this.anneeAchat = 2000;
        }
    }

    /**
     * Retourne la durée d'amortissement.
     * @return la durée d'amortissement
     */
    public int getDureeAmortissement() {
        return dureeAmortissement;
    }

    /**
     * Modifie la durée d'amortissement.
     * @param dureeAmortissement nouvelle durée d'amortissement
     */
    public void setDureeAmortissement(int dureeAmortissement) {
        if (dureeAmortissement > 0) {
            this.dureeAmortissement = dureeAmortissement;
        } else {
            this.dureeAmortissement = 1;
        }
    }
}
