package EjerciciosT4;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Primer número: ");
            int numero1 = sc.nextInt();

            System.out.println("Segundo número: ");
            int numero2 = sc.nextInt();
            
            double media = (numero1+numero2)/2;

            System.out.println("La media es: " + media);
    }
    
}
