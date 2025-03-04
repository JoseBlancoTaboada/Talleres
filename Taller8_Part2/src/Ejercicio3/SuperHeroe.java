/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author elhac
 */
public class SuperHeroe {
    private String nombre;
    private String poder;

    public SuperHeroe(String nombre, String poder) {
        this.nombre = nombre;
        this.poder = poder;
    }
}

// Intentamos usar "super" en una clase que NO hereda de otra
public class Main {
    public static void main(String[] args) {
        super.nombre = "Capitán Invencible"; 
        super.poder = "Fuerza sobrehumana";  
    }
}

