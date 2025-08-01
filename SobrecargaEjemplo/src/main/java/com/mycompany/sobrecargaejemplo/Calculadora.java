/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sobrecargaejemplo;

/**
 *
 * @author Dell
 */
public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public double sumar(double a, double b) { // Mismo nombre, diferentes tipos de parámetros
        return a + b;
    }

    public int sumar(int a, int b, int c) { // Mismo nombre, diferente número de parámetros
        return a + b + c;
    }

    
    
}
