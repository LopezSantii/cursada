/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subprogramas_java;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class ej_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int num;
        System.out.print("Ingrese un número entero positivo: ");
        num = leer.nextInt();
        
        System.out.print(primo(num));
        
    }
    
    public static boolean primo(int num){
    
        if (num <=1) return false; 
        else for (int i = 2; i < num; i++)if (num % i == 0) return false;
        return true;
        
    }
    
}
