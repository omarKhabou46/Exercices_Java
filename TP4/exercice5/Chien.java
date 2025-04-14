public class Chien extends Animal {

    @Override
    public void parler() {
        System.out.println("Miaou");
    }

    @Override
    public String toString() {
        return "je suis Chien ";
    }
}
