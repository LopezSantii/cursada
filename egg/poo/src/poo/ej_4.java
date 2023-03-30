/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import clases.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class ej_4 {

    public static void main(String[] args) {
        Rectangulo r1= new Rectangulo();
        llenar(r1);
        
        System.out.println("Este es tu rectanfulo");
        r1.dibujarRectangulo();
        System.out.println("El perimetro es :" + r1.calcularPerimetro());
        System.out.println("La superficie es :" + r1.calcularSuperficie());
    }
    
    public static void llenar(Rectangulo r1){
        Scanner leer = new Scanner (System.in);
        double b,a;
        System.out.println("Ingrese la base del rectangulo");
        b=leer.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        a=leer.nextDouble();
        r1.setTodo(b,a);
    }
}
