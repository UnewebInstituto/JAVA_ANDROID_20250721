/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pasoporreferencia;

/**
 *
 * @author Dell
 */
public class PasoPorReferencia {
   
    // Método que modifica un arreglo (un objeto)
    public static void modificarArreglo(int[] arr) {
        System.out.println("Dentro del método (antes): arr[0] = " + arr[0]);
        arr[0] = 99; // Modifica el elemento del arreglo original
        System.out.println("Dentro del método (después): arr[0] = " + arr[0]);
    }

    // Clase simple para demostrar el paso por referencia con un objeto personalizado
    static class Persona {
        // atributo
        String nombre;
        
        // método constructor
        Persona(String nombre) {
            this.nombre = nombre;
        }
    }
    
    public static void cambiarNombre(Persona p) {
        System.out.println("Dentro del método (antes): " + p.nombre);
        p.nombre = "Pedro"; // Modifica la propiedad del objeto original
        System.out.println("Dentro del método (después): " + p.nombre);
    }
    
    public static void intentarReasignar(Persona p) {
        p = new Persona("Nuevo Nombre"); // Esto crea un NUEVO objeto y 'p' apunta a él,
                                        // pero no cambia el objeto al que 'ana' apunta en main.
        System.out.println("Dentro de reasignar (después): " + p.nombre); // Nuevo Nombre
    }
    
    public static void main(String[] args) {
        System.out.println("Ejemplo pase de parámetros por referencia");
        
        // Ejemplo con arreglo
        int[] miArreglo = {1, 2, 3};
        System.out.println("Antes de llamar al método (arreglo): miArreglo[0] = " + miArreglo[0]); // 1
        modificarArreglo(miArreglo); // Pasamos la referencia del arreglo
        System.out.println("Después de llamar al método (arreglo): miArreglo[0] = " + miArreglo[0]); // 99

        System.out.println("--------------------");
        
        // Ejemplo con objeto personalizado
        Persona juan = new Persona("Juan");
        System.out.println("Antes de llamar al método (persona): " + juan.nombre); // Juan
        
        cambiarNombre(juan); // Pasamos la referencia del objeto Persona
        System.out.println("Después de llamar al método (persona): " + juan.nombre); // Pedro
        
        // Importante: No puedes reasignar la referencia a un nuevo objeto y esperar que el original cambie
        Persona ana = new Persona("Ana");
        System.out.println("Antes de intentar reasignar: " + ana.nombre); // Ana
        intentarReasignar(ana);
        System.out.println("Después de intentar reasignar: " + ana.nombre); // Sigue siendo Ana
        
    }
}
