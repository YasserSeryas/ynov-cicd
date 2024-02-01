package com.example.demo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestPersonne {

    @Test
    public void testHello() {
        // Créer une instance de Personne
        Personne personne = new Personne("Doe", "John");

        // Appeler la méthode hello et vérifier le résultat
        String message = personne.hello();

        // Vérifier si le message est correct
        assertEquals("Bonjour, je m'appelle John Doe.", message);
    }

    @Test
    public void testGettersAndSetters() {
        // Créer une instance de Personne
        Personne personne = new Personne("Doe", "John");

        // Vérifier les getters
        assertEquals("Doe", personne.getNom());
        assertEquals("John", personne.getPrenom());

        // Utiliser les setters
        personne.setNom("Smith");
        personne.setPrenom("Jane");

        // Vérifier les valeurs après modification
        assertEquals("Smith", personne.getNom());
        assertEquals("Jane", personne.getPrenom());
    }
}
