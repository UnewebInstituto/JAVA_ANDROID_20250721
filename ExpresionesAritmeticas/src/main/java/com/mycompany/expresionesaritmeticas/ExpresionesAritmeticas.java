/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.expresionesaritmeticas;

/**
 *
 * @author Dell
 */
public class ExpresionesAritmeticas {

    public static void main(String[] args) {
        System.out.println("EXpresiones Aritméticas");
                int a = 10;
        int b = 3;

        int suma = a + b;       // 13
        int resta = a - b;      // 7
        int multiplicacion = a * b; // 30
        int division = a / b;   // 3 (división entera, el resto se ignora)
        int modulo = a % b;     // 1 (el resto de 10 dividido por 3 es 1)

        double x = 10.0;
        double y = 3.0;
        double divisionDecimal = x / y; // 3.3333333333333335

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División entera: " + division);
        System.out.println("Módulo: " + modulo);
        System.out.println("División decimal: " + divisionDecimal);

        // Operadores de incremento y decremento
        int contador = 5;
        contador++; // contador ahora es 6 (incremento post-fijo)
        System.out.println("Contador después de ++: " + contador);
        ++contador; // contador ahora es 7 (incremento pre-fijo)
        System.out.println("Contador después de ++ (pre-fijo): " + contador);

        int numero = 10;
        int resultado1 = ++numero; // numero es 11, resultado1 es 11 (primero incrementa, luego asigna)
        System.out.println("Resultado1: " + resultado1 + ", Número: " + numero);

        numero = 10;
        int resultado2 = numero++; // resultado2 es 10, numero es 11 (primero asigna, luego incrementa)
        System.out.println("Resultado2: " + resultado2 + ", Número: " + numero);

    }
}
