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
        Persona persona1 = new Persona();
        Persona estudiante1 = new Estudiante();
        Persona profesor1 = new Profesor();
        
        persona1.presentarse();
        System.out.println("--------------------");
        estudiante1.presentarse();
        System.out.println("--------------------");
        profesor1.presentarse();
    }
    
}

