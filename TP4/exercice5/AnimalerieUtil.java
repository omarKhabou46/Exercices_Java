import java.util.List;

public class AnimalerieUtil {

    public void afficherAnimaux(List<? extends Animal> liste) {
        for (Animal an : liste) {
            an.parler();
        }
    }

    public void ajouterChien(List<? super Chien> liste) {
        Chien ch = new Chien();
        liste.add(ch);
    }

    public void afficherTous(List<?> liste) {
        liste.forEach(ele -> System.out.println(ele));
    }
}
