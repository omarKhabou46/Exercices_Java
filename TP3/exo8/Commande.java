public class Commande {
    private double montantCmd;
    private Paiment modeP;

    public Commande(double montant, Paiment modeP) {
        this.montantCmd = montant;
        this.modeP = modeP;
    }

    public boolean processPaiment() {
        return modeP.effectuerPaiment(montantCmd);
    }
}
