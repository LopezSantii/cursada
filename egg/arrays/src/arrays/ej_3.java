package arrays;

import java.util.Scanner;

public class ej_3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int [][] matriz1 = new int [3][3];
        int [][] matriz2 = new int [3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese un numero para la matriz en la posicion [ " + i + " ] [ " + j + " ]");
                matriz1[i][j] = leer.nextInt();
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz1[i][j]<0) {
                    matriz2[j][i] = matriz1[i][j] - (matriz1[i][j]*2);
                }else{
                    matriz2[j][i] = matriz1[i][j] + (matriz1[i][j]*2);
                }
            }
        }
        
        System.out.print("Matriz\n");
        mostrarMatriz(matriz1);
        System.out.print("Matriz traspuesta\n");
        mostrarMatriz(matriz2);
        
    }
    
    public static void mostrarMatriz(int[][] matriz){
    
            for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[ " + matriz[i][j] + " ] ");
            }
                System.out.print("\n");
            }
            
    }
}
