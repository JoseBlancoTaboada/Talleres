/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author elhac
 */
public class Persona {
    private String nombre; 

    public Persona(String nombre) {
        this.nombre = nombre;
    }
}
public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");

        // No se puede acceder directamente a "nombre" porque es privado
        System.out.println(persona1.nombre); 
    }
}
