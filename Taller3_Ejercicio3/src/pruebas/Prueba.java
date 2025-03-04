/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

/**
 *
 * @author elhac
 */
public class Prueba {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Jose", 18);
        System.out.println("El nombre de la persona es " + persona1.getNombre() + " y su edad es " + persona1.edad);

        System.out.println(persona1.nombre); //no funciona

    }
}
