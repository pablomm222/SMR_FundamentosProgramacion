package Tema3.EjerciciosT3;

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();

        int edadfinal = edad + 5;

        System.out.println("En 5 años tendras: " + edadfinal);
        
        sc.close();
    }
    
}
