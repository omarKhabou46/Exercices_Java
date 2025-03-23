package exo2;

public class Auteur extends Personne {
    private String numAuteur;
    public Auteur(String nom, String prenom, String email, int age, String numAuteur) {
        super(nom, prenom, email, age);
        this.numAuteur = numAuteur;
    }
    
    @Override 
    public String toString() {
        return super.toString() + " le numAuteur est : " + this.numAuteur;
    }
    
}
