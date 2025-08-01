/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buclefor;

/**
 *
 * @author Dell
 */
public class BucleFor {

    public static void main(String[] args) {
        System.out.println("Ciclo For");
        // Imprimir números del 1 al 5
        System.out.println("Números del 1 al 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Sumar los primeros 10 números
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += i; // Equivalente a suma = suma + i;
        }
        System.out.println("La suma de los primeros 10 números es: " + suma);

        // Bucle for decreciente
        System.out.println("Cuenta regresiva:");
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

    }
}
