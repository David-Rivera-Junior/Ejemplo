
package com.personal.project;

import javax.swing.JOptionPane;

public class compa {
  
      public static double proceso(Double nl,Double n2,Integer t){   
     double operacion = 0.0;
     //Double result = operacion;
     //Evaluar la variable 't' donde:
        //si igual a 1 que sume
        /*si es igual a 2 que reste
         si es mayor que 3 que multiplique
         si es igual a 4 que divida*/
        //condicion
        if (t==1){
            operacion = nl+n2;
        } else if (t==2) {
                operacion = nl-n2;
            }else if (t==3){
                    operacion=(nl*n2);
                }else if (t==4){
                        operacion = nl/n2;
                         }  else{
      JOptionPane.showMessageDialog(null, "#");
                    }
      return operacion;
                   
      }
      
      //Salida
      public static void main(String[]args){
      double n1 = 5;
      double n2 = 5;
      int t = 1;
          
          JOptionPane.showMessageDialog(null, proceso(5.0,5.0,1));
          
          
          //JOptionPane.showMessageDialong(null, operacion);
          //System.out.println(operacion);
      }
          
          
      }
