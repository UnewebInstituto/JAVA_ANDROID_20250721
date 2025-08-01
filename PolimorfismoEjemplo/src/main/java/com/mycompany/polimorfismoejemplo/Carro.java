/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismoejemplo;

/**
 *
 * @author Dell
 */
public class Carro extends Vehiculo{
    @Override // Anotación para indicar sobreescritura
    public void mover() {
        System.out.println("El carro se desplaza sobre ruedas.");
    }
}
