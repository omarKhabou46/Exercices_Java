public class Main {

    public static void main(String[] args) {
        MachineProduction.setPlafondProduction(100);

        MachineProduction m1 = new MachineProduction();
        MachineProduction m2 = new MachineProduction();

        System.out.println("id de machine m1 est: "+m1.getIdMachine());
        System.out.println("id de machine m1 est: "+m1.getTotPMachine());

        System.out.println("id de machine m2 est: "+m2.getIdMachine());
        System.out.println("id de machine m2 est: "+m2.getTotPMachine());

        m1.produire(30);
        m2.produire(50);
        m1.produire(40);

        System.out.println("Total produits est : "+MachineProduction.getTotalProduits());
        
    }
    
}
