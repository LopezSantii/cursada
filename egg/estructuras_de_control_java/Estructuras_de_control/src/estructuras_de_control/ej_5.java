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
public class ej_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int limit,num,cont=0;
        
        System.out.print("Ingrese un numero limite");
        limit = leer.nextInt();
        
        do {
            System.out.print("Ingrese un numero");
            num=leer.nextInt();
            cont= num + cont;
        } while (cont<limit);
        
    } 
}
