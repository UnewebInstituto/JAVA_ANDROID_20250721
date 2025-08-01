/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cocheconconstructor;

/**
 *
 * @author Dell
 */
public class CocheConConstructor {
    // atributos 
    String marca;
    String modelo;
    int anio;
    String color;
    double velocidadActual;
    
    // métodos 
        // Constructor sin parámetros (constructor por defecto, si no se define otro)
    public CocheConConstructor() {
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
        this.anio = 2000;
        this.color = "Blanco";
        this.velocidadActual = 0.0;
        System.out.println("Se ha creado un coche con valores por defecto.");
    }
    
    // Constructor con parámetros
    public CocheConConstructor(String marca, String modelo, int anio, String color, double velocidad) {
        // 'this' se usa para diferenciar entre el atributo de la clase y el parámetro del constructor
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.velocidadActual = velocidad; // Velocidad inicial siempre 0
        System.out.println("Se ha creado un coche: " + marca + " " + modelo);
    }
    
    // Constructor con algunos parámetros y llamando a otro constructor (this())
    public CocheConConstructor(String marca, String modelo) {
        this(marca, modelo, 2023, "Negro", 0); // Llama al constructor con 4 parámetros
        System.out.println("Se ha creado un coche (versión simplificada): " + marca + " " + modelo);
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
        System.out.println("Ejemplo de instancia de clase empleando constructores");
        
        // Usando el constructor con parámetros
        CocheConConstructor miCoche = new CocheConConstructor("Ford", "Fiesta", 2021, "Rojo", 100);
        miCoche.mostrarInfo();
        
        // Usando el constructor sin parámetros
        CocheConConstructor cochePorDefecto = new CocheConConstructor();
        cochePorDefecto.mostrarInfo();
        
        // Usando el constructor con 2 parámetros
        CocheConConstructor cocheRapido = new CocheConConstructor("Ferrari", "SF90");
        cocheRapido.mostrarInfo();
        
    }
}
