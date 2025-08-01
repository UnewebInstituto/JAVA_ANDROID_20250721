/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ifanidado;

/**
 *
 * @author Dell
 */
public class IfAnidado {

    public static void main(String[] args) {
        System.out.println("Condicional Anidado");
        int puntuacion = 85;
        char grado;

        if (puntuacion >= 90) {
            grado = 'A';
        } else if (puntuacion >= 80) {
            grado = 'B';
        } else if (puntuacion >= 70) {
            grado = 'C';
        } else if (puntuacion >= 60) {
            grado = 'D';
        } else {
            grado = 'F';
        }
        System.out.println("Tu calificación es: " + grado);

    }
}
