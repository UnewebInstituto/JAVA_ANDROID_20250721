/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recorridomatriz;

/**
 *
 * @author Dell
 */
public class RecorridoMatriz {

    public static void main(String[] args) {
        System.out.println("Ejemplo recorrido de Matriz");
                int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Contenido de la matriz:");
        // Recorrido por filas
        for (int i = 0; i < matriz.length; i++) { // Bucle para las filas (matriz.length da el número de filas)
            for (int j = 0; j < matriz[i].length; j++) { // Bucle para las columnas (matriz[i].length da el número de columnas en la fila i)
                System.out.print(matriz[i][j] + "\t"); // Imprime el elemento y un tabulador
            }
            System.out.println(); // Salto de línea al final de cada fila
        }

        // Ejemplo: Sumar todos los elementos de la matriz
        int sumaTotal = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaTotal += matriz[i][j];
            }
        }
        System.out.println("\nLa suma de todos los elementos es: " + sumaTotal);

        // Recorrido para imprimir la diagonal principal
        System.out.println("\nDiagonal Principal:");
        int sumaDiagonalPrincipal = 0;
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + "\t");
            // sumaDiagonalPrincipal = sumaDiagonalPrincipal +  matriz[i][i];
            // Equivalente a la anterior
            sumaDiagonalPrincipal += matriz[i][i];
        }
        System.out.println();
        System.out.println("\nLa suma de elementos diagonal principal: " + sumaDiagonalPrincipal);
    }
}
