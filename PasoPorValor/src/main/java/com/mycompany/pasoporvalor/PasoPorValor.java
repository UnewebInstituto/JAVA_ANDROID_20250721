/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pasoporvalor;

/**
 *
 * @author Dell
 */
public class PasoPorValor {

    public static void incrementar(int numero) {
        System.out.println("Dentro del método (antes): " + numero);
        numero = numero + 10; // Se modifica la COPIA del valor
        System.out.println("Dentro del método (después): " + numero);
    }
    
    public static void main(String[] args) {
        System.out.println("Ejemplo Pase de parámetro por valor ");
        
        int miEntero = 5;
        System.out.println("Antes de llamar al método: " + miEntero); // 5

        incrementar(miEntero); // Pasamos una COPIA de miEntero

        System.out.println("Después de llamar al método: " + miEntero); // Sigue siendo 5
        
        
    }
}
