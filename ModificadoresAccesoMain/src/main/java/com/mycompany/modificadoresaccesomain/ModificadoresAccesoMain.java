/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modificadoresaccesomain;

// Acceso al contenido de las clases definidas en el paquete com.ejemplo
import com.ejemplo.acceso.ClaseBase;
import com.ejemplo.acceso.ClaseEnMismoPaquete;

// Otra forma:
// import com.ejemplo.acceso.*;


/**
 *
 * @author Dell
 */
public class ModificadoresAccesoMain {

    public static void main(String[] args) {
        System.out.println("Ejemplo modificadores de acceso");
        
        ClaseBase cb = new ClaseBase();
        cb.accesoInterno(); // Demuestra acceso interno
        
        // Acceso a otra clase en el mismo paquete
        ClaseEnMismoPaquete cemp = new ClaseEnMismoPaquete();
        cemp.probarAcceso();
        
    }
    
}
