abstract public class Figure {
    protected String nom;


    public Figure(String nom) {
        this.nom = nom;
    }
    abstract public double calculerAire();
    abstract public double calculerPerimetre();

    public void afficherDetails() {
        System.out.println(" le nom : " + this.nom + " perimetre : " + this.calculerPerimetre() + " Aire : " + this.calculerAire());
    }

}