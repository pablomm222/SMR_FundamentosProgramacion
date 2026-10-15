package Tema3.EjerciciosT3;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la base imponible: ");
        double baseimponible = sc.nextDouble();

        double iva = 0.21;
        double cuotaiva = baseimponible * iva;
        double total = baseimponible + cuotaiva;

        System.out.println("Base imponible: " + baseimponible + " euros");
        System.out.println("IVA: " + cuotaiva + " euros");
        System.out.println("Total factura: " + total + " euros");

        sc.close();
    }
    
}
