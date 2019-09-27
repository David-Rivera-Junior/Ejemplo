
package com.personal.figura_interfaz;

import javax.swing.JOptionPane;

public class Rectangulo implements Figura{
     //Variable
    private double base;
    private double altura;
    
    //constructor
    public Rectangulo(){
    }
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public void area() {
         JOptionPane.showMessageDialog(null, "el area del rectangulo es:"+this.altura*this.base);
    }
       
    }

    
    
  


