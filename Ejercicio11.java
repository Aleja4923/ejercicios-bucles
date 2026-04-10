package com.example;

import javax.swing.JOptionPane;

public class Ejercicio11 {
    public static void main(String[] args) {
        double sueldoBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo base:"));
        int categoria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la categoría (1, 2, 3 o 4):"));
        int horasExtras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas extras trabajadas:"));
        
        int precioHora = 0;
        if (categoria == 1) {
            precioHora = 30;
        } else if (categoria == 2) {
            precioHora = 38;
        } else if (categoria == 3) {
            precioHora = 50;
        } else if (categoria == 4) {
            precioHora = 70;
        }

        double totalPagar = sueldoBase + (horasExtras * precioHora);
        JOptionPane.showMessageDialog(null, "El total a pagar es: $" + totalPagar);
    }
}
