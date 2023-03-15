/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_4;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Ej_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer  = new Scanner (System.in);
        
        int grados;
        
        System.out.println("Ingrese los grados centigrados");
        grados = Integer.parseInt(leer.next());
        
        
        System.out.println((32 + (9* grados/5))+" °F");
    }
    
}
