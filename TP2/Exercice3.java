import java.util.Scanner;

public class Exercice3 {
    public static void allModif(String chaine) {
        Scanner scan = new Scanner(System.in);
        // 1 creer un objet StringBuilder
        StringBuilder s = new StringBuilder(chaine);
        // 2 supprimez tous les espaces de la chaine
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                s.deleteCharAt(i);
            }
        }
        // Ajoutez à la fin de la chaîne le texte " est modifiée !". 
        s.append(" est modifiée !");
        System.out.println(s);
        // Inversez la chaîne modifiée. 
        s.reverse();
        // Affichez la première moitié de la chaîne modifiée. 
        System.out.println("la premiere moitie de la chaine modifiée est : " + s.substring(0, s.length()/2));

        /* Remplacez toutes les occurrences d'une lettre spécifique par une autre lettre 
        (demandez à l'utilisateur les lettres à remplacer).
        */
        System.out.print("ecrivez old letters : ");
        String oldlLetters = scan.next();
        System.out.print("ecrivez new letters : ");
        String newLetters = scan.next();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == oldlLetters.charAt(0)) {
                s.setCharAt(i, newLetters.charAt(0));
            }
        }
        System.out.println("new chaine : " + s);
        
        
        /*
        Insérez une sous-chaîne à une position spécifique dans la chaîne (demandez à 
        l'utilisateur la position et la sous-chaîne à insérer). 
        */
        System.out.print("ecrivez la postion : ");
        int pos = scan.nextInt();
        System.out.print("ecrivez la sous chaine a inserer : ");
        String sousChaine = scan.next();
        s.insert(pos, sousChaine);
        System.out.println("new chaine : " + s);

        /*
        Supprimez une partie de la chaîne en spécifiant une plage (demandez à 
        l'utilisateur les indices de début et de fin). 
        */
        System.out.print("donner la position de debut : ");
        int posStart = scan.nextInt();
        System.out.print("donner la position de end : ");
        int posEnd = scan.nextInt();
        s.delete(posStart, posEnd);
        System.out.println("new chaine : " + s);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("ecrivez une chaine : ");
        String chaine = scan.nextLine();
        allModif(chaine);
    }
}