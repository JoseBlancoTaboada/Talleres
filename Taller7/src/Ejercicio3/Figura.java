/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author elhac
 */
public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();
}

//public class FiguraMain {
   // public static void main(String[] args) {
       // Figura figura = new Figura("Círculo"); 

       // System.out.println("Área: " + figura.calcularArea());
 //   }
//}

//Corrreccion

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        super("Círculo");
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}

// Uso correcto en FiguraMain
class FiguraMain {
    public static void main(String[] args) {
        Figura figura = new Circulo(5); 
        System.out.println("Área: " + figura.calcularArea());
    }
}




