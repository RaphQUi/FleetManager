/**
 * Représente un entretien.
 */
public class Entretien {

    private String idEntretien;
    private String idVehicule;
    private String idTypeEntretien;
    private double coutUnitaire;
    private int frequenceKm;

    /**
     * Constructeur classique.
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
     * Constructeur de chargement CSV.
     */
    public Entretien(String[] champs) {
        this(
            champs[0],
            champs[1],
            champs[2],
            Double.parseDouble(champs[3].trim()),
            Integer.parseInt(champs[4].trim())
        );
    }

    public String getIdEntretien() {
        return idEntretien;
    }

    public void setIdEntretien(String idEntretien) {
        if (idEntretien != null && !idEntretien.trim().isEmpty()) {
            this.idEntretien = idEntretien;
        } else {
            this.idEntretien = "INCONNU";
        }
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

    public double getCoutUnitaire() {
        return coutUnitaire;
    }

    public void setCoutUnitaire(double coutUnitaire) {
        if (coutUnitaire >= 0) {
            this.coutUnitaire = coutUnitaire;
        } else {
            this.coutUnitaire = 0;
        }
    }

    public int getFrequenceKm() {
        return frequenceKm;
    }

    public void setFrequenceKm(int frequenceKm) {
        if (frequenceKm >= 0) {
            this.frequenceKm = frequenceKm;
        } else {
            this.frequenceKm = 0;
        }
    }
}
