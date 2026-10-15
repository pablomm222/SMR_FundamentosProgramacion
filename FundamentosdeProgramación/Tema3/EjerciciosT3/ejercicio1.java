package Tema3.EjerciciosT3;

import java.util.Scanner;

public class ejercicio1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce tu nombre: ");
    String nombre = sc.nextLine();

    System.out.println("Tu nombre es: " + nombre);

    sc.close();

}
}
