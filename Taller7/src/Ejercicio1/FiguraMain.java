/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author elhac
 */
public class FiguraMain {
    public static void main(String[] args) {
        
        Figura circulo1 = new Circulo(5);
        Figura rectangulo1 = new Rectangulo(4, 6);

        circulo1.mostrarArea();
        rectangulo1.mostrarArea();
    }
}
