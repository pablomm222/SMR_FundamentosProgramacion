package EjerciciosT4;

public class ejercicio1 {
    public static void main(String[] args) {
        double numero1 = 7.89;
        int entero = (int) numero1;
        double notaRedondeada = Math.round(numero1);

        System.out.println("Número truncado: " + entero);
        System.out.println("Número redondeado: " + notaRedondeada);
    }
    
}
