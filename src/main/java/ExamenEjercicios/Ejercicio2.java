/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenEjercicios;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.print("Introduce la cuota por hora: ");
        double cuotaPorHora = scanner.nextDouble();

        double salarioDiario;
        int horasExtras;

        // Si las horas trabajadas son más de 8, calcular horas extras
        if (horasTrabajadas > 8) {
            horasExtras = horasTrabajadas - 8;
            salarioDiario = (8 * cuotaPorHora) + (horasExtras * cuotaPorHora * 2);
        } else {
            // No hay horas extras
            salarioDiario = horasTrabajadas * cuotaPorHora;
        }
        System.out.println("El salario diario es: " + salarioDiario);
        scanner.close();
    }

}
