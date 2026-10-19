package EjerciciosT4;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.println("Introduce una letra: ");
         char letra = sc.nextLine().charAt(0);
        

         System.err.println((int)letra);

         //System.out.println("La letra siguiente es: " + (char)(letra+1));

    }
    
}
