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
    private String nombre; // Atributo no estático

    // Un método static intenta acceder a un atributo no estático
    public static void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}

