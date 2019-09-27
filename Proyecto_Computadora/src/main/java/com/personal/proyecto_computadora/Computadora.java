
package com.personal.proyecto_computadora;

import javax.swing.JOptionPane;

public class Computadora {
    private int codigo;
    private String marca;
    private String color;
    private  Monitor monitor;
    private Mouse mouse;
    private Teclado teclado;

    
    //Constructores
    public Computadora() {
        
    }
    
    public Computadora(int codigo, String marca, String color, Monitor monitor, Mouse mouse, Teclado teclado) {
        this.codigo = codigo;
        this.marca = marca;
        this.color = color;
        this.monitor = monitor;
        this.mouse = mouse;
        this.teclado = teclado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }
    
    public void programar(){
        
    }
    
    public void programando(String lenguaje){
        JOptionPane.showMessageDialog(null, "Programando en lenguaje "+lenguaje);
    }
}
    

    
    
    
    
    
    
    

        


        
   

