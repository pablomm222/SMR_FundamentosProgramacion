package Tema3.EjerciciosT3;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el radio del círculo: ");
        double radio = sc.nextDouble();
        final double pi = 3.14159;
        double area = pi * radio * radio;

        System.out.println("El área del circulo es: " + area);

        sc.close();
    }
    
}
