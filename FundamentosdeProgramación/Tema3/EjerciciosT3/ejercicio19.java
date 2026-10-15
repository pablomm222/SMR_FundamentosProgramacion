package Tema3.EjerciciosT3;

import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nota 1: ");
        double nota1 = sc.nextDouble();
        
        System.out.println("Nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.println("Nota 3: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("La nota media es: " + media);

        sc.close();
    }
    
}
