import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Chien> lChien = new ArrayList<>();
        List<Animal> lAnimal = new ArrayList<>();
        List<Object> lObject = new ArrayList<>();

        Chien ch1 = new Chien();
        Chien ch2 = new Chien();
        lChien.add(ch1);
        lChien.add(ch2);

        Animal an1 = new Animal();
        Animal an2 = new Animal();
        lAnimal.add(an1);
        lAnimal.add(an2);

        Object o1 = new Object();
        Object o2 = new Object();
        lObject.add(o1);
        lObject.add(o2);


        AnimalerieUtil an = new AnimalerieUtil();
        an.afficherAnimaux(lChien);
        an.afficherAnimaux(lAnimal);
        an.afficherTous(lAnimal);
        an.afficherTous(lChien);
        an.afficherTous(lObject);
    }
}