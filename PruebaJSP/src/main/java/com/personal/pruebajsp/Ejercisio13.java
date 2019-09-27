//Crear un programa que determine la posición de una letra en el abecedario estándar (No incluye Ñ, LL)
package com.personal.pruebajsp;

import javax.swing.JOptionPane;

public class Ejercisio13 {

    public static void main(String[] args) {
        //Variable
        char v;
        v=JOptionPane.showInputDialog(null, "Introdusca una letra de abecedario").charAt(0);
        switch (v) {
            case 'a':
                JOptionPane.showMessageDialog(null, "Es la letra 1°del abecedario");
                break;
            case 'b':
                JOptionPane.showMessageDialog(null, "Es la letra 2° del abecedario");
                break;
            case 'c':
                JOptionPane.showMessageDialog(null, "Es la letra 3° del abecedario");
                break;
            case 'd':
                JOptionPane.showMessageDialog(null, "Es la letra 4° del abecedario");
                break;
            case 'e':
                JOptionPane.showMessageDialog(null, "Es la letra 5° del abecedario");
                break;
            case 'f':
                JOptionPane.showMessageDialog(null, "Es la letra 6° del abecedario");
                break;
            case 'g':
                JOptionPane.showMessageDialog(null, "Es la letra 7° del abecedario");
                break;
            case 'h':
                JOptionPane.showMessageDialog(null, "Es la letra 8° del abecedario");
                break;
            case 'i':
                JOptionPane.showMessageDialog(null, "Es la letra 9° del abecedario");
                break;
            case 'j':
                JOptionPane.showMessageDialog(null, "Es la letra 10° del abecedario");
                break;
            case 'k':
                JOptionPane.showMessageDialog(null, "Es la letra 11° del abecedario");
                break;
            case 'l':
                JOptionPane.showMessageDialog(null, "Es la letra 12° del abecedario");
                break;
            case 'm':
                JOptionPane.showMessageDialog(null, "Es la letra 13° del abecedario");
                break;
            case 'n':
                JOptionPane.showMessageDialog(null, "Es la letra 14° del abecedario");
                break;
            case 'o':
                JOptionPane.showMessageDialog(null, "Es la letra 15° del abecedario");
                break;
            case 'p':
                JOptionPane.showMessageDialog(null, "Es la letra 16° del abecedario");
                break;
            case 'q':
                JOptionPane.showMessageDialog(null, "Es la letra 17° del abecedario");
                break;
            case 'r':
                JOptionPane.showMessageDialog(null, "Es la letra 18° del abecedario");
                break;
            case 's':
                JOptionPane.showMessageDialog(null, "Es la letra 19° del abecedario");
                break;
            case 't':
                JOptionPane.showMessageDialog(null, "Es la letra 20° del abecedario");
                break;
            case 'u':
                JOptionPane.showMessageDialog(null, "Es la letra 21° del abecedario");
                break;
            case 'v':
                JOptionPane.showMessageDialog(null, "Es la letra 22° del abecedario");
                break;
            case 'w':
                JOptionPane.showMessageDialog(null, "Es la letra 23° del abecedario");
                break;
            case 'x':
                JOptionPane.showMessageDialog(null, "Es la letra 24° del abecedario");
                break;
            case 'y':
                JOptionPane.showMessageDialog(null, "Es la letra 25° del abecedario");
                break;
            case 'z':
                JOptionPane.showMessageDialog(null, "Es la letra 26° del abecedario");
                break;
        }
    }
}
