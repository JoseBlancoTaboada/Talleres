/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author elhac
 */
public class VehiculoMain {
    public static void main(String[] args) {
        
        Vehiculo vehiculo1 = new Vehiculo("Tesla", 55);
        Vehiculo coche1 = new Coche(4, "Toyota", 35);
        
        vehiculo1.mostrarDetalles();
        coche1.mostrarDetalles();
        
        
    }
    
}
