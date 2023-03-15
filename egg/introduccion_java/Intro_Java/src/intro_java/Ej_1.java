
package ej_1;

import java.util.Scanner;

public class Ej_1 {

    public static void main(String[] args) {
        
        Scanner leer  = new Scanner (System.in);
        
        int num1 ,num2;
        
        System.out.println("Ingresa el primer numero");
        num1 = Integer.parseInt(leer.next());
        num2 = Integer.parseInt(leer.next());
                
        
        System.out.println("La suma es : " + (num1 + num2));
        
    }
    
}
