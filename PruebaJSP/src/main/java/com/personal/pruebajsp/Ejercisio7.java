//7-Crear un programa que pida al usuario su nombre y apellido, y le diga 
//"Hola" si se llama "Juan Pérez", o bien le diga "No te conozco" ingresa otros nombre y apellido. 
package com.personal.pruebajsp;

import javax.swing.JOptionPane;

public class Ejercisio7 {
    public static void main(String[]args){
        String nombre,apellido;
        nombre=JOptionPane.showInputDialog(null,"Ingrese su nombre");
        apellido=JOptionPane.showInputDialog(null,"Ingrese su apellido");
        
        if(apellido.equals("Rivera")&&nombre.equals("David")){
            JOptionPane.showMessageDialog(null,"Hola Buenas Tardes.");
            
        }else{
        JOptionPane.showMessageDialog(null,"Fijate que no te conosco Adios.");
            
        }
    }
    
}

