package arrays;

import java.util.Scanner;

public class ej_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int[] array = new int [20];
        int num;
        
        for (int i = 0; i < 19; i++)array[i] =(int) (Math.random()*10);
        
        System.out.print("Ingrese el numero que quiere buscar");
        num = leer.nextInt();
        
        for (int i = 0; i < 19; i++) {
            if (array[i] == num)System.out.print("El numero esta en la posicion " + i);
            else System.out.print("El numero no se ha encintrado");
        }
    }
    
}
