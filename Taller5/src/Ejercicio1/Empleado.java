/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author elhac
 */
class Empleado {

    protected String nombre;
    protected double salario;

    public Empleado() {
    }

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    void mostrarInformacion() {
        System.out.println("\nNombre: " + nombre);
        System.out.println("Salario: " + salario);
    }

}

class Gerente extends Empleado {
    
    String depertamento;

    public Gerente() {
    }

    public Gerente(String depertamento, String nombre, double salario) {
        super(nombre, salario);
        this.depertamento = depertamento;
    }
    @Override
    void mostrarInformacion(){
        System.out.println("\nDepartamento: "+depertamento);
        super.mostrarInformacion();
    }
}
