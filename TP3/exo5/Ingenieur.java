public class Ingenieur extends Employe{
    private String specialite;

    public Ingenieur(String nom, String prenom, String email, String telephone, double salaire, String specialite) {
    super(nom, prenom, email, telephone, salaire);
    this.specialite = specialite;
}

@Override
public double calculerSalaire() {
    this.salaire += this.salaire * 0.15;
    return this.salaire;
}

@Override
public String toString() {
    return super.toString() + "specialite : " + this.specialite;
}


}


