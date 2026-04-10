package com.example;

import javax.swing.JOptionPane;


public class Ejercicio3 {
    public static void main(String[] args) {
        int dias,segundos;
        dias = Integer.parseInt(JOptionPane.showInputDialog("Digite numero de dias: "));
        segundos= 86400*dias;
        JOptionPane.showMessageDialog(null, "Numero de segundos: "+segundos);
        
    }
}
