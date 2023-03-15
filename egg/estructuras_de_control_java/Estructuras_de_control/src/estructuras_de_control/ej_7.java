
package estructuras_de_control;

import java.util.Scanner;

import static com.sun.xml.internal.bind.v2.schemagen.Util.equalsIgnoreCase;

public class ej_7 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
     Scanner leer = new Scanner (System.in);
     
     String frase;
     int contador_correcto = 0, contador_incorrecto = 0;
     
        do {
            System.out.print("Ingrese una frase");
            frase = leer.next();
            
            if (equalsIgnoreCase(frase.substring(0,0),"X") && frase.length() == 5 && equalsIgnoreCase(frase.substring(4,4),"O")) {
                contador_correcto = 1 + contador_correcto;
            } else {
                
                contador_incorrecto = 1 + contador_incorrecto;
            }
            
        } while (!equalsIgnoreCase(frase,"&&&&&"));            
       
        System.out.print("Correctos : " + contador_correcto + "\n");
        System.out.print("Incorrectos : " + contador_incorrecto);
    }

    private static boolean equals(String substring, String x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
