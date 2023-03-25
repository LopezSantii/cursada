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
public class Circunferencia {
    
    private int radio;

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(int radio){
        this.radio = radio;
    }
    
    public double area(){
        return (Math.PI*radio*radio); 
    }
    
    public double perimetro(){
        return 2*Math.PI*radio; 
    }
            
}
