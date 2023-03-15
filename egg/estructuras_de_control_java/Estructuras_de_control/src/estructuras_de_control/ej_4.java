/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras_de_control;

import static com.sun.xml.internal.bind.v2.schemagen.Util.equalsIgnoreCase;
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
        
        System.out.print("Ingrese una frase que inicie con la letra A");
        String frase = leer.next();
        
        if (equalsIgnoreCase(frase.substring(0,1),"a")) {
            System.out.print("CORRECTO");
        }else {
            System.out.print("IMCORRECTO tu frase fue : " + frase);
        }
        
    }
    
}
