package com.example;

import javax.swing.JOptionPane;

public class Ejercicio15 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        String resultado = "Mes 1: " + a + " pareja(s)\nMes 2: " + b + " pareja(s)\n";
        
        int mes = 3;
        int c = a + b;
        
        while (c <= 55) {
            resultado = resultado + "Mes " + mes + ": " + c + " pareja(s)\n";
            a = b;
            b = c;
            c = a + b;
            mes++;
        }
        
        JOptionPane.showMessageDialog(null, resultado);
    }
}
