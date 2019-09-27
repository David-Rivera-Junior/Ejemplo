//15-Crear un programa que determine la cantidad de vocales y consonantes en una palabra dada.
package com.personal.pruebajsp;

public class Ejercisio15 {

   public static void main(String[]args){
       
       int i,j; //Se Implemento el Int
  boolean esPrimo; //Implementamos el boolean
  int rInicial=2;
  int rFinal = 10;
  for(i = rInicial;i <= rFinal;i++){ // Usamos el For

      esPrimo=true;
       for(j = 2;j < i;j++){
       if(i % j == 0){
          esPrimo = false;
       }
       }
       if(esPrimo){
        System.out.println(i+"\n");
       }
  }
 }
}
   

   


