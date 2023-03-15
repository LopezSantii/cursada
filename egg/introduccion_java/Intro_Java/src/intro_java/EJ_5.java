/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_5;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class EJ_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer  = new Scanner (System.in);
        
        int num1;
        
        System.out.println("Ingrese su numero");
        num1 = Integer.parseInt(leer.next());
        
        System.out.println("Tu numero es: " + num1);
        System.out.println("Su doble es: " + (num1*2));
        System.out.println("Su ttriple es: " + (num1*3));
        System.out.println("Su raiz es: " + sqrt(num1));
        
    }
    
    
}
