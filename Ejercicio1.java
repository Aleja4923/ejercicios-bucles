package com.example;

import javax.swing.JOptionPane;

public class Ejercicio1{
    public static void main(String[] args) {
        double dinero,interes;
        dinero = Double.parseDouble( JOptionPane.showInputDialog("Ingrese el capital a invertir "));
        interes = dinero*0.02;
        
        JOptionPane.showMessageDialog(null, "La ganancia es de " + interes);
        

    }
    
}
