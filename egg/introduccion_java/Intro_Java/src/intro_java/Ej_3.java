/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_3;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author santi
 */
public class Ej_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner leer = new Scanner (System.in);
    
    String frase;
    
    System.out.println("Ingrese una frase");
    
    frase = leer.next();
    
    System.out.println(toUpperCase(frase));
    }
    
}
