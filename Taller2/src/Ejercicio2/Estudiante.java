/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author elhac
 */
public class Estudiante {

    String nombre;
    int edad;

    public Estudiante() {
        this("Desconocido", 0);
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void detallesEstudiante() {
        System.out.println("El estudiante " + nombre + " tiene " + edad + "años");
    }
}

