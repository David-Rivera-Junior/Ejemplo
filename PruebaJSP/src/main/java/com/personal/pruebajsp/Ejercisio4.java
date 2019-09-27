//4-Crear un programa que calcule la edad de una persona en base a su año de nacimiento.
package com.personal.pruebajsp;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercisio4 {
 public static void main(String[] args) {
     //Scanner date=new Scanner(System.in);
     //variables
     int edad=0;
     //datos de usuarios
      edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad"));
     //edad=date.nextInt();
     if(edad>=18){
          JOptionPane.showMessageDialog(null,"Usted eres mayor de edad");
     }else{
          JOptionPane.showMessageDialog(null,"Usted es menor");
     }
   }
 }

 
