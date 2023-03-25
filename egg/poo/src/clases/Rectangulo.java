/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author santi
 */
public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {
    }
    
    public Rectangulo(double base,double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public void setTodo(double base,double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double getBase() {
        return this.base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public double getAltura() {
        return this.altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calcularSuperficie() {
        return this.base * this.altura;
    }
    
    public double calcularPerimetro() {
        return (this.base + this.altura) * 2;
    }
    
    public void dibujarRectangulo() {
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                if (i == 0 || i == this.altura-1 || j == 0 || j == this.base-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
