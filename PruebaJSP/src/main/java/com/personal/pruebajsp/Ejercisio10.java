//10-Crear un programa que determine si un número es primo o no.
package com.personal.pruebajsp;

import javax.swing.JOptionPane;

public class Ejercisio10 {
public static void main(String[]args){
    //variable
    int numero;
    
    JOptionPane.showMessageDialog(null,"Ingrese un numero que sea primo:");
    
    //Entrada de datos
    numero=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero:"));
    //Condicion
    if (numero%2==0){
        JOptionPane.showMessageDialog(null, "No es numero primo:");
    }else{
        JOptionPane.showMessageDialog(null, "Es numero primo:");
    }
}	
}



	
    

