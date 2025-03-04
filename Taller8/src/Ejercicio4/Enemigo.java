/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author elhac
 */
public class Enemigo {

    private int vida;

    public Enemigo(int vida) {
        this.vida = vida;
    }
}

// intenta acceder a vida directamente
public class JefeFinal extends Enemigo {

    public JefeFinal(int vida) {
        super(vida);
    }

    public void mostrarVida() {
        System.out.println("Vida del jefe final: " + vida); // la vida tiene acceso privado
    }
}
