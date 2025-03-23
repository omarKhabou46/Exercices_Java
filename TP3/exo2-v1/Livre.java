package exo2;

public class Livre {
    private final int ISBN = 100;
    private String titre;
    private Auteur auteur;
    
    public Livre(Auteur auteur, String titre) {
        this.auteur = auteur;
        this.titre = titre;
    }
    
    @Override
    public String toString() {
        return auteur.toString() + " le titre de livre est : " + this.titre;
    }
}
