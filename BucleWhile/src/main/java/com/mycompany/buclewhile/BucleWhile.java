/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buclewhile;

/**
 *
 * @author Dell
 */

import java.util.Scanner;
public class BucleWhile {

    public static void main(String[] args) {
        System.out.println("Bucle While");
        // Ejemplo simple: Imprimir números del 1 al 5
        System.out.println("Números del 1 al 5 (con while):");
        int i = 1; // Inicialización fuera del bucle
        while (i <= 5) { // Condición
            System.out.println(i);
            i++; // Actualización dentro del bucle
        }
        
        // Ejemplo con entrada del usuario: Pedir número hasta que sea positivo
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Introduce un número positivo:");
        numero = scanner.nextInt();

        while (numero <= 0) {
            System.out.println("Error: El número debe ser positivo. Inténtalo de nuevo:");
            numero = scanner.nextInt();
        }
        System.out.println("Número positivo introducido: " + numero);

        scanner.close(); // Siempre cierra el scanner cuando no lo necesites más
      
    }
}
