package Ejercicio2;


import Ejercicio2.Matematicas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elhac
 */
public class MatematicasMain {

    public static void main(String[] args) {

        double resultadoSuma = Matematicas.sumar(34, 16);
        double resultadoResta = Matematicas.restar(78, 5);
        double resultadoMultiplicacion = Matematicas.multiplicar(70, 2);
        double resultadoDivision = Matematicas.dividir(478, 7);
        double resultadoErrorDivision = Matematicas.dividir(11, 0); // ❌ Intento de división por 0

        // Resultados
        System.out.println("Suma: " + resultadoSuma);
        System.out.println("Resta: " + resultadoResta);
        System.out.println("Multiplicación: " + resultadoMultiplicacion);
        System.out.println("División: " + resultadoDivision);
        System.out.println("División con error: " + resultadoErrorDivision);
    }
}
