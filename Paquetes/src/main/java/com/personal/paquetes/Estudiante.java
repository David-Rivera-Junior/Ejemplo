package com.personal.paquetes;

import javax.swing.JOptionPane;

public class Estudiante {

    private int codigo;
    private String carrera;

    public Estudiante() {
    }

    public Estudiante(int codigo, String carrera) {
        this.codigo = codigo;
        this.carrera = carrera;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void Estudiante(String nombre, String identificador, String direccion, int edad, String carrera, String codigo) {
        
        JOptionPane.showMessageDialog(null, " Nombre "+nombre + " Identificador "+ identificador+ " Edad "+ edad + " Direccion "+ direccion + " Carrera "+carrera + " Codigo "+codigo);
        
    }
            
    }
