/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contadorgui;


import javax.swing.*; // Importa todas las clases de Swing
import java.awt.event.ActionEvent; // Para manejar eventos
import java.awt.event.ActionListener; // Interfaz para el listener de botones
import java.awt.*; // Para layout managers y otras utilidades gráficas

/**
 *
 * @author Dell
 */
public class ContadorGUI extends JFrame implements ActionListener {

    // La clase hereda de JFrame y "escucha" eventos
    // atributos de la clase
    private JLabel etiquetaContador; // Etiqueta para mostrar el número
    private JButton botonIncrementar; // Botón para incrementar
    private JButton botonDecrementar; // Botón para decrementar
    private int contador = 0; // Variable para el contador

    // métodps
    // método constructor de la clase
    public ContadorGUI(){
        // Configuración de la ventana (JFrame)
        setTitle("Contador Simple Java"); // Título de la ventana
        setSize(300, 200); // Tamaño de la ventana (ancho, alto)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra la aplicación al cerrar la ventana
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        
        // Usar un BorderLayout para organizar los componentes
        setLayout(new BorderLayout());
        
        // 1. Crear componentes
        etiquetaContador = new JLabel("Contador: " + contador, SwingConstants.CENTER); // Etiqueta centrada
        etiquetaContador.setFont(new Font("Arial", Font.BOLD, 24)); // Fuente más grande
        
        botonIncrementar = new JButton("Incrementar");
        botonDecrementar = new JButton("Decrementar");
        
        // 2. Añadir listeners a los botones
        botonIncrementar.addActionListener(this); // 'this' indica que esta misma clase manejará el evento
        botonDecrementar.addActionListener(this);
        
        // 3. Crear un panel para los botones y usar FlowLayout
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // Centrado, con espacio entre botones
        panelBotones.add(botonIncrementar);
        panelBotones.add(botonDecrementar);
        
        // 4. Añadir componentes al JFrame
        add(etiquetaContador, BorderLayout.CENTER); // La etiqueta en el centro
        add(panelBotones, BorderLayout.SOUTH); // El panel de botones en la parte inferior

        setVisible(true); // Hacer visible la ventana
        
    }
    
    // 5. Implementar el método del ActionListener para manejar eventos
    @Override
    public void actionPerformed(ActionEvent e) {
        // e.getSource() devuelve el componente que disparó el evento
        if (e.getSource() == botonIncrementar) {
            contador++;
        } else if (e.getSource() == botonDecrementar) {
            contador--;
        }
        etiquetaContador.setText("Contador: " + contador); // Actualizar el texto de la etiqueta
    }


    public static void main(String[] args) {
        System.out.println("Ejemplo de interfaces gráficas en Java");
        
        // Se recomienda ejecutar las operaciones de GUI en el Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ContadorGUI(); // Crea una instancia de la ventana
            }
        });
    }
}
