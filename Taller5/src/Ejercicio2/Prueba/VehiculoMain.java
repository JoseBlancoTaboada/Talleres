/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2.Prueba;

import Ejercicio2.Moto;

/**
 *
 * @author elhac
 */
public class VehiculoMain {
    public static void main(String[] args) {
        
        Vehiculo moto1 = new Moto("Motocicleta", "Yamaha", 150);

        System.out.println(moto1.tipo); 
        System.out.println(moto1.marca); 

        moto1.mostrarDetalles();

        System.out.println("Detalles de la moto:");
        moto1.mostrarDetalles();
    }
}
