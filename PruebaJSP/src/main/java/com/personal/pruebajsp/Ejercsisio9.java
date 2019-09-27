//9-Crear un programa si un número es Par o Impar.
package com.personal.pruebajsp;

import javax.swing.JOptionPane;


public class Ejercsisio9 {
   	   public static void main(String[]args){
	        
	        int numero;
	         numero=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero:"));
	    
	         if (numero%2==0){
	        	 JOptionPane.showMessageDialog(null,"Muestra el numero par");
		        }else{ 
		    JOptionPane.showMessageDialog(null,"Muestra numero impar");
	        }
	       
	        
	        
	    }
	    
	}
