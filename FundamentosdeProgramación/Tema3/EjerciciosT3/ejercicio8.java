package Tema3.EjerciciosT3;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cantidad en euros: ");
        double euros = sc.nextDouble();

        double Cambio = 166.386;

        double pesetas = euros * Cambio;

        System.out.println(euros + " euros son " + pesetas + " pesetas.");

        sc.close();
    }
    
}
