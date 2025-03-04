/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author elhac
 */
public interface Volador {
    void volar(); // Método abstracto obligatorio
}

public class Superheroe implements Volador {
    private String nombre;

    public Superheroe(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarPoder() {
        System.out.println(nombre + " tiene superpoderes.");
    }
}

