
package estructuras_de_control;

import java.util.Scanner;

public class ej_9 {

    public static void main(String[] args) {
    
     Scanner leer = new Scanner (System.in);    
        
        int num1 , num2 , i = 0 ;
        
        System.out.print("Ingrese el dividendo");
        num1 = leer.nextInt();
        System.out.print("Ingrese el divisor");
        num2 = leer.nextInt();
        
        do {
           
            System.out.print(num1 + " - " + num2 + " = " + (num1-num2) + "\n");
            num1 = num1 - num2;
            i = i + 1;
            
        } while (nuSm1>num2);
        
        System.out.print("El resto es " + num1 + " y el cociente es " + i);
        
    }
    
}
