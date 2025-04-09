public class Utilisateur {
    private String nom;

    public Utilisateur(String nom) {
        this.nom = nom;
    }

    public boolean emprunterObjet(Empruntable obj) {
        return obj.emprunter();
    }

    public String getNom() {
        return this.nom;
    }
    
}
