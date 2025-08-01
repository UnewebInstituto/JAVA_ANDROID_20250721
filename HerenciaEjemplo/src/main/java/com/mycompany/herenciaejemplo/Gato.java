/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaejemplo;

/**
 *
 * @author Dell
 */
public class Gato extends Animal{
    boolean tieneGarrasRetractiles;

    public Gato(String nombre, int edad, boolean tieneGarrasRetractiles) {
        super(nombre, edad);
        this.tieneGarrasRetractiles = tieneGarrasRetractiles;
    }

    public void maullar() {
        System.out.println(nombre + " está maullando: ¡Miau miau!");
    }

    @Override
    public void mostrarInfoAnimal() {
        super.mostrarInfoAnimal();
        System.out.println("¿Tiene garras retráctiles? " + (tieneGarrasRetractiles ? "Sí" : "No"));
    }

}
