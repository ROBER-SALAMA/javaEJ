/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenEjercicios;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class MostrarNumeros {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        
        //Usando escritura while
        int c = 0;
        while (c <= 10) {            
            System.out.println(c);
            c++;
        }
        
        //Usando estructura do-while
        int j = 1;
        do {            
            System.out.println(j);
            j++;
        } while (j <= 10);
    }
}
