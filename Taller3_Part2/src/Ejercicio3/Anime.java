/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author elhac
 */
public class PersonajeAnime {
    public void atacar() {
        System.out.println("El personaje ataca con una técnica básica.");
    }
}

public class Saiyajin extends PersonajeAnime {
  
    @Override
    public void atacar(String poder) {  
        System.out.println("El Saiyajin ataca con: " + poder);
    }

    @Override
    public void atacar() {
        System.out.println("El Saiyajin lanza un Kamehameha.");
    }
}

public class Shinigami extends PersonajeAnime {
    public void atacar() { 
        System.out.println("El Shinigami usa su Zampakuto.");
    }

    @Override
    public void atacar() {
        System.out.println("El Shinigami usa su Zampakuto para cortar al enemigo.");
    }
}


