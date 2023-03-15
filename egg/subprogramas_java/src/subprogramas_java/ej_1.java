/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subprogramas_java;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner (System.in);
        int eleccion, num1 ,num2;
        
        
        System.out.print("Bienvenido a la calucladora virtual \nElija la operacion que quiere realizar \n1_Sumar \n2_Restar \n3_Multiplicar \n4_Dividir");
        eleccion = leer.nextInt();
        
        System.out.print("Ingrese el primer numero");
        num1 = leer.nextInt();
        System.out.print("Ingrese el primer numero");
        num2 = leer.nextInt();
        
        System.out.print("El resultado es: " + calculadora(num1,num2,eleccion));
    }
    
    public static int calculadora(int num1, int num2, int eleccion){
        
        int resultado = 0;
        
        switch(eleccion){
            
            case 1: resultado = num1 + num2;
            break;
            
            case 2: resultado = num1 - num2;
            break;
            
            case 3: resultado = num1 * num2;
            break;
            
            case 4: resultado = num1 / num2;
            break;
            
        
        
        }
        return resultado;
        
        
    }
}

