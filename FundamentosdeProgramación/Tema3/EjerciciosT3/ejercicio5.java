package Tema3.EjerciciosT3;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la base del rectángulo: ");
        double base = sc.nextDouble();

        System.out.println("Introduce la altura del rectángulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;

        System.out.println("El área del rectángulo es: " + area);

        sc.close();
    }
    
}
