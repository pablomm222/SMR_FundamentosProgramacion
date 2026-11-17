package FundamentosdeProgramación.Tema7.ejerciciost7;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("a) Café 1,20 euros   b) Té 1,00 euro   s) Zumo 2,00 euros");
        char opcion = sc.next().charAt(0);

        double precio = 0;

        System.out.println("Elige la cantidad");
        int cantidad = sc.nextInt();

        switch (opcion) {
            case 'a':
                precio = 1.2;
                System.out.println("Has elegido Café");
                break;
            case 'b':
                precio = 1.00;
                System.out.println("Has elegido Té");
                break;
            case 'c':
                precio = 2.00;
                System.out.println("Zumo");
                break;
            default:
                System.out.println("Opción incorrecta");
        }

        System.out.println("El precio final es " + precio * cantidad);
    }
    
}
