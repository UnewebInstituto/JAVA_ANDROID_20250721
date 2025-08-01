/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenamientojavaapi;

import java.util.Arrays;

/**
 *
 * @author Dell
 */
public class OrdenamientoJavaAPI {

    public static void main(String[] args) {
        System.out.println("Ejemplo de Ordenamiento basado en API de Java");
        
        int[] numeros = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Arreglo original: " + Arrays.toString(numeros));

        Arrays.sort(numeros); // ¡Ordena el arreglo!

        System.out.println("Arreglo ordenado con Arrays.sort(): " + Arrays.toString(numeros));

        String[] nombres = {"Juan", "Ana", "Carlos", "Betty"};
        System.out.println("Nombres originales: " + Arrays.toString(nombres));
        Arrays.sort(nombres); // También funciona con Strings (orden alfabético)
        System.out.println("Nombres ordenados: " + Arrays.toString(nombres));
        
    }
}
