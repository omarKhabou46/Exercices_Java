public class GestionBibliotheque {
    static void afficherEmp(boolean emp, String nom) {
        if(emp) {
            System.out.println("emprunter par " + nom);
        }else {
            System.out.println(nom + " vous ne pouvez pas emprunter");
        }
    }
    public static void main(String[] args) {
        Empruntable livre1 = new Livre("mohamed", "css", true);
        Empruntable livre2 = new Livre("mohamed", "js", false);
        Empruntable livre3 = new Livre("mohamed", "react", true);
        Empruntable dvd1 = new Dvd("omar", "dvd1", true);
        Empruntable dvd2 = new Dvd("omar", "dvd2", false);
        Empruntable dvd3 = new Dvd("omar", "dvd3", false);
        Utilisateur user1 = new Utilisateur("lemane");
        Utilisateur user2 = new Utilisateur("boggyman");    
    

        afficherEmp(user1.emprunterObjet(livre1), user1.getNom());
        afficherEmp(user1.emprunterObjet(livre2), user1.getNom());

        afficherEmp(user2.emprunterObjet(livre3), user2.getNom());
        afficherEmp(user1.emprunterObjet(dvd1), user1.getNom());
        afficherEmp(user2.emprunterObjet(dvd2), user2.getNom());
        afficherEmp(user1.emprunterObjet(dvd1), user1.getNom());
    }
    
}
