public class Cercle extends Figure {
    private double rayon;

    public Cercle(String nom, double rayon) {
        super(nom);
        this.rayon = rayon;
    }

    @Override
    public double calculerAire() {
        return Math.PI * Math.pow(this.rayon, 2);
    }

    @Override
    public double calculerPerimetre() {
        return Math.PI * this.rayon * 2;
    }
}