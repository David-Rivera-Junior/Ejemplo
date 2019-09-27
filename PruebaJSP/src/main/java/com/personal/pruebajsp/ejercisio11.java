//Desarrollar un programa que calcule el porcentaje de alumnos reprobados de un grupo,
//a partir de la cantidad total de alumnos que presentaron un examen y el número de alumnos que lo reprobaron.
package com.personal.pruebajsp;

import javax.swing.JOptionPane;
public class ejercisio11 {
    public static void main(String[] args) {
        //Variable
        float porcent,totalumn,alumnrep,alumnapr;
        //Datos de Usuario
        JOptionPane.showMessageDialog(null,"Programa para calcular porcentaje de alumnos:");
        totalumn=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la cantidad de alumnos"));
        alumnrep=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la cantidad de alumnos que reprobaron"));
        alumnapr=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la cantidad de alumnos que aprobaron"));
        
        //Procedimiento
        
       alumnrep=(alumnrep*100)/totalumn;
       alumnapr=(alumnapr*100)/totalumn;
       //Salida
       JOptionPane.showMessageDialog(null,"porcentaje de alumnos reprobados:"+alumnapr+"%");
       JOptionPane.showMessageDialog(null,"porcentaje de alumnos reprobados:"+alumnrep+"%");
       
               
        
       
}
}

             
    
   
   
        