/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciofinal;

/**
 *
 * @author elhac
 */
public class CuentaBancaria {
    
    int numeroCuenta;
    int saldo;
    String tipoCuenta;
    
    public CuentaBancaria(){
        numeroCuenta = 0;
        saldo = 0;
        tipoCuenta = "Desconocida";
    }
    public CuentaBancaria(int numeroCuenta, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    public CuentaBancaria(int numeroCuenta, int saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
    @Override
    public String toString() {
        return "Número de cuenta: " + numeroCuenta + ", Saldo: $" + saldo + ", Tipo: " + tipoCuenta;
    }
}
