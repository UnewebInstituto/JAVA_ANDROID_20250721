/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.expresioneslogicas;

/**
 *
 * @author Dell
 */
public class ExpresionesLogicas {

    public static void main(String[] args) {
        System.out.println("Expresiones Lógicas");
        int num1 = 15;
        int num2 = 10;

        boolean esIgual = (num1 == num2);    // false
        boolean esDiferente = (num1 != num2); // true
        boolean esMayor = (num1 > num2);     // true
        boolean esMenor = (num1 < num2);     // false
        boolean esMayorIgual = (num1 >= num2); // true
        boolean esMenorIgual = (num1 <= num2); // false

        System.out.println("num1 == num2: " + esIgual);
        System.out.println("num1 != num2: " + esDiferente);
        System.out.println("num1 > num2: " + esMayor);
        System.out.println("num1 < num2: " + esMenor);
        System.out.println("num1 >= num2: " + esMayorIgual);
        System.out.println("num1 <= num2: " + esMenorIgual);
    }
}
