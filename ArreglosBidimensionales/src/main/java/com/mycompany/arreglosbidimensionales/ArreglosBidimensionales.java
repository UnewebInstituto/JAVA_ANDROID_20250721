/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglosbidimensionales;

/**
 *
 * @author Dell
 */
public class ArreglosBidimensionales {

    public static void main(String[] args) {
        System.out.println("Ejemplo declaración de arreglos bidimensioanles");
        // Declarar e inicializar una matriz 3x3
        int[][] matriz = new int[3][3];

        // Asignar valores a la matriz
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        // O inicialización directa
        int[][] matrizNumeros = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        // Acceder a un elemento específico
        System.out.println("Elemento en (0,0): " + matriz[0][0]); // 1
        System.out.println("Elemento en (1,2): " + matriz[1][2]); // 6

        System.out.println("Elemento en matrizNumero (1,1): " + matrizNumeros[1][1]); // 50
    }
}
