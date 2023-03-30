/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import clases.Circunferencia;
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
        
        Circunferencia c1 = new Circunferencia ();
        
        System.out.println("Ingrese un radio");
        c1.setRadio(leer.nextInt());
        
        System.out.println("El radio es :" + c1.getRadio() + "\n el area :" + c1.area() + "\n y el perimetro :" + c1.perimetro());
    }
    
}
