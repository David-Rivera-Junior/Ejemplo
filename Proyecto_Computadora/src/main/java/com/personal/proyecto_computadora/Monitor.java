
package com.personal.proyecto_computadora;

import javax.swing.JOptionPane;

public class Monitor {
    private String codigo;
    private String marca;
    private String resolucion;
    
    public Monitor(){
        
    }

    public Monitor(String codigo, String marca, String resolucion) {
        this.codigo = codigo;
        this.marca = marca;
        this.resolucion = resolucion;
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

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }
    
    
    
    public void mostarImagen(){
        JOptionPane.showMessageDialog(null, "Mostrando imagen en monitor codigo "+this.codigo+" marca "+this.marca+" con resolucion "+this.resolucion);
    }
}
