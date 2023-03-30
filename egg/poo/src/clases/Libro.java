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
public class Libro {
    
    private String titulo,autor,numero_de_paginas;
    private int isbn;

    public Libro() {
    }

    public Libro(String titulo, String autor, String numero_de_paginas, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.numero_de_paginas = numero_de_paginas;
        this.isbn = isbn;
    }

 
    public void setTodo(String titulo,String autor,String numero_de_paginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.numero_de_paginas = numero_de_paginas;
        this.isbn = (int) (Math.random()*100);
    }
    
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", numero_de_paginas=" + numero_de_paginas + ", isbn=" + isbn + '}';
    }
    
    
    
}
