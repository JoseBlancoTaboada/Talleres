/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author elhac
 */
public class AnimeMain {

    public static void main(String[] args) {

        PersonajeAnime personaje1 = new PersonajeAnime();
        PersonajeAnime personaje2 = new Saiyajin();
        PersonajeAnime personaje3 = new Shinigami();

        personaje1.atacar();
        personaje2.atacar();
        personaje3.atacar();
    }

}
