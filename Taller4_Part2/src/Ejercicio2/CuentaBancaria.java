/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author elhac
 */
public class CuentaBancaria {

    private int numeroCuenta;
    private double saldo;
    public String tipoCuenta;

    public CuentaBancaria() {
        numeroCuenta = 0;
        saldo = 0;
        tipoCuenta = "Desconocida";
    }

    public CuentaBancaria(int numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    void detallesCuenta() {
        System.out.println("\nNumero de la cuenta: "+numeroCuenta);
        System.out.println("Saldo: "+numeroCuenta);
        System.out.println("Tipo de Cuenta: "+tipoCuenta);
    }

}
