/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coche;

/**
 *
 * @author Dell
 */
public class Coche {

    // Atributos (características)
    String marca;
    String modelo;
    int anio;
    String color;
    double velocidadActual;

    // Método (comportamiento)
    public void acelerar(double incremento) {
        velocidadActual += incremento;
        System.out.println("El coche " + marca + " " + modelo + " acelera. Velocidad actual: " + velocidadActual + " km/h");
    }

    public void frenar(double decremento) {
        velocidadActual -= decremento;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
        System.out.println("El coche " + marca + " " + modelo + " frena. Velocidad actual: " + velocidadActual + " km/h");
    }

    public void mostrarInfo() {
        System.out.println("--- Información del Coche ---");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Color: " + color);
        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
        System.out.println("---------------------------");
    }
    
    public static void main(String[] args) {
        System.out.println("Ejemplo definición clase Coche");
        
        // Creación de objetos (instancias de la clase Coche)
        Coche miCoche = new Coche(); // Objeto 1
        
        miCoche.marca = "Toyota";
        miCoche.modelo = "Corolla";
        miCoche.anio = 2020;
        miCoche.color = "Gris";
        miCoche.velocidadActual = 0.0;

        Coche cocheDeVecino = new Coche(); // Objeto 2
        
        cocheDeVecino.marca = "Honda";
        cocheDeVecino.modelo = "Civic";
        cocheDeVecino.anio = 2022;
        cocheDeVecino.color = "Azul";
        cocheDeVecino.velocidadActual = 20.0;

        // Interactuando con los objetos
        miCoche.mostrarInfo();
        miCoche.acelerar(50);
        miCoche.frenar(10);
        miCoche.mostrarInfo();

        System.out.println("\n--- Coche del Vecino ---");
        cocheDeVecino.mostrarInfo();
        cocheDeVecino.acelerar(30);
    }
}
