package com.personal.Proyecto_Persona;

import javax.swing.JOptionPane;

public class Ropa {

    private int Codigo;
    private Camisa Camisa;
    private Pantalon Pantalon;
    private Zapatos Zapatos;

    //constructor
    public Ropa() {

    }

    public Ropa(int Codigo, Camisa Camisa, Pantalon Pantalon, Zapatos Zapatos) {
        this.Codigo = Codigo;
        this.Camisa = Camisa;
        this.Pantalon = Pantalon;
        this.Zapatos = Zapatos;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public Camisa getCamisa() {
        return Camisa;
    }

    public void setCamisa(Camisa Camisa) {
        this.Camisa = Camisa;
    }

    public Pantalon getPantalon() {
        return Pantalon;
    }

    public void setPantalon(Pantalon Pantalon) {
        this.Pantalon = Pantalon;
    }

    public Zapatos getZapatos() {
        return Zapatos;
    }

    public void setZapatos(Zapatos Zapatos) {
        this.Zapatos = Zapatos;
    }

 
    public void modelar(){
        JOptionPane.showMessageDialog(null, " Estoy modelando con la camisa codigo "+this.Codigo+ " tipo " +this.Camisa.getCamisa() +" Pantalon " +this.Pantalon.getPantalon()+ " Zapatos " +this.Zapatos.getZapatos());
    }
}
