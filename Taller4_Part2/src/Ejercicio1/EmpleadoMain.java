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
        
        System.out.println("El nombre del epleado es: "+empleado1.nombre);
        System.out.println("El salario del empleado es: "+empleado1.getSalario());
        
        empleado1.setSalario(6000);
        
        empleado1.detallesEmpleado();
        
    }
}
