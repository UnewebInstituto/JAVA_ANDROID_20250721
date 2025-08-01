/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.acceso;

/**
 *
 * @author Dell
 */
public class ClaseBase {
    // atributos
    public String atributoPublico = "Soy público";
    protected String atributoProtegido = "Soy protegido";
    String atributoDefault = "Soy por defecto (package-private)";
    private String atributoPrivado = "Soy privado";
    
    public void metodoPublico() {
        System.out.println("Método público llamado.");
    }

    protected void metodoProtegido() {
        System.out.println("Método protegido llamado.");
    }

    void metodoDefault() {
        System.out.println("Método por defecto llamado.");
    }

    private void metodoPrivado() {
        System.out.println("Método privado llamado.");
    }

    public void accesoInterno() {
        System.out.println("Acceso desde dentro de ClaseBase:");
        System.out.println(atributoPublico);
        System.out.println(atributoProtegido);
        System.out.println(atributoDefault);
        System.out.println(atributoPrivado); // Puede acceder al propio privado
        metodoPrivado();
    }
    
}
