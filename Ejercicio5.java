package com.example;

import javax.swing.JOptionPane;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        double precio,enganche,cuotas;

        precio= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del vehiculo: "));
        enganche = precio * 0.35;
        cuotas = (precio-enganche)/18;

        JOptionPane.showMessageDialog(null, "Cantidad importe de enganche a pagar: "+ enganche + "cantidad restante en 18 mensualidades: "+ cuotas);
        
    }
}
