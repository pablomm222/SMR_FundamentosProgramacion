package Tema3.EjerciciosT3;

import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Minutos: ");
        int minutos = sc.nextInt();
        final int segundos = minutos*60;

        System.out.println(minutos + " minutos " + "son " + segundos + " segundos");

        sc.close();
    }
    
}
