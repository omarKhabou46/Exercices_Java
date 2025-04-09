public class Livre implements Empruntable {
    private String auteur;
    private String titre;
    private boolean emprunter;

    public Livre(String auteur, String titre, boolean emprunter) {
        this.auteur = auteur;
        this.titre = titre;
        this.emprunter = emprunter;
    }

    @Override
    public boolean emprunter() {
        if (!this.emprunter) {
            this.emprunter = true;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean retourner() {
        if (this.emprunter) {
            this.emprunter = false;
            return true;
        }
        return false;
    } 

    
}
