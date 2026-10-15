package Tema3.EjerciciosT3;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Precio del producto: ");
        double precio = sc.nextDouble();

        final double descuento = 0.10;
        double preciofinal = precio * (1 - descuento);

        System.out.println("El precio final es: " + preciofinal + " euros");

        sc.close();
    }
    
}
