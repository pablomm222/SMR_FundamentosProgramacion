package FundamentosdeProgramación.Tema6.ejerciciost6;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el sueldo anual: ");
        double sueldo = sc.nextDouble();

        if (sueldo <= 12000){

            System.out.println("retención 0%");

        }   else if (sueldo <= 25000){

            System.out.println("retención 10%");

        }   else if (sueldo <= 40000){

            System.out.println("retención 20%");

        }   else{

            System.out.println("retención 30%");
        }


    }
    
}
