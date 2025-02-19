/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author elhac
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        
        CuentaBancaria cuenta1 = new CuentaBancaria(345,97876, "Cuenta nómina");
        
        System.out.println("Los detalles de la cuenta 1 son:");
        cuenta1.detallesCuenta();
        
        CuentaBancaria cuenta2 = new CuentaBancaria(789,56789,"Cuenta corriente");
        System.out.println("\nLos detalles de la cuenta 2 son:");
        cuenta2.detallesCuenta();
        
    }
}
