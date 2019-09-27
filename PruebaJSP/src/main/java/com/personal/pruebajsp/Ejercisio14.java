//Crear un programa que determine la cantidad de vocales y consonantes en una palabra dada.
package com.personal.pruebajsp;

import java.util.Scanner;
import javax.swing.JOptionPane;

//Crear un programa que determine la posición de una letra en el abecedario estándar (No incluye Ñ, LL)
public class Ejercisio14 {
    public static void main(String[]args){
        int vocal, consonante, otro;
        String frase;
        Scanner entrada=new Scanner(System.in);
        
        vocal=0;
        consonante = 0;
        otro=0;
        System.out.println("Introdusca la frase");
        frase=entrada.nextLine().toLowerCase();
        for (int cont=0; cont<frase.length();cont++){
        if (frase.charAt(cont)<'a'||frase.charAt(cont)>'z'){
            otro++;
        }else if (frase.charAt(cont)=='a'||frase.charAt(cont)=='e'||frase.charAt(cont)=='i'||frase.charAt(cont)=='o'||frase.charAt(cont)=='u'){
            vocal++;      
        }else{ consonante++;
                }
   
        }
        System.out.println("La frase tiene "+vocal+" vocales");
        System.out.println("La frase tiene "+consonante+" consonantes"); 
    }
}

            
            
        
        
      

