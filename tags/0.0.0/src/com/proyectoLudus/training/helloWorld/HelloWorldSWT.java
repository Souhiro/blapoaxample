package com.proyectoLudus.training.helloWorld;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import javax.swing.*;        

public class HelloWorldSWT {

    public static void createAndShowGUI() {
        //Crear la ventana
        JFrame frame = new JFrame("Golden Horn RULES");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Añadimos un componente "Etiqueta" que tenga tecto
        
        JLabel label = new JLabel("Blapo Pls!");
        frame.add(label);

        //Lo apretujamos todo en una ventana del minimo tamaño, y lo mostramos por pantalla
        frame.pack();
        frame.setVisible(true);
    }
}