/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author elhac
 */
public class Empleado {

    public String nombre;
    double salario;

    public Empleado() {
        nombre = "Desconocido";
        salario = 0;
    }
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario>0) {
        this.salario = salario;
        }
        else {
            System.out.println("El salario tiene que ser mayor a cero");
        }
    }
    
    void detallesEmpleado(){
        System.out.println("\nEl nombre del epleado es: "+nombre);
        System.out.println("El salario del epleado es: "+salario);
    }

}
