/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author elhac
 */
public class Coche {
    
    String marca;
    String modelo;
    static int contadorCoches = 0;

    public Coche() {
        contadorCoches++;
    }
    static void mostrarContador() {
        System.out.println("Numero de coches: "+contadorCoches);
    }
    
    
}
