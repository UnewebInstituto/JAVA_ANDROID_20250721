/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bubblesort;

import java.util.Arrays; // Utilidad para imprimir arreglos fácilmente

/**
 *
 * @author Dell
 */
public class BubbleSort {

    public static void main(String[] args) {
        System.out.println("Ejemplo de ordenamiento de arreglos por el método de la Burbuja");
        
        int[] numeros = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Arreglo original: " + Arrays.toString(numeros));

        int n = numeros.length;
        // Bucle externo para pases
        for (int i = 0; i < n - 1; i++) {
            // Bucle interno para comparaciones e intercambios
            for (int j = 0; j < n - i - 1; j++) {
                // Si el elemento actual es mayor que el siguiente, intercámbiarlos
                if (numeros[j] < numeros[j + 1]) {
                    // Intercambio
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));

    }
}
