/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras_de_control;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
        int num = leer.nextInt();
        
        if (num%2==0) {
            System.out.print("El numero es par");
        }else{
            System.out.print("El numero es impar");
        } 
        
        
    }
    
}
