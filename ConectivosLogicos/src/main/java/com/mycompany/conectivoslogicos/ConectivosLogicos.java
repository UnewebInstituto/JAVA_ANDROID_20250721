/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conectivoslogicos;

/**
 *
 * @author Dell
 */
public class ConectivosLogicos {

    public static void main(String[] args) {
        System.out.println("Conectivos Lógicos");
                int edad = 20;
        double salario = 1500.0;
        boolean tieneLicencia = true;

        // AND lógico (&&)
        /*
        p    q  ->  p  &&  q
        v    v          v 
        v    F          f
        F    V          f
        F    F          f
        */
        // ¿Es mayor de edad Y tiene licencia?
        boolean puedeConducir = (edad >= 18) && tieneLicencia; // true && true = true
        System.out.println("Puede conducir (edad >= 18 && tieneLicencia): " + puedeConducir);

        // OR lógico (||)
        // Disyunción
        /*
        p    q  ->  p  ||  q
        v    v          v 
        v    F          v
        F    V          v
        F    F          f
        */
        // ¿Tiene salario alto O es joven?
        boolean cumpleRequisito = (salario > 2000) || (edad < 25); // false || true = true
        System.out.println("Cumple requisito (salario > 2000 || edad < 25): " + cumpleRequisito);

        // NOT lógico (!)
        // ¿No tiene licencia?
        boolean noTieneLicencia = !tieneLicencia; // !true = false
        System.out.println("No tiene licencia (!tieneLicencia): " + noTieneLicencia);

        // Combinación
        boolean condicionCompleja = (edad > 25 && salario > 1000) || (!tieneLicencia);
        // (false && true) || (false) -> false || false = false
        System.out.println("Condición compleja: " + condicionCompleja);

    }
}
