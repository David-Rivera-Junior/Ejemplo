
package com.personal.proyecto_computadora;

import javax.swing.JOptionPane;

public class Teclado {
        
    private String codigo;
    private String marca;
    
    public Teclado(){
        
    }

    public Teclado(String codigo, String marca) {
        this.codigo = codigo;
        this.marca = marca;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void Escribir(){
        JOptionPane.showMessageDialog(null, "Escribiendo en teclado codigo "+this.codigo+" marca "+this.marca);
    }
    }
    

