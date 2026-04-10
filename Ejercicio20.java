package com.example;

import javax.swing.JOptionPane;

public class Ejercicio20 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número para generar sus múltiplos:"));
        int limite = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el límite máximo:"));
        
        String resultado = "Múltiplos de " + numero + " hasta " + limite + ":\n";
        
        for (int i = numero; i <= limite; i = i + numero) {
            resultado = resultado + i + ", ";
        }
        
        JOptionPane.showMessageDialog(null, resultado);
    }
}
