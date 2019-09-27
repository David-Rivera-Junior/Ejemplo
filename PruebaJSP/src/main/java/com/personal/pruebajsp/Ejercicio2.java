//2-Crear un programa el cual sea capaz de calcular el promedio de notas de un alumno,
//a partir de 3 notas establecidas como enteros y determine si aprobó con una nota mayor o igual que 6.
package com.personal.pruebajsp;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ejercicio2 {
    public static void main(String[] args){
    Scanner promedio=new Scanner(System.in);
    //proceso continuo
    int nota1 = 0;
    int nota2 = 0;
    int nota3 = 0;
    int resultado;
    int promedio1 = 0;
    
    //imprimir los siguientes datos
    
    nota1=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la nota 1: "));
   // nota1=promedio.nextInt();
    
    nota2=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la nota 2: "));
    //nota2=promedio.nextInt();        
    
  nota3=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingres la nota 3: "));
    //nota3=promedio.nextInt();
    
    resultado = nota1 + nota2 + nota3;
    JOptionPane.showMessageDialog(null,"Mostrar el resultado: "+resultado);
    
    promedio1=resultado/3;
    JOptionPane.showMessageDialog(null,"Tu promedio es: "+promedio1);
    
     if (promedio1>=6){
        JOptionPane.showMessageDialog(null,"si aprobo la materia: "+promedio1);
        
    }else{
        JOptionPane.showMessageDialog(null,"reprobo la materia: "+promedio1);
    }
    }
    
    
    
    
    
    
}
