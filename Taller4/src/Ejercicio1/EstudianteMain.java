/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author elhac
 */
public class EstudianteMain {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Jose Blanco1", 18, 5);
        System.out.println("El nombre del estudiante es: " + estudiante1.getNombre());
        System.out.println("-----------------");

        Estudiante estudiante2 = new Estudiante();
        estudiante2.setEdad(21);
        estudiante2.setNombre("Elian Blanco");
        estudiante2.setNotaPromedio(4.5);

        System.out.println("\nLos datos del estudiate son:");
        System.out.println("Nombre: " + estudiante2.getNombre());
        System.out.println("Edad: " + estudiante2.getEdad());
        System.out.println("Nota Promedio: " + estudiante2.getNotaPromedio());
    }

}
