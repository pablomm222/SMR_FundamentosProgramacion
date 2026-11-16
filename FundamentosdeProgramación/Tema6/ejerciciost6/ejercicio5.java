package FundamentosdeProgramación.Tema6.ejerciciost6;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad;

        System.out.print("Introduce tu edad: ");
        edad = sc.nextInt();

        if (edad < 4) {
            System.out.println("Tarifa: gratis");

        } else if (edad <= 12) {
            
            System.out.println("Tarifa: 0,50 ");

        } else if (edad <= 64) {
            
            System.out.println("Tarifa: 1,20 ");

        } else {
           
            System.out.println("Tarifa: gratis");
        }

        sc.close();
    }
}
    
