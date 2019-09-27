package com.personal.Proyecto_Persona;

public class Implementacion {
    public static void main(String[] args) {
       
        Persona comp = new Persona(01, "David Rivera", new Personalidad(02, "Alegre", "Es muy contento"), 
         new Ropa(02, new Camisa(03, "Polo"), new Pantalon(04, "jeans"), new Zapatos(05, "Nike ")),  21);
        comp.hablar();
        comp.Socializar();
        comp.getPersonalidad().Comportarse();
        comp.getRopa().modelar();
    }
    
   
}
         