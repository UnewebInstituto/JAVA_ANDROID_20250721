/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bucledowhile;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class BucleDoWhile {

    public static void main(String[] args) {
        System.out.println("Bucle DoWhile");
        // Ejemplo: Pedir una contraseña hasta que sea correcta
        Scanner scanner = new Scanner(System.in);
        String contrasena;
        final String CONTRASENA_CORRECTA = "secreta123";

        do {
            System.out.print("Introduce la contraseña: ");
            contrasena = scanner.nextLine(); // Leer la línea completa

            if (!contrasena.equals(CONTRASENA_CORRECTA)) {
                System.out.println("Contraseña incorrecta. Inténtalo de nuevo.");
            }

        } while (!contrasena.equals(CONTRASENA_CORRECTA)); // La condición se evalúa al final

        System.out.println("¡Contraseña correcta! Acceso concedido.");
        scanner.close();

    }
}
