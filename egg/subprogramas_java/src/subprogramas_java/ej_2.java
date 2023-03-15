/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subprogramas_java;

import static com.sun.xml.internal.bind.v2.schemagen.Util.equalsIgnoreCase;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class ej_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        String nombre ,respuesta ;
        int edad;
        
        do {
            System.out.print("Ingrese el nombre de la presona");
            nombre = leer.next();
            
            System.out.println("Ingrese la edad de " + nombre);
            edad = leer.nextInt();
            
            calcular_edad(nombre,edad);
            
            System.out.print("¿Quire seguir mostrando personas?");
            respuesta = leer.next();
        } while (equalsIgnoreCase(respuesta,"si"));
        
        
        
        
    }
    
    public static void calcular_edad(String nombre, int edad){
    
        if (edad <= 18) {
            System.out.println(nombre + " es mayor");
        } else {
            System.out.println(nombre + " es menor");
        }
        
    }
    
}
