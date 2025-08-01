/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.accionesenjava;

/**
 *
 * @author Dell
 */
public class AccionesEnJava {

        // Método que no recibe parámetros y no devuelve valor
    public static void saludar() {
        System.out.println("¡Hola a todos!");
    }

    // Método que recibe un parámetro y no devuelve valor
    public static void imprimirMensaje(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
    }

    // Método que recibe varios parámetros y no devuelve valor
    public static void mostrarDatos(String nombre, int edad) {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
    
    public static void main(String[] args) {
        System.out.println("Acciones en Java");
        
        saludar(); // Llamada al método sin parámetros
        imprimirMensaje("Bienvenidos al curso de Java."); // Llamada al método con un parámetro
        mostrarDatos("Ana", 28); // Llamada al método con múltiples parámetros
        
    }
}
