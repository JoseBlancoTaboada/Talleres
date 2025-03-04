/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author elhac
 */
public class Persona {
    protected String nombre;
    protected int edad;  

    public Persona() {
        nombre = "Desconocido";
        edad = 0;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
       
    void detallesPersona() {
        System.out.println("Los detalles de la persona son: ");
        System.out.println("\nNombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
}

class Estudiante extends Persona {
    private String matricula;

    public Estudiante(String matricula) {
        this.matricula = matricula;
    }

    public Estudiante(String matricula, String nombre, int edad) {
        super(nombre, edad);
        this.matricula = matricula;
    }
    @Override
    void detallesPersona(){
        System.out.println("--------------------------------");
        System.out.println("\nLos detalles del estudiante son: ");
        System.out.println("\nNombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Matricula: "+matricula);
        
    }
}