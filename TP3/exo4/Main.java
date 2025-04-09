import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Vehicule voiture = new Voiture("Dacia", 200000, "2024", new Date());
        Vehicule moto = new Moto("swing", 5000, "marque1", 2000);
        Vehicule avion = new Avion("avion1", 2000000, "compagne1", 500);

        voiture.emettreSon();
        voiture.afficherInformations();
        System.out.println("###########################################");
        moto.emettreSon();
        moto.afficherInformations();
        System.out.println("###########################################");
        avion.emettreSon();
        avion.afficherInformations();
        System.out.println("###########################################");

    }
}