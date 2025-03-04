/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author elhac
 */
public class Producto {
    
    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public void mostrarProducto(){
        System.out.println("Los detalles del producto son: " );
        System.out.println("\nNombre del producto: " + nombre);
        System.out.println("Precio del producto: " + precio);

    }
}
