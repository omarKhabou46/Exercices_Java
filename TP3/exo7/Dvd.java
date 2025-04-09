public class Dvd implements Empruntable {
    private String realisateur;
    private String titre;
    private boolean emprunter;

    public Dvd(String realisateur, String titre, boolean emprunter) {
        this.realisateur = realisateur;
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
