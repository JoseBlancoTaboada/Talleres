/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author elhac
 */
public class Vehiculo {

    protected String tipo;
    protected String marca;

    public Vehiculo() {
    }

    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    protected void mostrarDetalles() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
    }
}

class Moto extends Vehiculo {

    private int cilindrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    @Override
    protected void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Cilindrada: " + cilindrada);
    }
}
