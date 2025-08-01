/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiposdedatos;

/**
 *
 * @author Dell
 */
public class TiposDeDatos {

    public static void main(String[] args) {
        System.out.println("Tipos de Datos");
                // Tipos de datos primitivos
        byte edadPersona = 25;
        short distanciaMetros = 1500;
        int poblacionCiudad = 1000000;
        long numeroCuentaGrande = 123456789012345L; // 'L' para indicar que es un long

        float temperatura = 23.5f; // 'f' para indicar que es un float
        double piExacto = 3.14159265359;

        char letra = 'A';
        boolean estaActivo = true;

        System.out.println("byte: " + edadPersona);
        System.out.println("short: " + distanciaMetros);
        System.out.println("int: " + poblacionCiudad);
        System.out.println("long: " + numeroCuentaGrande);
        System.out.println("float: " + temperatura);
        System.out.println("double: " + piExacto);
        System.out.println("char: " + letra);
        System.out.println("boolean: " + estaActivo);

        // Tipo de dato de referencia (String)
        String mensaje = "Hola, mundo desde Java!";
        System.out.println("String: " + mensaje);

    }
}
