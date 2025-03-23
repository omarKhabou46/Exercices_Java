import java.util.Scanner;
import java.util.Arrays;

public class Exercice4 {

    public static int occurence(String s, String[] tab) {
        int count = 0;
        for (int i = 0; i < tab.length; i++) {
            if (s.equals(tab[i])) {
                count++;
            }
        }
        return count;
    }

    // Comptez le nombre total de caractères (sans les espaces) dans le texte.

    public static int countLetters(String chaine) {
        int countLetters = 0;
        for (int i = 0; i < chaine.length(); i++) {
            if (chaine.charAt(i) != ' ') {
                countLetters++;
            }
        }
        return countLetters;
    }

    // Inverser chaque mot individuellement dans la chaîne tout en gardant leur
    // ordre initial dans le texte.

    public static String inverserChaine(String chaine) {
        String[] arrayStrings = chaine.split(" ");
        for (int i = 0; i < arrayStrings.length; i++) {
            String s = "";
            for (int j = arrayStrings[i].length() - 1; j >= 0; j--) {
                s += arrayStrings[i].charAt(j);
            }
            arrayStrings[i] = s;
        }
        return String.join(" ", arrayStrings);
    }

    // Remplacez tous les espaces dans le texte par des tirets -.

    public static String replaceCaractere(String chaine) {
        String newChaine = "";
        for (int i = 0; i < chaine.length(); i++) {
            if (chaine.charAt(i) == ' ') {
                newChaine += '-';
            } else {
                newChaine += chaine.charAt(i);
            }
        }
        return newChaine;
    }

    // Compressez tous les espaces multiples du texte pour qu'il ne reste qu'un seul
    // espace entre les mots.

    public static String compresserEspace(String chaine) {
        String[] tabString = chaine.split("\\s+");
        return String.join(" ", tabString);
    }

    // Identifiez les trois mots les plus fréquents dans le texte et remplacez-les
    // par le mot "REMPLACE".
    public static void plusFrequent(String chaine) {
        String[] arrayString = chaine.split(" ");
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        int i = 0;
        int j = 0;
        for (String ele: arrayString) {
            int occ = occurence(ele, arrayString);
            if (occ >= max1) {
                if (i > 0) {
                    max3 = max2;
                    max2 = max1;
                    // motsPlusFrequent3 = motsPlusFrequent2;
                    // motsPlusFrequent2 = motsPlusFrequent1;
                }
                max1 = occ; 
                // motsPlusFrequent1 = ele;
                i++;
            }else if (occ >= max2) {
                if (j > 0) {
                    max3 = max2;
                }
                max2 = occ;
                j++;
                // motsPlusFrequent2 = ele;
            }else if (occ >= max3) {
                max3 = occ;
            }
        } 
        
        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);
        // return "";
    }


    public static void mainFunction(String chaine) {
        // Comptez le nombre total de caractères (sans les espaces) dans le texte.

        System.out.println("le nombre de lettres est : " + countLetters(chaine));

        // Inverser chaque mot individuellement dans la chaîne tout en gardant leur
        // ordre initial dans le texte.

        System.out.println("new chaine : " + inverserChaine(chaine));

        // Remplacez tous les espaces dans le texte par des tirets -.

        System.out.println("new chaine : " + replaceCaractere(chaine));

        // Compressez tous les espaces multiples du texte pour qu'il ne reste qu'un seul
        // espace entre les mots.
        System.out.println("new Chaine : " + compresserEspace(chaine));

        // Identifiez les trois mots les plus fréquents dans le texte et remplacez-les
        // par le mot "REMPLACE".

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("ecrivez une chaine : ");
        String chaine = scan.nextLine();
        // mainFunction(chaine);
        plusFrequent(chaine);
    }
}
