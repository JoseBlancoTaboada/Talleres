/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author elhac
 */
public class Estudiante {

    private String nombre;
    private int edad;
    private double notaPromedio;

    public Estudiante() {
        nombre = "Desconocido";
        edad = 0;
        notaPromedio = 0;
    }

    public Estudiante(String nombre, int edad, double notaPromedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty() && nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$")) { //El nombre no debe ser nulo o estar vacio y no puede tener numeros
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacío ni contener números.");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 4) { //estudiante debe tener mas de 4 años
            this.edad = edad;
        } else {
            System.out.println("El estudiante debe tener mas de 4 años");
        }
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 1 && notaPromedio <= 5) {
            this.notaPromedio = notaPromedio;
        } else {
            System.out.println("Error: La nota promedio debe estar entre 1 y 5.");
        }
    }

}
