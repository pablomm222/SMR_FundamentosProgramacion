package FundamentosdeProgramación.Tema6.ejerciciost6;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int num1 = sc.nextInt();

        if (num1 >=1){

            System.out.println("Positivo");
        
        }   else if (num1 < 0) {

            System.out.println("Negativo");

        }   else {

            System.out.println("0");
        }
    }
    
}
