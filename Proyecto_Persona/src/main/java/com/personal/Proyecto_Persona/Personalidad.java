
package com.personal.Proyecto_Persona;

import javax.swing.JOptionPane;

    public class Personalidad {
    private int codigo;
    private String personalidad;
    private String descripcion;
    
    //Constructor
    
    public Personalidad() {
        
    }

    public Personalidad(int codigo, String personalidad, String descripcion) {
        this.codigo = codigo;
        this.personalidad = personalidad;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
        
    public void Comportarse(){
        JOptionPane.showMessageDialog(null, " Es "+this.personalidad +" descripcion " +this.descripcion);
    }
}
