/**
 * Représente un type d'énergie utilisé par un véhicule.
 * Un type d'énergie possède un identifiant, un libellé, une unité
 * et un prix par unité.
 */
public class TypeEnergie {

    private String idTypeEnergie;
    private String libelle;
    private String unite;
    private double prixParUnite;

    /**
     * Construit un type d'énergie.
     *
     * @param idTypeEnergie identifiant du type d'énergie
     * @param libelle libellé du type d'énergie
     * @param unite unité utilisée
     * @param prixParUnite prix par unité
     */
    public TypeEnergie(String idTypeEnergie, String libelle, String unite, double prixParUnite) {
        setIdTypeEnergie(idTypeEnergie);
        setLibelle(libelle);
        setUnite(unite);
        setPrixParUnite(prixParUnite);
    }

    /**
     * Retourne l'identifiant du type d'énergie.
     * @return l'identifiant
     */
    public String getIdTypeEnergie() {
        return idTypeEnergie;
    }

    /**
     * Modifie l'identifiant du type d'énergie.
     * @param idTypeEnergie nouvel identifiant
     */
    public void setIdTypeEnergie(String idTypeEnergie) {
        if (idTypeEnergie != null && !idTypeEnergie.trim().isEmpty()) {
            this.idTypeEnergie = idTypeEnergie;
        } else {
            this.idTypeEnergie = "INCONNU";
        }
    }

    /**
     * Retourne le libellé.
     * @return le libellé
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Modifie le libellé.
     * @param libelle nouveau libellé
     */
    public void setLibelle(String libelle) {
        if (libelle != null && !libelle.trim().isEmpty()) {
            this.libelle = libelle;
        } else {
            this.libelle = "Inconnu";
        }
    }

    /**
     * Retourne l'unité.
     * @return l'unité
     */
    public String getUnite() {
        return unite;
    }

    /**
     * Modifie l'unité.
     * @param unite nouvelle unité
     */
    public void setUnite(String unite) {
        if (unite != null && !unite.trim().isEmpty()) {
            this.unite = unite;
        } else {
            this.unite = "Inconnue";
        }
    }

    /**
     * Retourne le prix par unité.
     * @return le prix par unité
     */
    public double getPrixParUnite() {
        return prixParUnite;
    }

    /**
     * Modifie le prix par unité.
     * @param prixParUnite nouveau prix par unité
     */
    public void setPrixParUnite(double prixParUnite) {
        if (prixParUnite >= 0) {
            this.prixParUnite = prixParUnite;
        } else {
            this.prixParUnite = 0;
        }
    }
}
