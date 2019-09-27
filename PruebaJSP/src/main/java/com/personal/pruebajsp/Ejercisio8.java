//8-Crear un programa que permita ingresar 3 números cualquiera, dicho programa deberá evaluar y ordenar los números de menor a mayor.
package com.personal.pruebajsp;

import javax.swing.JOptionPane;


public class Ejercisio8 {
	public static void main(String[]args){
    //variable
    float N1,N2,N3;
    //Entrada de datos
    JOptionPane.showMessageDialog(null,"Proceso de evaluar numeros menores a mayores:");
    N1=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero:"));
    N2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo numero:"));
    N3=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el tercer numero:"));
    
  //condicion
    if (N1>N2&&N2>N3){
    JOptionPane.showMessageDialog(null,"El numero mayor es:"+N1+"Intermedio"+N2+"menor:"+N3);
    }else if (N1>N3&&N3>N2) {
    JOptionPane.showMessageDialog(null,"El numero mayor es:"+N1+" Intermedio" +N3+ "menor" +N2);
    }else if (N2>N1&&N1>N3) {
        JOptionPane.showMessageDialog(null, "El numero mayor es:"+N2+" intermedio"+N1+" menor" +N3);
    }else if (N2>N3&&N3>N1){
        JOptionPane.showMessageDialog(null,"El numero mayor es:"+N2+" intermedio"+N3+" menor" +N1);
    }else if (N3>N1&&N1>N3){
        JOptionPane.showMessageDialog(null,"El numero mayor es:"+N3+" intermedio"+N1+"menor" +N2);
    }else if (N3>N2&&N1>N1){
        JOptionPane.showMessageDialog(null, "El numero meyor es:" +N3+"intermedio"+N2+"menor" +N1);   
    }
}
}
