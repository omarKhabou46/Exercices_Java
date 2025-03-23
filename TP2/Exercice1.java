import java.util.Arrays;
import java.util.Scanner;

public class Exercice1 {

    // calculer la note moyenne
    public static float calculerMoyenne(float []notes) {
        float moyenne = 0;
        for (float ele: notes) {
            moyenne += ele;
        }
        return moyenne / notes.length;
    }

    public static int nbEtudiantsEqVal(float []notes, float val){
        int count = 0;
        for (float ele : notes) {
            if (ele == val) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("donnee le nombre d'etudiant : ");
        int nbEtudiants = scan.nextInt();
        float []notes = new float[nbEtudiants];
        for (int i = 0; i < nbEtudiants; i++) {
            System.out.print("Etudiant " + (i + 1) + " : ");
            notes[i] = scan.nextInt();
        }

        // triez la liste des notes
        Arrays.sort(notes);
        
        // calculer la note moyenne
        float moyenne = calculerMoyenne(notes);
        System.out.println("la moyenne est : "+ moyenne);
        
        // afficher le max et le min 
        float max, min;
        max = min = notes[0];
        for(float ele : notes) {
            if (ele > max) {
                max = ele;
            } else if (ele < min) {
                min = ele;
            }
        }
        System.out.println("le max est : " + max);
        System.out.println("le min est : " + min);

        // le nombre d’étudiants ayant une note saisie par l’utilisateur.
        System.out.print("saisie la valeur : ");
        int val = scan.nextInt();
        int countElement = nbEtudiantsEqVal(notes, val);
        System.out.println("le d'etudiant ayant la note "+ val + " est : " + countElement);
    }
}