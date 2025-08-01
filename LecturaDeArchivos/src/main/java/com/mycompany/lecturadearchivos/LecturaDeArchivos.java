/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lecturadearchivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Dell
 */
public class LecturaDeArchivos {

    public static void main(String[] args) {
        System.out.println("Ejemplo Lectura de Archovos");
        
                String nombreArchivo = "datos.txt"; // El archivo que creamos en el ejemplo anterior

        // Usando try-with-resources para asegurar que el FileReader/BufferedReader se cierre automáticamente
        try (FileReader fileReader = new FileReader(nombreArchivo);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String linea;
            System.out.println("Contenido del archivo '" + nombreArchivo + "':");
            // Leer línea por línea hasta el final del archivo (cuando readLine() devuelve null)
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.err.println("Ocurrió un error al leer el archivo: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
