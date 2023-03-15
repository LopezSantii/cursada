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
public class ej_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int eur;
        
        System.out.print("Bienvenido a la conversora de Euros \n");
        System.out.print("Por favor ingrese la cantidad de euros que desea convertir");
        eur = leer.nextInt();
        
        conversor(eur);
        
    }
    
    public static void conversor(int eur){
        Scanner leer = new Scanner (System.in);
        
        System.out.print("Porfavor elija a que moneda quiere convertir sus euros \n1_Libras \n2_Dolares \n2_Yenes");
        int eleccion = leer.nextInt();
        
        switch(eleccion){
            case 1: System.out.print("Tus " + eur + "€ son " + (eur*0.86) + " libras");
                break;
            case 2:System.out.print("Tus " + eur + "€ son " +  "$" +(eur*1.28611) );
                break;
            case 3:System.out.print("Tus " + eur + "€ son " + (eur*129.852) + " yenes");
                break;

        }
        
    }
}
