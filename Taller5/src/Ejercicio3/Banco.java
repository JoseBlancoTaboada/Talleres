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
 protected double saldo;

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: $" + saldo);
    }
}

public class CuentaCorriente extends Banco {
    public CuentaCorriente(double saldoInicial) {
        super(saldoInicial);
    }

    public void modificarSaldo(double nuevoSaldo) {
        this.saldo = nuevoSaldo; 
    }
}

public class BancoMain {
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente(1000);

        cuenta1.mostrarSaldo();

        cuenta1.modificarSaldo(-5000); 

        System.out.println("\nDespués de modificar el saldo sin control:");
        cuenta1.mostrarSaldo();
    }
}
