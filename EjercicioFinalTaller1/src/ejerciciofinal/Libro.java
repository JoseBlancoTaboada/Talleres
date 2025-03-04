/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciofinal;

/**
 *
 * @author elhac
 */
public class Libro {
    // Propiedades de la clase
    String titulo;
    String autor;
    int numeroPaginas;

   // Constructor por defecto
    public Libro() {
        titulo = "Desconocido";
        autor = "Desconocido";
        numeroPaginas = 0;
    }
    // Constructor parametrizado
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Método para mostrar los detalles del libro
   @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas;
    }

}
