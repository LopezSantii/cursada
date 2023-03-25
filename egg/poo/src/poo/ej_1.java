/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import clases.Libro;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class ej_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Libro l1 = new Libro();
        
        llenar(l1);
        
        System.out.println(l1.toString());
        
    }
    
    public static void llenar (Libro l1){
        Scanner leer = new Scanner (System.in);
        String t,a,n;
        
        System.out.println("Ingrese el titulo del libro");
        t = leer.next();
        System.out.println("Ingrese el autor del libro");
        a = leer.next();
        System.out.println("Ingrese el numero de paginas del libro");
        n =leer.next();
        l1.setTodo(t,a,n);
    }
    
}
