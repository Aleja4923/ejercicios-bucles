package com.example;

import javax.swing.JOptionPane;

public class Ejercicio7 {
    public static void main(String[] args) {
        String nombre;
        int goles;

        nombre = JOptionPane.showInputDialog("Ingrese el nombre del jugador:");
        goles = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de goles de "));

        if (goles >= 6) {
            JOptionPane.showMessageDialog(null, "GOLEADOR");
        } else {
            JOptionPane.showMessageDialog(null, "NO GOLEADOR");
        }
    }
}