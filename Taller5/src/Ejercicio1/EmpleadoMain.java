/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author elhac
 */
public class EmpleadoMain {

    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Jose Blanco", 5000);
        Empleado gerente = new Gerente("Refineria","Elian Blsnco",10000);
        
        System.out.println("Detalles del empleado");
        empleado1.mostrarInformacion();
        
        System.out.println("Detalles del Gerente");
        gerente.mostrarInformacion();

    }

}
