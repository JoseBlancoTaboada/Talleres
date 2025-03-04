/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author elhac
 */
public class SuperHeroes {
    private String identidadSecreta; // Atributo privado

    public SuperHeroes(String identidadSecreta) {
        this.identidadSecreta = identidadSecreta;
    }
}

public class SuperVillano extends SuperHeroes {
    public SuperVillano(String identidadSecreta) {
        super(identidadSecreta);
    }

    public void revelarIdentidad() {
        System.out.println("La identidad secreta del héroe es: " + super.identidadSecreta); 
    }
}

