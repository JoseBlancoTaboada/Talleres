package Ejercicio2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elhac
 */
public class Matematicas {

        public static double sumar(double a, double b) {
            return a + b;
        }

        public static double restar(double a, double b) {
            return a - b;
        }

        public static double multiplicar(double a, double b) {
            return a * b;
        }

        public static double dividir(double a, double b) {
            if (b != 0) {
                return a / b;
            } else {
                System.out.println("Error: No se puede dividir entre 0.");
                return 0; // Retorna 0 si la división no es válida
            }
        }
    }
