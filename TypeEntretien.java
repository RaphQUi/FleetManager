/**
 * Représente un type d'entretien.
 * Un type d'entretien possède un identifiant et un libellé.
 */
public class TypeEntretien {

    private String idTypeEntretien;
    private String libelle;

    /**
     * Construit un type d'entretien.
     *
     * @param idTypeEntretien identifiant du type d'entretien
     * @param libelle libellé du type d'entretien
     */
    public TypeEntretien(String idTypeEntretien, String libelle) {
        setIdTypeEntretien(idTypeEntretien);
        setLibelle(libelle);
    }

    /**
     * Retourne l'identifiant du type d'entretien.
     * @return l'identifiant
     */
    public String getIdTypeEntretien() {
        return idTypeEntretien;
    }

    /**
     * Modifie l'identifiant du type d'entretien.
     * @param idTypeEntretien nouvel identifiant
     */
    public void setIdTypeEntretien(String idTypeEntretien) {
        if (idTypeEntretien != null && !idTypeEntretien.trim().isEmpty()) {
            this.idTypeEntretien = idTypeEntretien;
        } else {
            this.idTypeEntretien = "INCONNU";
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
}
