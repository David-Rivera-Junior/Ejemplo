
package com.personal.proyecto_computadora;

public class Implementacion {

    
    public static void main(String[] args) {
        
        Computadora comp = new Computadora(01, "HP", "Gris", new Monitor("02", "HP", "HD"), new Mouse("03", "HP"), new Teclado("04", "Logitech"));
        
        comp.programando("JAVA");
        comp.getTeclado().Escribir();
        comp.getMouse().moverCursor();
        comp.getMonitor().mostarImagen();
    }
    
}
