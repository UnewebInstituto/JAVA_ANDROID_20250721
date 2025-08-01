/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switchcase;

/**
 *
 * @author Dell
 */
public class SwitchCase {

    public static void main(String[] args) {
        System.out.println("Suiche Case");
                int diaSemana = 3; // 1=Lunes, 2=Martes, etc.
        String nombreDia;

        switch (diaSemana) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Día inválido";
                break;
        }
        System.out.println("Hoy es: " + nombreDia);

        // Ejemplo con String (Java 7+)
        String fruta = "Manzana";
        switch (fruta) {
            case "Manzana":
                System.out.println("Es una fruta roja o verde.");
                break;
            case "Banana":
                System.out.println("Es una fruta amarilla.");
                break;
            default:
                System.out.println("Fruta desconocida.");
                break;
        }

    }
}
