package com.example;

import javax.swing.JOptionPane;

public class Ejercicio12 {
    public static void main(String[] args) {
        int decision = 1;
        double gasto;
        double total=0;
        int contador = 0;

        while (decision == 1) {
            gasto=Double.parseDouble(JOptionPane.showInputDialog("Digite gasto"));
            total = gasto + total;
            contador++;
            decision = Integer.parseInt(JOptionPane.showInputDialog("Desea agregar otro gasto? Para seguir presione 1"));
            
        }

        JOptionPane.showMessageDialog(null, "Se realizaron " + contador + " gastos. El gasto total es de: $" + total );
    }
    
}
