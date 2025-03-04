/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author elhac
 */
public class Vehiculo {

    protected String marca;
    protected double velocidadMaxima;

    public Vehiculo() {
        marca = "Desconocida";
        velocidadMaxima = 0;
    }

    public Vehiculo(String marca, double velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    void mostrarDetalles() {
        System.out.println("Detalles del Vehiculo");
        System.out.println("\nMarca: " + marca);
        System.out.println("Velocidad maxima: " + velocidadMaxima);

    }
}

class Coche extends Vehiculo {

    private int numeroDePuertas;

    public Coche() {
        numeroDePuertas = 0;
    }

    public Coche(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public Coche(int numeroDePuertas, String marca, double velocidadMaxima) {
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }
    @Override
    void mostrarDetalles() {
        System.out.println("--------------------");
        System.out.println("\nDetalles del Coche");
        System.out.println("\nMarca: " + marca);
        System.out.println("Velocidad maxima: " + velocidadMaxima);
        System.out.println("Numero de puertas: "+numeroDePuertas);
    }

}
