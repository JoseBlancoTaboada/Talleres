/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author elhac
 */
public class Animal {

    protected String especie;
    protected String tipoAnimal;

    public Animal() {
        especie = "Desconocida";
    }

    public Animal(String especie) {
        this.especie = especie;
        this.tipoAnimal = "Animal";
    }

    void mostrarEspecie() {
        System.out.println("Detalles de " + tipoAnimal);
        System.out.println("\nEspcie: " + especie);

    }

}

class Pez extends Animal {

    private String tipoDeAgua;

    public Pez() {
        tipoDeAgua = "Desconocida";
    }

    public Pez(String tipoDeAgua) {
        this.tipoDeAgua = tipoDeAgua;
    }

    public Pez(String tipoDeAgua, String especie) {
        super(especie);
        this.tipoDeAgua = tipoDeAgua;
        this.tipoAnimal = "pez";
    }

    @Override
    void mostrarEspecie() {
        System.out.println("--------------------");
        super.mostrarEspecie();
        System.out.println("Tipo de agua: " + tipoDeAgua);
    }

}
