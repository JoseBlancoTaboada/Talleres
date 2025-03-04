/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author elhac
 */
class Moto extends Vehiculo {

    Moto() {

    }

    Moto(String tipo) {
        super(tipo);
    }

    void mostrarMoto() {
        System.out.println("Detalles de la Moto");
        System.out.println("Tipo: " + tipo);
    }

    public static void main(String[] args) {
        Moto moto1 = new Moto();
        moto1.mostrarMoto(); //se imprime que el tipo es desconocido
    }
}
