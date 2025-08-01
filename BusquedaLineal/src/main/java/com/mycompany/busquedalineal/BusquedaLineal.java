/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.busquedalineal;

/**
 *
 * @author Dell
 */
public class BusquedaLineal {

    public static void main(String[] args) {
        System.out.println("Ejemplo búsqueda en arreglos de forma lineal");
        int[] numeros = {5, 12, 3, 8, 15, 1};
        
        int valorBuscado = 8;
        int posicion = -1; // -1 indica que no se encontró

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valorBuscado) {
                posicion = i;
                break; // Se encontró, salimos del bucle
            }
        }

        if (posicion != -1) {
            System.out.println("El valor " + valorBuscado + " se encontró en la posición: " + posicion);
        } else {
            System.out.println("El valor " + valorBuscado + " no se encontró en el arreglo.");
        }
       
        
    }
    
}
