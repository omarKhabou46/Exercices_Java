public class MachineProduction {
    private int id;
    private int nombreProduits;
    private static int prochainId = 1;
    private static int totalProduits;
    private static int plafondProduction;

    public MachineProduction() {
        this.id = prochainId;
        prochainId ++;
    }

    public static void setPlafondProduction(int plafond) {
        plafondProduction  = plafond;
    }

    public boolean produire(int quantite) {
        if (quantite > plafondProduction) {
            return false;
        }else {
            plafondProduction -= quantite;
            totalProduits += quantite;
            this.nombreProduits += quantite;
            return true;
        }
    }

    public static int getTotalProduits() {
        return totalProduits;
    }

    public int getTotPMachine() {
        return this.nombreProduits;
    }

    public int getIdMachine() {
        return this.id;
    }
}