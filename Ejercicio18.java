package com.example;

import javax.swing.JOptionPane;

public class Ejercicio18 {
    public static void main(String[] args) {
        int aprobados = 0;
        int reprobados = 0;
        
        for (int i = 1; i <= 10; i++) {
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del estudiante " + i + ":"));
            if (nota >= 7) {
                aprobados++;
            } else {
                reprobados++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Total aprobados: " + aprobados + "\nTotal reprobados: " + reprobados);
    }
}
