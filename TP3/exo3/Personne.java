package exo2;

public class Personne {
    private String nom;
    private String prenom;
    private String email;
    private int age;

    public Personne(String nom, String prenom, String email, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.age = age;
    }


    @Override 
    public String toString() {
        return  "le nom est : " + this.nom + " le prenom est : "+ this.prenom + " l'age est : " + this.age + " votre email est : " + this.email; 
    }
    
}
