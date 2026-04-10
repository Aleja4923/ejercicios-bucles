package com.example;

import javax.swing.JOptionPane;

public class Ejercicio16 {
    public static void main(String[] args) {
        double alturaInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura inicial en cm:"));

        double alturaObjetivo = alturaInicial / 5.0;
        double alturaActual = alturaInicial;
        int rebotes = 0;
        
        while (alturaActual >= alturaObjetivo) {

            alturaActual = alturaActual * 0.90; 
            rebotes++;
        }
        
        JOptionPane.showMessageDialog(null, "La pelota da " + rebotes + " rebotes antes de llegar a menos de la quinta parte de la altura inicial.");
    }
}
