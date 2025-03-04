/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author elhac
 */
public class Persona {

    protected String nombre;
    protected int edad;
    protected String tipoPersona;

    public Persona() {
        nombre = "Desconocido";
        edad = 0;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoPersona = "Persona";
    }

    void mostrarDetalles() {
        System.out.println("Detalles de " + tipoPersona);
        System.out.println("\nNombre: "+nombre);
        System.out.println("Edad: "+edad);
    }

}

class Empleado extends Persona {

    private String departamento;

    Empleado() {
        departamento = "Desconocido";
    }

    public Empleado(String departamento) {
        this.departamento = departamento;
    }

    public Empleado(String departamento, String nombre, int edad) {
        super(nombre, edad);
        this.departamento = departamento;
        this.tipoPersona = "Empleado";
        
    }

    @Override
    void mostrarDetalles(){
        System.out.println("-----------------");
        super.mostrarDetalles();
        System.out.println("Departamento: "+departamento);
    }
    
}
