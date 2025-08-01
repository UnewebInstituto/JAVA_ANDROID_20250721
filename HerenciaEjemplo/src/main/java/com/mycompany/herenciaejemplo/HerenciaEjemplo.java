/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herenciaejemplo;

/**
 *
 * @author Dell
 */
public class HerenciaEjemplo {

    public static void main(String[] args) {
        System.out.println("Ejemplo de Herencia");
        
        Animal miAnimal = new Animal("Buddy", 5);
        miAnimal.comer();
        miAnimal.mostrarInfoAnimal();
        
        System.out.println("\n--- Perro ---");
        Perro miPerro = new Perro("Max", 3, "Labrador");
        miPerro.comer(); // Método heredado de Animal
        miPerro.ladrar(); // Método propio de Perro
        miPerro.mostrarInfoAnimal(); // Método sobreescrito en Perro
        
        System.out.println("\n--- Gato ---");
        Gato miGato = new Gato("Pelusa", 2, true);
        miGato.dormir(); // Método heredado de Animal
        miGato.maullar(); // Método propio de Gato
        miGato.mostrarInfoAnimal(); // Método sobreescrito en Gato
        
        // Polimorfismo en acción: Un objeto Perro tratado como Animal
        Animal otroAnimal = new Perro("Rocky", 4, "Bulldog");
        otroAnimal.comer(); // Llama al método comer de Animal
        otroAnimal.mostrarInfoAnimal(); // Llama al método sobreescrito de Perro (debido al polimorfismo)
        // otroAnimal.ladrar(); // ERROR: Un Animal no tiene método ladrar, aunque el objeto sea un Perro
        
    }
}
