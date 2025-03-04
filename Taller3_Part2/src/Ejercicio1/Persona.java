/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author elhac
 */
class Persona {

    void presentarse() {
        System.out.println("Buenos dias, me presento");
    }
}

class Estudiante extends Persona {

    @Override
    void presentarse() {
        super.presentarse();
        System.out.println("Soy un estudiante :D");
    }
}

class Profesor extends Persona {

    @Override
    void presentarse() {
        super.presentarse();
        System.out.println("Soy un Profesor >:D");
    }
}
    
    

