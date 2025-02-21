/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author elhac
 */
public class Estudiante {
    
String nombre;
int edad;
String curso;

public Estudiante (){
    nombre = "Desconocido";
    edad = 0;
    curso = "Desconocido";
}

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiante(String nombre, int edad, String curso) {
        this(nombre,edad);
        this.curso = curso;
    }
    public void detallestEstudiante() {
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad:" + edad);
        System.out.println("Curso: " + curso);
    }
}
