/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismoejemplo;

/**
 *
 * @author Dell
 */
public class PolimorfismoEjemplo {

    public static void main(String[] args) {
        System.out.println("Ejemplo de Polimorfismo");
        
        Vehiculo v1 = new Vehiculo();
        Vehiculo v2 = new Carro(); // Objeto Carro, referencia Vehiculo
        Vehiculo v3 = new Avion();  // Objeto Avion, referencia Vehiculo

        v1.mover(); // Llama a mover() de Vehiculo
        v2.mover(); // Llama a mover() de Carro (polimorfismo en acción)
        v3.mover(); // Llama a mover() de Avion (polimorfismo en acción)

        // Otro ejemplo de polimorfismo con un arreglo
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Carro();
        vehiculos[1] = new Avion();
        vehiculos[2] = new Vehiculo();

        System.out.println("\nIterando sobre un arreglo de Vehiculos:");
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mover(); // El método que se invoca depende del tipo real del objeto
        }
    }
}
