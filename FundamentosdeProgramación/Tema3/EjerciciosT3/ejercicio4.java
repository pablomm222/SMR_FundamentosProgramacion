package Tema3.EjerciciosT3;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        double num1 = sc.nextDouble();

        System.out.println("Introduce el segundo número: ");
        double num2 = sc.nextDouble();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double Multiplicación = num1 * num2;
        double División = num1 / num2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + Multiplicación);
        System.out.println("División: " + División);
        sc.close();
    }
    
}
