/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaejemplo;

/**
 *
 * @author Dell
 */
public class Perro extends Animal{
    String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad); // Llama al constructor de la superclase Animal
        this.raza = raza;
    }

    // Nuevo método específico de Perro
    public void ladrar() {
        System.out.println(nombre + " está ladrando: ¡Guau guau!");
    }

    // Sobreescritura de un método de la superclase (Polimorfismo)
    @Override
    public void mostrarInfoAnimal() {
        super.mostrarInfoAnimal(); // Llama al método de la superclase
        System.out.println("Raza: " + raza);
    }

}
