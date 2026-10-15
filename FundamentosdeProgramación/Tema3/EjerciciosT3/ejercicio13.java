package Tema3.EjerciciosT3;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cantidad en euros: ");
        double euros = sc.nextDouble();

        final double cambio = 1.10;

        double dolares = euros * cambio;

        System.out.println(euros + " euros son " + dolares + " dolares");

        sc.close();
    }
    
}
