
public class Exercice2 {
    public static void afficherConjugaison(String verbe) {
        if (verbe.endsWith("er")) {
            String verbeWoEr = verbe.substring(0, verbe.length() - 2);
            String [][]pronomComb = {
                {"je", "e"},
                {"tu", "es"},
                {"il", "e"},
                {"nous", "ons"},
                {"vous", "ez"},
                {"ils", "ent"},
            };

            for (String []ele : pronomComb) {
                System.out.println(ele[0] + " " + verbeWoEr + ele[1]);
            }
        }else {
            
        }
        
    }

    public static void main(String[] args) {
        afficherConjugaison("chanter");
        afficherConjugaison("chant");
    }
}
