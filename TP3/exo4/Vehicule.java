public class Vehicule {
    private String nom;
    private double prix;

    public Vehicule(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public void emettreSon() {
        System.out.println("Le véhicule émet son inconnu");
    }

    public void afficherInformations() {
        System.out.println("le nom : " + this.nom + " le prix est : " + this.prix);
    }
    

}