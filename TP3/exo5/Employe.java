abstract public class Employe {
    public String nom;
    public String prenom;
    public String email;
    public String telephone;
    public double salaire;

    public Employe() {}

    public Employe(String nom, String prenom, String email, String telephone,double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.salaire = salaire;
    }

    public abstract double calculerSalaire();

    @Override
    public  String toString() {
        return "nom : " + this.nom + "prenom : " + this.prenom + "email :" + this.email + "tele : " + this.telephone + " salaire : " + this.salaire;
    }
}