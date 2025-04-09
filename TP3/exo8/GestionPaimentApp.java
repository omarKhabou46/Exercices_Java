public class GestionPaimentApp {
    static void affichierProcessP(boolean p) {
        if (p) {
            System.out.println("le paiment a ete effectuer avec succee");
        }else {
            System.out.println("le paiment a echoue");
        }
    }
    public static void main(String[] args) {
        
        Paiment p1  = new CarteCredit(20000, 4100002, "123456789");
        Paiment p2  = new PayPal(40000, 000000, "om@ex.com");
        Paiment p3  = new PayPal(0, 1233215, "le@ex.com");
        
        Commande cmd1 = new Commande(10000, p1);
        Commande cmd2 = new Commande(5000, p2);
        Commande cmd3 = new Commande(1, p3);
  

        affichierProcessP(cmd1.processPaiment());
        affichierProcessP(cmd2.processPaiment());
        affichierProcessP(cmd3.processPaiment());
       

    }
}
