/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author elhac
 */
public class Banco {
    private double saldo; 

    // Constructor
    public Banco(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            System.out.println("Error: El saldo inicial no puede ser negativo.");
            this.saldo = 0;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso de $" + cantidad);
        } else {
            System.out.println("Error: No se puede depositar una cantidad negativa.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso de $" + cantidad);
        } else {
            System.out.println("Error: Fondos insuficientes o cantidad inválida.");
        }
    }
}

public class CuentaCorriente extends Banco {
    public CuentaCorriente(double saldoInicial) {
        super(saldoInicial);
    }

    public void mostrarSaldoCuenta() {
        System.out.println("Saldo en la cuenta corriente: $" + getSaldo());
    }
}


