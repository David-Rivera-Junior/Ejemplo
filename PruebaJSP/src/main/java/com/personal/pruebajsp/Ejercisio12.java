//Crear un programa que salude a una persona acorde la hora ingresada 0h a 12h Buenos días, de 12h a 19h Buenas tardes, de 19h a 0 Buenas noches.
package com.personal.pruebajsp;

import javax.swing.JOptionPane;

public class Ejercisio12 {


      public static void main(String[] args) {
    	  
          int hora=0;

    JOptionPane.showInputDialog(null,"Por favor, introduzca una hora del día:");
    
    //Variable
    if((hora >=0) && (hora <=12)){
    	JOptionPane.showMessageDialog(null,"Buenos Dias:");
    	
    	if((hora >=13) && (hora <=12)){
    		JOptionPane.showMessageDialog(null,"Buenos Tardes:");
    		
    		if((hora >=20) && (hora <=6)){
    		JOptionPane.showMessageDialog(null,"Buenos Noches:");
    		}
    	}
    
    }
      }
}   	
    	
    
    
    
      



