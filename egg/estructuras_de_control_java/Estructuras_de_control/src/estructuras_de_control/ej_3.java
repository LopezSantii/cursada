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
public class ej_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        String frase;
        System.out.print("Ingrese una frase que tenga 8 caracteres");
        frase = leer.next();
        
        if (frase.length() == 8) {
            System.out.print("CORRECTO");
        }else{
            System.out.print("INCORRECTO");
        }
        
        
    }
    
}
