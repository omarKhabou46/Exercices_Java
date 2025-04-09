public class Rectangle extends Figure {
    private double longeur;
    private double largeur;

    public Rectangle(String nom, double longeur, double largeur) {
        super(nom);
        this.longeur = longeur;
        this.largeur = largeur;
    }

    @Override
    public double calculerAire() {
        return this.longeur * this.largeur;
    }

    @Override
    public double calculerPerimetre() {
        return 2 * (this.longeur + this.largeur);
    }

}