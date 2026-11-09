package FundamentosdeProgramación.Tema5.ejerciciost5;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la nota: ");
        double nota = sc.nextDouble();

        if (nota >= 5) {

            System.out.println(nota + " aprobado");
        
        }   else {
            System.out.println(nota + " suspenso");
        }
    }
    
}
