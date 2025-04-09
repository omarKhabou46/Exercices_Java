abstract public class Paiment {
    private double montant;
    private int numeroTrans;

    public Paiment(double montant, int numeroTrans) {
        this.montant = montant;
        this.numeroTrans = numeroTrans;
    }


    abstract public boolean effectuerPaiment(double montant);

    public double getMontant() {
        return this.montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}