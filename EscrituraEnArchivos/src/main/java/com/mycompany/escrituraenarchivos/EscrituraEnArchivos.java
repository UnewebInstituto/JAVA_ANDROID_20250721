/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.escrituraenarchivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Dell
 */
public class EscrituraEnArchivos {

    public static void main(String[] args) {
        System.out.println("Ejemplo escritura en archivos");
                String nombreArchivo = "datos.txt";
        String[] lineasDeTexto = {
            "Esta es la primera línea.",
            "Esta es la segunda línea con un número: " + 123,
            "Y esta es la tercera línea."
        };

        // Usando try-with-resources para asegurar que el FileWriter/PrintWriter se cierre automáticamente
        try (FileWriter fileWriter = new FileWriter(nombreArchivo); // true para añadir al final, false para sobrescribir
             PrintWriter printWriter = new PrintWriter(fileWriter)) {

            for (String linea : lineasDeTexto) {
                printWriter.println(linea); // Escribe la línea y añade un salto de línea
            }
            System.out.println("Datos escritos en el archivo '" + nombreArchivo + "' exitosamente.");

        } catch (IOException e) {
            System.err.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
            e.printStackTrace(); // Imprime la traza completa del error
        }
        
        
    }
}
