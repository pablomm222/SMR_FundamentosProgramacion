package Tema3.EjerciciosT3;

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("Introduce tu edad: ");
    int edad = sc.nextInt();
    sc.nextLine();

    System.out.println("Introduce tu nombre: ");
    String nombre = sc.nextLine();

    System.out.println(nombre + " tiene " + edad + " años");

    sc.close();

    }
    
}
