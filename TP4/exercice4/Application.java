import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Produit p1 = new Produit(1, "p1", "m1", 40.5, 12, "desc1");
        Produit p2 = new Produit(2, "p2", "m2", 100.0, 5, "desc2");
        Produit p3 = new Produit(3, "p3", "m1", 200.0, 10, "desc3");
        Produit p4 = new Produit(4, "p4", "m3", 5000.0, 90, "desc4");
        IMetier <Produit> listeProduit = new MetierProduitImpl(new ArrayList<>());
        listeProduit.add(p1);
        listeProduit.add(p2);
        listeProduit.add(p3);
        listeProduit.add(p4);

        List<Produit> l1 = listeProduit.getAll();
        for (Produit p : l1) {
            System.out.println(p.toString());
        }

        System.out.println("##############################################");
        Produit p = listeProduit.findById(2);
        System.out.println(p);

        listeProduit.delete(2);

        System.out.println("##############################################");
        List<Produit> l2 = listeProduit.getAll();
        for (Produit prod : l2) {
            System.out.println(prod);
        }

    }
}
