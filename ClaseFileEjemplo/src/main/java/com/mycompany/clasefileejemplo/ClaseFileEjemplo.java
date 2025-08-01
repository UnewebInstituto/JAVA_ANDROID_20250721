/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clasefileejemplo;

import java.io.File;

/**
 *
 * @author Dell
 */
public class ClaseFileEjemplo {

    public static void main(String[] args) {
        System.out.println("Ejemplo archivos");
        
                String rutaArchivo = "mi_archivo.txt"; // Ruta relativa al directorio de ejecución del programa
        String rutaDirectorio = "mi_carpeta";

        File archivo = new File(rutaArchivo);
        File directorio = new File(rutaDirectorio);

        // Verificar si existe
        System.out.println("¿Existe " + rutaArchivo + "? " + archivo.exists());
        System.out.println("¿Existe " + rutaDirectorio + "? " + directorio.exists());

        // Crear directorio
        if (!directorio.exists()) {
            if (directorio.mkdir()) { // mkdir() para un solo directorio
                System.out.println("Directorio '" + rutaDirectorio + "' creado.");
            } else {
                System.out.println("No se pudo crear el directorio '" + rutaDirectorio + "'.");
            }
        }

        // ¿Es un archivo o un directorio?
        System.out.println("¿Es '" + rutaArchivo + "' un archivo? " + archivo.isFile());
        System.out.println("¿Es '" + rutaDirectorio + "' un directorio? " + directorio.isDirectory());

        // Obtener el nombre
        System.out.println("Nombre del archivo: " + archivo.getName());
        System.out.println("Ruta absoluta del archivo: " + archivo.getAbsolutePath());

        // Eliminar (¡Cuidado al usar esto!)
        // if (archivo.exists()) {
        //     if (archivo.delete()) {
        //         System.out.println("Archivo '" + rutaArchivo + "' eliminado.");
        //     }
        // }

        
    }
}
