
package com.personal.figura_interfaz;

import javax.swing.JOptionPane;

    
  public class Circulo implements Figura{
                //Variable
               private double radio;      

               //Constructor
               public Circulo(){
         
               }  
         public Circulo(double radio) {
         this.radio = radio;
    }
             @Override
         public void area(){
        JOptionPane.showMessageDialog(null, "el area es igual: " +(Math.pow(radio, 2)*3.1416));
         }
  }
