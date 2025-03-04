/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;
import vehiculos.Vehiculo;
import vehiculos.Moto;

/**
 *
 * @author elhac
 */
public class Prueba {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Camioneta");

        Moto moto1 = new Moto("Urbana");

        System.out.println(moto1.tipo);
        moto1.mostrarMoto();
    }
}
