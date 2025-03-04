/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author elhac
 */
public class Empleado {

    protected String nombre;
    protected double salario;
    protected String tipoEmpleado;

    public Empleado() {
        nombre = "Desconocido";
        salario = 0;
        tipoEmpleado = "Desconocido";
    }

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
        this.tipoEmpleado = "Empleado";
    }

    void mostrarDetalles() {
        System.out.println("Detalles del " + tipoEmpleado);
        System.out.println("\nNombre: " + nombre);
        System.out.println("Salario: $" + salario + " Dolares");
    }

}

class Gerente extends Empleado {

    private String departamento;

    public Gerente() {
        departamento = "Desconocido";
        tipoEmpleado = "Desconocido";
    }

    public Gerente(String departamento) {
        this.departamento = departamento;

    }

    public Gerente(String departamento, String nombre, double salario) {
        super(nombre, salario);
        this.departamento = departamento;
        this.tipoEmpleado = "Gerente";
    }

    void mostrarDetalles() {
        System.out.println("--------------------");
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }

}
