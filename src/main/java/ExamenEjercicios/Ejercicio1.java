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
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el radio de la esfera: ");
        double radio = scanner.nextDouble();
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
        System.out.println("El volumen de la esfera es: " + volumen);
        scanner.close();
    }
}
