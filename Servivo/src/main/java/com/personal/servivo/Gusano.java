
package com.personal.servivo;

import com.personal.servivo.Servivo;
import javax.swing.JOptionPane;


public class Gusano implements Animal{
    
    //atributos
    private String nombre;
    private String tipo;
    
    //constructor por defecto

    public Gusano() {
    }
    //constructor generado

    public Gusano(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    @Override
    public void respirar() {
        JOptionPane.showMessageDialog(null, "Gusano Respira");
    }

    @Override
    public void comer() {
        JOptionPane.showMessageDialog(null, "Gusano come");
    }

    @Override
    public void comunicarse() {
        JOptionPane.showMessageDialog(null, "Gusano Comunica");
    }

    @Override
    public void dormir() {
        JOptionPane.showMessageDialog(null, "Gusano duerme");
    }  

    @Override
    public void Rugir() {
      JOptionPane.showMessageDialog(null, "Gusano ruge");   
    }

    @Override
    public void generartejido() {
      JOptionPane.showMessageDialog(null, "Gusano generando su tejido");    }
}    

