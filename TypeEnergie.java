import java.util.ArrayList;
import java.util.List;

/**
 * Représente un type d'énergie.
 */
public class TypeEnergie {

    private String idTypeEnergie;
    private String libelle;
    private String unite;
    private double prixParUnite;

    private List<Vehicule> vehicules;

    /**
     * Constructeur classique.
     */
    public TypeEnergie(String idTypeEnergie, String libelle, String unite, double prixParUnite) {
        this.vehicules = new ArrayList<>();

        setIdTypeEnergie(idTypeEnergie);
        setLibelle(libelle);
        setUnite(unite);
        setPrixParUnite(prixParUnite);
    }

    /**
     * Constructeur de chargement CSV.
     */
    public TypeEnergie(String[] champs) {
        this(
            champs[0],
            champs[1],
            champs[2],
            Double.parseDouble(champs[3].trim())
        );
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

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        if (unite != null && !unite.trim().isEmpty()) {
            this.unite = unite;
        } else {
            this.unite = "Inconnue";
        }
    }

    public double getPrixParUnite() {
        return prixParUnite;
    }

    public void setPrixParUnite(double prixParUnite) {
        if (prixParUnite >= 0) {
            this.prixParUnite = prixParUnite;
        } else {
            this.prixParUnite = 0;
        }
    }

    public List<Vehicule> getVehicules() {
        return vehicules;
    }

    public void addVehicule(Vehicule vehicule) {
        if (vehicule != null) {
            vehicules.add(vehicule);
        }
    }
}
