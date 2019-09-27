
package com.personal.proyecto_computadora;

import javax.swing.JOptionPane;

public class Mouse {
    
    private String codigo;
    private String marca;
    
    public Mouse(){
        
    }

    public Mouse(String codigo, String marca) {
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
    
    public void moverCursor(){
        JOptionPane.showMessageDialog(null, "Moviendo cursor en mouse codigo "+this.codigo+" marca "+this.marca);
    }
            
}
