package exo2;

public class Adherent extends Personne {
    private String numAdherent;
    public Adherent(String nom, String prenom, String email, int age, String numAdherent) {
            super(nom, prenom, email, age);
            this.numAdherent = numAdherent;
    }
    
    @Override
    public String toString () {
        return super.toString() + " le numAdherent est : " + this.numAdherent;
    }
}

