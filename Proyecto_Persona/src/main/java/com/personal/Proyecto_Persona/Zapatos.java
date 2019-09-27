package com.personal.Proyecto_Persona;

public class Zapatos {

    private int codigo;
    private String zapatos;

    public Zapatos() {

    }

    public Zapatos(int codigo, String zapatos) {
        this.codigo = codigo;
        this.zapatos = zapatos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getZapatos() {
        return zapatos;
    }

    public void setZapatos(String zapatos) {
        this.zapatos = zapatos;
    }

}
