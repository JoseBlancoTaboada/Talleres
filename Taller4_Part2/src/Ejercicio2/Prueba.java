/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author elhac
 */
public class Prueba {

    public static void main(String[] args) {
        
        CuentaBancaria cuenta1 = new CuentaBancaria(12345, 45000, "Corriente");
        
        System.out.println("Numero de cuenta: "+cuenta1.numeroCuenta);
        System.out.println("Saldo: "+cuenta1.getSaldo());
        System.out.println("Tipo de cuenta: "+cuenta1.tipoCuenta);
        
        cuenta1.detallesCuenta();

    }

}
