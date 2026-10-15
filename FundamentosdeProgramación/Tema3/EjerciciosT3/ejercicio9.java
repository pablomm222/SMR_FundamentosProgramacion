package Tema3.EjerciciosT3;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cantidad en pesetas: ");
        double pesetas = sc.nextDouble();

        final double Cambio = 166.386;

        double euros = pesetas / Cambio;

        System.out.println("Son " + euros + " euros");

        sc.close();
    }
    
}
