
package com.personal.arquitectura;


import javax.swing.JOptionPane;

public class principal {

    public static void main(String[] args) {
        moto moto= new moto("Kawasaki");
        Coche coche = new Coche("Toyota");
        
        JOptionPane.showMessageDialog(null, " Hola Buen dia le tenemos dos ofermas una Moto un Coche ");
        JOptionPane.showInputDialog(null, "Que necesita");
    
        JOptionPane.showMessageDialog(null, moto.getMarca ());
        JOptionPane.showMessageDialog(null, coche.getMarca ());
        
       
        
        
                
        
        
    }
    
}
