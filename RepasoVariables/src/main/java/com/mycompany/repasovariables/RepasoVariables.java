/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repasovariables;

/**
 *
 * @author Dell
 */
public class RepasoVariables {

    public static void main(String[] args) {
        System.out.println("Repaso de declaración de variables");
        // Declaración e inicialización de variables
        int edad = 30; // Un número entero
        double precio = 19.99; // Un número decimal
        char inicial = 'J'; // Un solo carácter
        boolean esEstudiante = true; // Un valor booleano (verdadero/falso)
        String nombre = "Juan Pérez"; // Una cadena de texto (tipo de referencia)

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Precio: " + precio);
        System.out.println("Inicial: " + inicial);
        System.out.println("Es estudiante: " + esEstudiante);

        // Modificando el valor de una variable
        edad = edad + 1; // Incrementamos la edad
        precio = 25.50; // Cambiamos el precio

        System.out.println("Nueva edad: " + edad);
        System.out.println("Nuevo precio: " + precio);
        
    }
}
