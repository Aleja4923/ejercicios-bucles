package com.example;

import javax.swing.JOptionPane;

public class Ejercicio19 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de empleados:"));
        int entre100y300 = 0;
        int masDe300 = 0;
        double gastoTotal = 0;
        
        for (int i = 1; i <= n; i++) {
            double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo del empleado " + i + " (entre 100 y 500):"));
            
            gastoTotal = gastoTotal + sueldo;
            
            if (sueldo >= 100 && sueldo <= 300) {
                entre100y300++;
            } else if (sueldo > 300) {
                masDe300++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Empleados que cobran entre $100 y $300: " + entre100y300 + 
            "\nEmpleados que cobran más de $300: " + masDe300 + 
            "\nEl gasto total en sueldos es: $" + gastoTotal);
    }
}
