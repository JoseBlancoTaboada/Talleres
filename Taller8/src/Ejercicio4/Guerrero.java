/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author elhac
 */
public class Guerrero {

    public void atacar() {
        System.out.println("El guerrero ataca con su espada.");
    }
}

public class Mago {

    public void lanzarHechizo() {
        System.out.println("El mago lanza un hechizo de fuego.");
    }
}

// Java no admite herencia múltiple de clases
public class Paladin extends Guerrero 

    , Mago { 
    public void defender() {
        System.out.println("El paladín levanta su escudo.");
    }
}
