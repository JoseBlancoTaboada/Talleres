/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author elhac
 */
public class EmpleadoMain {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Jose Blanco", 10000);
        Empleado gerente1 = new Gerente("Salud publica", "Rosadela Taboada", 5000);
        
        empleado1.mostrarDetalles();
        gerente1.mostrarDetalles();
    }
    
}
