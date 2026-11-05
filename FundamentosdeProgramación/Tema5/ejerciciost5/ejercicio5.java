package FundamentosdeProgramación.Tema5.ejerciciost5;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una contraseña: ");
        String contrasena = sc.nextLine();

        if (contrasena.equals("java123")){

            System.out.println(contrasena + " acceso concedido");
       
        }   else{

            System.out.println(contrasena + " acceso denegado");
        }
    }
    
}
