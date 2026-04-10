package com.example;

import javax.swing.JOptionPane;

public class Ejercicio9 {
    public static void main(String[] args) {
        String equipo1 = JOptionPane.showInputDialog("Ingrese el nombre del primer equipo:");
        int goles1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los goles de " + equipo1 + ":"));
        
        String equipo2 = JOptionPane.showInputDialog("Ingrese el nombre del segundo equipo:");
        int goles2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los goles de " + equipo2 + ":"));
        
        if (goles1 == goles2) {
            int penales1 = Integer.parseInt(JOptionPane.showInputDialog("Hubo empate. Ingrese los goles de penales de " + equipo1 + ":"));
            int penales2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los goles de penales de " + equipo2 + ":"));
            goles1 = goles1 + penales1;
            goles2 = goles2 + penales2;
        }

        if (goles1 > goles2) {
            JOptionPane.showMessageDialog(null, "El ganador es " + equipo1 + " con " + goles1 + " goles a " + goles2);
        } else if (goles2 > goles1) {
            JOptionPane.showMessageDialog(null, "El ganador es " + equipo2 + " con " + goles2 + " goles a " + goles1);
        } else {
            JOptionPane.showMessageDialog(null, "El partido terminó en empate total " + goles1 + " a " + goles2);
        }
    }
}
