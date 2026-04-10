package com.example;

import javax.swing.JOptionPane;

public class Ejercicio8 {
    public static void main(String[] args) {
        double costo;

        costo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del producto:"));

        if (costo > 200) {
            JOptionPane.showMessageDialog(null, "El costo es " + costo + " se paga en EFECTIVO");
        } else {
           
            JOptionPane.showMessageDialog(null, "El costo es " + costo + " se paga con TARJETA");
        }
    }
}