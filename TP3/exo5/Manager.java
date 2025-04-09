public class Manager extends Employe {
    private String service;

    public Manager(String nom, String prenom, String email, String telephone, double salaire, String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service = service;
    }

    @Override
    public double calculerSalaire() {
        this.salaire += this.salaire * 0.2;
        return this.salaire;
    }

    @Override
    public String toString() {
    return super.toString() + "service : " + this.service;
    }
    
}
