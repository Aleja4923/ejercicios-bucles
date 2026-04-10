package com.example;

import javax.swing.JOptionPane;

public class Ejercicio10 {
    public static void main(String[] args) {
        String matricula = JOptionPane.showInputDialog("Ingrese la matrícula del alumno:");
        String carrera = JOptionPane.showInputDialog("Ingrese la carrera:");
        int semestre = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el semestre:"));
        double promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el promedio del alumno:"));

        double promedioIdeal = 8.5; // Regla general
        
        if (promedio >= promedioIdeal) {
            JOptionPane.showMessageDialog(null, "El alumno con matrícula " + matricula + " de " + carrera + " ES APTO para facultades menores.");
        } else {
            JOptionPane.showMessageDialog(null, "El alumno con matrícula " + matricula + " de " + carrera + " NO ES APTO para facultades menores.");
        }
    }
}
