/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author elhac
 */
interface Nadador {

    void nadar();
}

interface Respirador {

    void respirar();
}

public class Pez implements Nadador, Respirador {

    @Override
    public void nadar() {
        System.out.println("El pez esta nadando");
    }

    @Override
    public void respirar() {
        System.out.println("El pez esta respirando");
    }
}
