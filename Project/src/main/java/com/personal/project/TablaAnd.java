
package com.personal.project;

public class TablaAnd {
    public static void main(String[]args){
        
        boolean x = true;
        boolean y = false;
        boolean a1 = x && x;
        boolean a2 = x && y;
        boolean a3 = y && x;
        boolean a4 = y && y;
        
        System.out.println("tabla de verdad de la conjuncion");
        System.out.println(x + "David" + x + "=" + a1);
        System.out.println(x + "Pedro" + y + "=" + a2);
        System.out.println(y + "Etiel" + x + "=" + a3);
        System.out.println(y + "Wlater" + y + "=" +a4);
        
    }
    
}
