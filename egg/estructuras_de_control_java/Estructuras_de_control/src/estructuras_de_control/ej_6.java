package estructuras_de_control;

import java.util.Scanner;

public class ej_6 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int num1, num2, menu;
        
        System.out.print("Ingrese dos numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        System.out.print("MENU \n1.Sumar \n2.Restar \n3.Multiplicar \n4.Dividir \n5.Salir");
        menu = leer.nextInt();
        
        switch (menu){
            
            case 1: 
                System.out.print("La suma de : " + num1 + " y " + num2 + " es : " + (num1+num2));
            break;
            case 2: 
                System.out.print("La resta de : " + num1 + " y " + num2 + " es : " + (num1-num2));
            break;
            case 3: 
                System.out.print("La multiplicacion de : " + num1 + " y " + num2 + " es : " + (num1*num2));
            break;
            case 4: 
                System.out.print("La division de : " + num1 + " y " + num2 + " es : " + (num1/num2));
            break;
            case 5: 
                System.out.print("Salir");
            break;
            
        }
        
        
    }
    
}
