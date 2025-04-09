public class Main {
    public static void main(String[] args) {
        Employe ingenieur = new Ingenieur("mohamed", "lemane", "mohamed@gmail.com", "055555555", 200000, "big data");
        Employe manager = new Manager("khabou", "omar", "omar@gmail.com", "022233554", 10000, "marketing");

        System.out.println(ingenieur.toString());
        System.out.println(manager.toString());

        System.out.println(manager.calculerSalaire());
        System.out.println(ingenieur.calculerSalaire());
    }
}