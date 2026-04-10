package com.example;

import javax.swing.JOptionPane;

public class Ejercicio17 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de piezas a procesar:"));
        int validas = 0;
        
        for (int i = 0; i < n; i++) {
            double longitud = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud de la pieza " + (i + 1) + " en metros:"));

            if (longitud >= 1.0 && longitud <= 2.0) {
                validas++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "La cantidad de piezas válidas es: " + validas);
    }
}
