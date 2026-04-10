package com.example;

import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {
        int cant,temperatura;
        cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de chirridos en 15 segundos"));
        
        temperatura = cant+5;
        JOptionPane.showMessageDialog(null, "La temperatura es de "+ temperatura + "°C");

    }
}
