/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author elhac
 */
class Vehiculo {

    void moverse() {
        System.out.println("Ahora estoy en movimiento");
    }

}

class Bicicleta extends Vehiculo {

    @Override
    void moverse() {
        System.out.println("Ahora estoy paseando en bicicleta");
    }
}
