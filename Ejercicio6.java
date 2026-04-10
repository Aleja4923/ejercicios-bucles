package com.example;

import javax.swing.JOptionPane;

public class Ejercicio6 {
    public static void main(String[] args) {
        Double sueldo,aumento;

        sueldo=Double.valueOf(JOptionPane.showInputDialog("Digite sueldo del trabajador: "));

        if (sueldo<1000000) {
            aumento=(0.15*sueldo)+sueldo;
        }
        else {
            aumento=(0.12*sueldo)+sueldo;
        }
        JOptionPane.showMessageDialog(null, "El nuevo sueldo es de: "+ aumento);
    }
}
