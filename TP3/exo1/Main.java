package exo1;
public class Main {
    public static void main(String[] args) {
        Compte c1 = new Compte();
        Compte c2 = new Compte("123123123", 5000.0);
        Compte c3 = new Compte("123456789", 7000.0);
        Compte c4 = new Compte("888888888", 15000.0);
        c1.afficherCompteInfo();
        c1.retirer(2000);
        c1.afficherCompteInfo();

        c2.afficherCompteInfo();
        c2.retirer(1500);
        c2.deposer(100);
        c2.afficherCompteInfo();
        
        c3.afficherCompteInfo();
        c3.retirer(200);
        c3.afficherCompteInfo();
        
        c4.afficherCompteInfo();
        c4.retirer(900);
        c4.afficherCompteInfo();

        Compte.afficherNbComptes();
    }
}
