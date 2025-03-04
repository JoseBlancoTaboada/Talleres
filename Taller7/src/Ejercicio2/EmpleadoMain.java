/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author elhac
 */
public class EmpleadoMain {
    public static void main(String[] args) {
        
        Empleado gerente = new Gerente("Juan López", 3000, 1000);
        Empleado vendedor = new Vendedor("Jose Blanco", 2000, 50, 20);

        gerente.mostrarDetalles();
        vendedor.mostrarDetalles();
    }
}

