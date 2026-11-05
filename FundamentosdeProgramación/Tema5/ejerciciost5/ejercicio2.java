package FundamentosdeProgramación.Tema5.ejerciciost5;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();

        if (edad >= 18) {

            System.out.println(edad + " puede entrar");

        }   else{

            System.out.println(edad + " no puede entrar");
        }

    }
    
}
