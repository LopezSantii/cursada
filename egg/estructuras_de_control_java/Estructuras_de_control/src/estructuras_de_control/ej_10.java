
package estructuras_de_control;

import java.util.Scanner;

public class ej_10 {


    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);    
        int num1 ,num2, usuario;
        
        
        num1 = (int) (Math.random()*11);
        num2 = (int) (Math.random()*11);
        
        do {
            System.out.print("Inrese un numero");
            usuario = leer.nextInt();
            
        } while ( !((num1 * num2)==usuario));
        
        System.out.print("Has acertado el numero era : " + num1 * num2);
    }
    
}
