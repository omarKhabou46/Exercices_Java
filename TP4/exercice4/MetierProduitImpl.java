import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit> {
       private List<Produit> listeProduit;

    public MetierProduitImpl(List<Produit> listeProduit) {
        this.listeProduit = listeProduit;
    }

    @Override
       public void add(Produit p) {
           if (!listeProduit.contains(p)) {
               listeProduit.add(p);
           }else {
               System.out.println("le produit existe deja");
           }
       }
    @Override
    public List<Produit> getAll() {
        List<Produit> liste1 = new ArrayList<>();
        for (Produit p: listeProduit) {
            liste1.add(p);
        }
        return liste1;
    }

    @Override
    public Produit findById(long id) {
        Produit p1 = null;
        for (Produit p : listeProduit) {
            if (p.getId() == id) {
                p1 = p;
            }
        }
        return p1;
    }

    @Override
    public void delete(long id) {
        listeProduit.remove(findById(id));
    }

}
