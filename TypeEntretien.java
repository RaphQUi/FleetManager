import java.util.ArrayList;
import java.util.List;

/**
 * Représente un type d'entretien.
 */
public class TypeEntretien {

    private String idTypeEntretien;
    private String libelle;

    private List<Entretien> entretiens;

    /**
     * Constructeur classique.
     */
    public TypeEntretien(String idTypeEntretien, String libelle) {
        this.entretiens = new ArrayList<>();

        setIdTypeEntretien(idTypeEntretien);
        setLibelle(libelle);
    }

    /**
     * Constructeur de chargement CSV.
     */
    public TypeEntretien(String[] champs) {
        this(
            champs[0],
            champs[1]
        );
    }

    public String getIdTypeEntretien() {
        return idTypeEntretien;
    }

    public void setIdTypeEntretien(String idTypeEntretien) {
        if (idTypeEntretien != null && !idTypeEntretien.trim().isEmpty()) {
            this.idTypeEntretien = idTypeEntretien;
        } else {
            this.idTypeEntretien = "INCONNU";
        }
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        if (libelle != null && !libelle.trim().isEmpty()) {
            this.libelle = libelle;
        } else {
            this.libelle = "Inconnu";
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
}
