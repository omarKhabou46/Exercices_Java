public class PayPal extends Paiment{
    private String email;
    public PayPal(double montant, int numeroTrans, String email) {
        super(montant, numeroTrans);
        this.email = email;
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
