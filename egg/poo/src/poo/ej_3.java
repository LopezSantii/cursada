/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import clases.Operaciones;
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
        
        Operaciones c1 = new Operaciones();
        
        llenar(c1);
        
        System.out.println("los numeros son " + c1.getNum1() +" y " + c1.getNum2() + "\n" +
        "La suma es " + c1.sumar() + "\n" + "La resta es " + c1.restar() + "\n" +
        "La multiplicacion es " + c1.multiplicar() + "\n" + "La divicion es " + c1.dividir()        
        );
    }
    
    public static void llenar(Operaciones c1){
        Scanner leer = new Scanner (System.in);
        int num1,num2;
        System.out.println("Ingrese el primer numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese el primer numero");
        num2 = leer.nextInt();
        c1.crearOperacion(num1, num2);
    }
}
