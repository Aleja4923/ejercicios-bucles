package com.example;

import javax.swing.JOptionPane;

public class Ejercicio13 {
    public static void main(String[] args) {
        int termino = 2;
        int suma = 0;
        int incremento = 3;
        String serie = "";

        while (termino <= 1800) {
            suma = suma + termino;
            serie = serie + termino + ", ";
            
            termino = termino + incremento;
            if (incremento == 3) {
                incremento = 2;
            } else {
                incremento = 3;
            }
        }

        JOptionPane.showMessageDialog(null, "La serie es: " + serie + "\nLa suma total es: " + suma);
    }
}