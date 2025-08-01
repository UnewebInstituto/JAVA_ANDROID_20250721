/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persona;

/**
 *
 * @author Dell
 */
public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        //this.edad = edad;
        // Uso del setter en el constructor para aprovechar la validación
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        //this.nombre = nombre;
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacío.");
        }
    }

    public void setEdad(int edad) {
        //this.edad = edad;
        if (edad >= 0 && edad <= 120) { // Lógica de validación
            this.edad = edad;
        } else {
            System.out.println("Error: La edad debe estar entre 0 y 120.");
        }
    }
    
    public void presentarse() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }
    
    public static void main(String[] args) {
        System.out.println("Ejemplo de encapsulamiento");
        
        Persona p1 = new Persona("Ana", 30);
        p1.presentarse();

        // Acceso directo a atributos privados NO es posible:
        // p1.nombre = "Pedro"; // Error de compilación

        // Acceso y modificación a través de getters y setters
        System.out.println("Nombre de p1: " + p1.getNombre());
        p1.setEdad(31); // Modificación válida
        p1.presentarse();

        p1.setEdad(150); // Modificación inválida, la edad no cambia debido a la validación
        p1.presentarse();

        p1.setNombre(""); // Modificación inválida
        p1.presentarse();

        Persona p2 = new Persona("Luis", -5); // La edad se validará en el constructor
        p2.presentarse(); // La edad de Luis seguirá siendo 0 o el valor por defecto si no se validara en el constructor
        
    }
}
