package com.example;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        double largo,ancho,area,arena;
        largo= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el largo expresado en metros: "));
        ancho= Double.parseDouble(JOptionPane.showInputDialog( "Ingrese el ancho expresado en metros"));
        
        area = largo+ancho;
        arena= area*0.5;

        JOptionPane.showMessageDialog(null, "La cantidad de arena necesaria es: " + arena);
        

    }
}
