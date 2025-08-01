/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglosunidimensionales;

/**
 *
 * @author Dell
 */
public class ArreglosUnidimensionales {

    public static void main(String[] args) {
        System.out.println("Ejemplo de arreglos unidimensionales");
        // Declarar e inicializar un arreglo de enteros
        int[] numeros = new int[5]; // Un arreglo para 5 enteros

        // Asignar valores a los elementos
        numeros[0] = 10; // Primer elemento (índice 0)
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50; // Último elemento (índice 4)

        // Acceder e imprimir elementos
        System.out.println("Elemento en índice 0: " + numeros[0]); // Salida: 10
        System.out.println("Elemento en índice 3: " + numeros[3]); // Salida: 40

        // Longitud del arreglo
        System.out.println("Longitud del arreglo: " + numeros.length); // Salida: 5

        // Recorrer el arreglo con un bucle for
        System.out.println("Todos los elementos del arreglo:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }

        // Declarar e inicializar un arreglo de Strings directamente
        String[] frutas = {"Manzana", "Banana", "Cereza", "Durazno"};
        System.out.println("\nFrutas en el arreglo:");
        for (String fruta : frutas) { // Bucle for-each (simplificado para colecciones)
            System.out.println(fruta);
        }
    }
}
