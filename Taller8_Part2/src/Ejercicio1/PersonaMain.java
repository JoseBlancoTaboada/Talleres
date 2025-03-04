/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author elhac
 */
public class PersonaMain {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Jose Blanco", 18);
        Persona empleado1 = new Empleado("Servicios humanos", "Vegeta", 46);
        
        persona1.mostrarDetalles();
        empleado1.mostrarDetalles();

    }

}
