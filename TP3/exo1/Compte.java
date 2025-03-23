package exo1;
public class Compte {
    private String numero;
    private double solde;
    private static int nbCompte = 0;


    public Compte() {
        this.numero = "";
        this.solde = 0;
        this.nbCompte++;
    }

    public Compte(String n, double s) {
        this();
        this.numero = n;
        this.solde = s;
    }

    public void setNumero(String n) {
            this.numero = n;
    }

    public String getNumero() {
        return this.numero;
    }
    public void setSolde(double s) {
            this.solde = s;
    }

    public double getSolde() {
        return this.solde;
    }

    public void deposer(double montant) {
        this.solde += montant;
    }

    public void retirer(double montant) {
        if (montant > this.solde  && montant > 0) {
            System.out.println("votre solde est insuffisant");
        }else {
            this.solde -= montant;
        }
    }

    public void afficherCompteInfo() {
        System.out.println("votre numero de compte est : "+this.numero+" et votre solde est : "+this.solde);
    }
   
    public static void afficherNbComptes() {
        System.out.println("le nombre de comptes est : "+nbCompte);
    }
}