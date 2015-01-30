package com.proyectoLudus.training.helloWorld;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HelloWorldSWT {

    public static void createAndShowGUI() {
        //Crear la ventana
        JFrame frame = new JFrame("Golden Horn RULES");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        
        mainPanel.setLayout(new GridLayout(3,1));
        JPanel topPanel = new JPanel();
        mainPanel.add(topPanel);
        JPanel midPanel = new JPanel();
        mainPanel.add(midPanel);
        JPanel botPanel = new JPanel();
        mainPanel.add(botPanel);
        
        //Añadimos un componente "Etiqueta" que tenga tecto
        JLabel label = new JLabel("Blapo Pls!");
        
        topPanel.add(new JLabel("Top"));
        midPanel.add(new JLabel("Mid"));
        botPanel.add(label);
        frame.add(mainPanel);

        //Lo apretujamos todo en una ventana del minimo tamaño, y lo mostramos por pantalla
        frame.pack();
        frame.setVisible(true);
    }
}