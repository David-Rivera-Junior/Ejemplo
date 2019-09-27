
package com.personal.Proyecto_Persona;

import javax.swing.JOptionPane;

public class Persona {
     int codigo;
     String nombre;
     Personalidad personalidad;
     Ropa Ropa;
     int edad;
    
    //contructor
    public Persona(){
        
    } 

    public Persona(int codigo, String nombre, Personalidad personalidad, Ropa Ropa, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.personalidad = personalidad;
        this.Ropa = Ropa;
        this.edad = edad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Personalidad getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(Personalidad personalidad) {
        this.personalidad = personalidad;
    }

    public Ropa getRopa() {
        return Ropa;
    }

    public void setRopa(Ropa Ropa) {
        this.Ropa = Ropa;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
        public void hablar(){
            JOptionPane.showMessageDialog(null, " Bienvenido Viejo ");
            JOptionPane.showMessageDialog(null, " Como te llamas ");
            JOptionPane.showInputDialog(null, " Dime ");
            JOptionPane.showMessageDialog(null, " ¡OH! ya veo que genial viejo");
            JOptionPane.showMessageDialog(null, " Yo me llamo David ");
            JOptionPane.showMessageDialog(null, " Queres ver mis datos ");
            JOptionPane.showInputDialog(null, " Dime ");
            JOptionPane.showMessageDialog(null, " Ok  ");
            
            JOptionPane.showMessageDialog(null, this.nombre+ " Edad " +this.edad +" Esta hablando " );
            
        }
        public void Socializar(){
            JOptionPane.showMessageDialog(null, this.nombre+ " Edad " +this.edad +" Estoy Socializandome ");
        }
       
        
    }
    

