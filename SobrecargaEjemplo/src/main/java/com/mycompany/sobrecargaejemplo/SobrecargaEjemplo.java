/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sobrecargaejemplo;

/**
 *
 * @author Dell
 */
public class SobrecargaEjemplo {

    public static void main(String[] args) {
        System.out.println("Ejemplo de sobrecarga");
        
        Calculadora calc = new Calculadora();

        System.out.println("Suma de enteros: " + calc.sumar(5, 3));        // Llama a sumar(int, int)
        System.out.println("Suma de decimales: " + calc.sumar(2.5, 3.7)); // Llama a sumar(double, double)
        System.out.println("Suma de tres enteros: " + calc.sumar(1, 2, 3)); // Llama a sumar(int, int, int)
        
    }
}
