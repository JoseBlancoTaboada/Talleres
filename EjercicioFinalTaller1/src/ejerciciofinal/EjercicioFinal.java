/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciofinal;
import java.util.Scanner;

/**
 *
 * @author elhac
 */
public class EjercicioFinal {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);  
        
   System.out.print("Ingrese el título del libro: ");
       String tituloLibro = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autorLibro = scanner.nextLine();
        System.out.print("Ingrese el número de páginas: ");
        int paginasLibro = scanner.nextInt();
        scanner.nextLine();
        Libro libro = new Libro(tituloLibro, autorLibro, paginasLibro);
 System.out.print("-------------------------");
       
        System.out.print("\nIngrese el número de cuenta bancaria: ");
        int numeroCuenta = scanner.nextInt();
        System.out.print("Ingrese el tipo de cuenta: ");
        String tipoCuenta = scanner.nextLine();
        System.out.print("Ingrese el saldo inicial: ");
        int saldo = scanner.nextInt();
        scanner.nextLine(); 
        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);
      System.out.print("-------------------------");

        System.out.print("\nIngrese el nombre del estudiante: ");
        String nombreEstudiante = scanner.nextLine();
        System.out.print("Ingrese la edad del estudiante: ");
        int edadEstudiante = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese el curso del estudiante: ");
        String cursoEstudiante = scanner.nextLine();
        Estudiante estudiante = new Estudiante(nombreEstudiante, edadEstudiante, cursoEstudiante);

       System.out.println("\n--- Detalles del Libro ---");
        
       System.out.println(libro);

        System.out.println("\n--- Detalles de la Cuenta Bancaria ---");
        System.out.println(cuenta);

        System.out.println("\n--- Detalles del Estudiante ---");
        System.out.println(estudiante);

        scanner.close();
    }
}
