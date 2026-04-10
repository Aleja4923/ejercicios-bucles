package com.example;

import javax.swing.JOptionPane;

public class Ejercicio14 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para calcular su factorial:"));
        int factorial = 1;
        
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        
        JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial);
    }
}
