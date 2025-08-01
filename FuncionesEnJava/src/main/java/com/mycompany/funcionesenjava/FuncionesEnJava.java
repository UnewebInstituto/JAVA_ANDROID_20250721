/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funcionesenjava;

/**
 *
 * @author Dell
 */
public class FuncionesEnJava {
    
    // Función que suma dos números enteros y devuelve un entero
    public static int sumar(int a, int b) {
        int resultado = a + b;
        return resultado; // Retorna el valor de la suma
    }

    // Función que calcula el área de un círculo y devuelve un double
    public static double calcularAreaCirculo(double radio) {
        final double PI = 3.14159;
        double area = PI * radio * radio;
        return area; // Retorna el área calculada
    }

    // Función que verifica si un número es par y devuelve un booleano
    public static boolean esPar(int numero) {
        return numero % 2 == 0; // Retorna true si es par, false si es impar
    }

    public static void main(String[] args) {
        System.out.println("Ejemplo de funciones en Java");
        
        int num1 = 10;
        int num2 = 5;
        int sumaNumeros = sumar(num1, num2); // Llamada a la función y guardamos el resultado
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + sumaNumeros);

        double radioCirculo = 7.5;
        double areaCalculada = calcularAreaCirculo(radioCirculo);
        System.out.println("El área de un círculo con radio " + radioCirculo + " es: " + areaCalculada);

        int miNumero = 3;
        if (esPar(miNumero)) { // Llamada a la función en una condición
            System.out.println(miNumero + " es un número par.");
        } else {
            System.out.println(miNumero + " es un número impar.");
        }
    }
}
