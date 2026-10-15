package Tema3.EjerciciosT3;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("Introduce el primer número: ");
    int numero1 = sc.nextInt();

    System.out.println("Introduce el segundo número: ");
    int numero2 = sc.nextInt();

    int suma = numero1 + numero2;
    System.out.println("La suma es: " + suma);
    
sc.close();
    }
}
