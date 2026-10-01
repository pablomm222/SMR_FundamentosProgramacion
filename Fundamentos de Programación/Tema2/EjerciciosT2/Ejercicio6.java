package Tema2.EjerciciosT2;

public class Ejercicio6 {
    public static void main(String[] args) {
        double baseImponible = 200.0;
        double iva = 0.21;
        double total = baseImponible * (1 + iva);

        System.out.printf("Base imponible: %8.2f €%n", baseImponible);
        System.out.printf("Total con IVA:  %8.2f €%n", total);
    }
    
}
