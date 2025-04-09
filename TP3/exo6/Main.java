public class Main {
    public static void main(String[] args) {
        Figure cercle = new Cercle("cer", 3);
        Figure rectangle = new Rectangle("rec" , 2, 3);

        cercle.afficherDetails();
        rectangle.afficherDetails();
    }
    
}
