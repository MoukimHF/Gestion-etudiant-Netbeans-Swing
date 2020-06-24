
package dossier;
 
public class Etudiant {
    private String nom; 
    private String prenom;
    private int age;
    private int cin;
    private static int id;

    public Etudiant(String nom, String prenom, int age, int cin) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.cin = cin;
        id++;
    }
    
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public int getId() {
        return id;
    }

    
    
}
