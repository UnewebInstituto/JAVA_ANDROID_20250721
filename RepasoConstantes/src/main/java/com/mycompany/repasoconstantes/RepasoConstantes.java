/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repasoconstantes;

/**
 *
 * @author Dell
 */
public class RepasoConstantes {

    public static void main(String[] args) {
        System.out.println("Repaso de Constantes");
                final double PI = 3.14159; // Constante para Pi
        final int VELOCIDAD_LUZ_KM_S = 299792; // Constante para la velocidad de la luz

        System.out.println("El valor de PI es: " + PI);
        System.out.println("La velocidad de la luz es: " + VELOCIDAD_LUZ_KM_S + " km/s");

        // PI = 3.14; // Esto generaría un error de compilación: "cannot assign a value to final variable PI"
    }
}
