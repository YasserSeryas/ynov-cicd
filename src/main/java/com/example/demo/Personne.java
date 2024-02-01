package com.example.demo;

public class Personne {

    private String nom;
    private String prenom;

    // Constructeur
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Méthode hello
    public String hello() {
        return "Bonjour, je m'appelle " + prenom + " " + nom + ".";
    }

    // Getters and setters (facultatifs, mais souvent utiles)
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

    public static void main(String[] args) {
        // Exemple d'utilisation
        Personne personne = new Personne("Doe", "John");
        System.out.println(personne.hello());
    }
}
