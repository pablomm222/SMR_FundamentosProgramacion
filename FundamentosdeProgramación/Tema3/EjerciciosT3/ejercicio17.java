package Tema3.EjerciciosT3;

import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        int numero1 = sc.nextInt();
        int doble = numero1*2;
        int triple = numero1*3;

        System.out.println("El doble de " + numero1 + " es " + doble);
        System.out.println("El triple de " + numero1 + " es " + triple);

        sc.close();
    }
    
}
