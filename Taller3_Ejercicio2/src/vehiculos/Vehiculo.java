/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author elhac
 */
class Vehiculo {

    String tipo;

    Vehiculo() {
        tipo = "Desconocido";
    }

    Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    void mostrarTipo() {
        System.out.println("Detalles del vehiculo");
        System.out.println("Tipo: " + tipo);
    }
}
