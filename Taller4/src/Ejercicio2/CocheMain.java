/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author elhac
 */
public class CocheMain {

    public static void main(String[] args) {
        // Crear un objeto Coche con datos válidos
        Coche coche1 = new Coche("Toyota", "Corolla", 180);
        System.out.println("Marca: " + coche1.getMarca());
        System.out.println("Modelo: " + coche1.getModelo());
        System.out.println("Velocidad Máxima: " + coche1.getVelocidadMaxima() + " km/h");

        System.out.println(coche1.marca);
        System.out.println(coche1.modelo);
        System.out.println(coche1.velocidadMaxima);

        coche1.velocidadMaxima = 200;
        coche1.acelerar(-20);
        coche1.acelerar(30);

        System.out.println("\nDespués de intentos inválidos:");
        System.out.println("Velocidad Máxima: " + coche1.getVelocidadMaxima() + " km/h");
    }
}
