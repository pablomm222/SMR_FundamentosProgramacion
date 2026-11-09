package FundamentosdeProgramación.Tema5.ejerciciost5;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Importe de la compra: ");
        double importe = sc.nextDouble();

        final double descuento = 0.10;
        double descuentoAplicado = importe * (1- descuento);

        if (importe > 100){

            System.out.println(descuentoAplicado + " euros precio con descuento");
        
        }   else {

            System.out.println(importe + " euros precio final");
        }

            sc.close();
    }
    
}
