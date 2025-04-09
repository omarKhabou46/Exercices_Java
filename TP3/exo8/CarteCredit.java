public class CarteCredit extends Paiment {
    private String numCarte;
    public CarteCredit(double montant, int numeroTrans, String numCarte) {
        super(montant, numeroTrans);
        this.numCarte = numCarte;
    }

    @Override 
    public boolean effectuerPaiment(double montant) {
        if (this.getMontant() < montant) {
            return false;
        }else {
            double m = this.getMontant() - montant;
            this.setMontant(m);
            return true;
        }
    }
    
    
}
