/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author elhac
 */
public class UtilidadesMain {

    public static void main(String[] args) {

        double resultadoSuma = Utilidades.sumar(10, 5);
        double resultadoResta = Utilidades.restar(10, 5);
        double resultadoMultiplicacion = Utilidades.multiplicar(10, 5);
        double resultadoDivision = Utilidades.dividir(10, 5);
        double resultadoErrorDivision = Utilidades.dividir(10, 0); // ❌ Intento de división por 0

        // Resultados
        System.out.println("Suma: " + resultadoSuma);
        System.out.println("Resta: " + resultadoResta);
        System.out.println("Multiplicación: " + resultadoMultiplicacion);
        System.out.println("División: " + resultadoDivision);
        System.out.println("División con error: " + resultadoErrorDivision);
    }
}
