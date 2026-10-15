package Tema3.EjerciciosT3;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la base del triángulo: ");
        double base = sc.nextDouble();

        System.out.println("Introduce la altura del triángulo: ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("El área del rectángulo es: " + area);

        sc.close();
    }
    
}
