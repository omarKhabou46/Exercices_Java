import java.util.Date;

public class Voiture extends Vehicule {
    private String modele;
    private Date annee;
    public Voiture(String nom, double prix, String modele, Date date) {
        super(nom, prix);
        this.modele = modele;
        this.annee = date;
    }

    @Override
    public void emettreSon() {
        System.out.println("La voiture vrombit.");
    }

    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("le modele est : " + this.modele + " la date est : " + this.annee);
    }
}
