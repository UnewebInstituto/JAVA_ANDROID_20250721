/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.acceso;

/**
 *
 * @author Dell
 */
public class ClaseEnMismoPaquete {
        public void probarAcceso() {
        ClaseBase cb = new ClaseBase();
        System.out.println("\nAcceso desde ClaseEnMismoPaquete:");
        System.out.println(cb.atributoPublico);
        System.out.println(cb.atributoProtegido);
        System.out.println(cb.atributoDefault);
        // System.out.println(cb.atributoPrivado); // ERROR: private
        cb.metodoPublico();
        cb.metodoProtegido();
        cb.metodoDefault();
        // cb.metodoPrivado(); // ERROR: private
        
        // Acceso desde la clase Main (que está en el mismo paquete aquí)
        System.out.println("\nAcceso desde la clase Main (en el mismo paquete):");
        System.out.println(cb.atributoPublico);
        System.out.println(cb.atributoProtegido);
        System.out.println(cb.atributoDefault);
        // System.out.println(cb.atributoPrivado); // ERROR DE COMPILACIÓN: atributoPrivado tiene acceso privado en ClaseBase

        cb.metodoPublico();
        cb.metodoProtegido();
        cb.metodoDefault();
        //cb.metodoPrivado(); // ERROR DE COMPILACIÓN: metodoPrivado tiene acceso privado en ClaseBase
    }
}
