package FundamentosdeProgramación.Tema5.ejerciciost5;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edadTrabajar = sc.nextInt();

        if (edadTrabajar >= 18 && edadTrabajar <= 64) {

            System.out.println(edadTrabajar + " tiene edad de trabajar");

        }   else {

            System.out.println(edadTrabajar + " no tiene edad de trabajar");
        }
    }
    
}
