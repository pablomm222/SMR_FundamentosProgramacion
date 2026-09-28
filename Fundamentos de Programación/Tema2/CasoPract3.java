package Tema2;

public class CasoPract3 {

    public static void main(String[] args) {
        int miEntero1;
        int miEntero2;
        boolean esCorrecto;
        int resutadoSuma;
        int resutadoResta;
        int resutadoDivision;
        int resutadoMultiplicacion;

        miEntero1 = 1;
        miEntero2 = 2;
        esCorrecto = false;
        resutadoSuma = miEntero1 + miEntero2;
        resutadoResta = miEntero1 - miEntero2;
        resutadoDivision = miEntero1 / miEntero2;
        resutadoMultiplicacion = miEntero1 * miEntero2;


        esCorrecto = (resutadoSuma > resutadoResta) &&false;


        System.out.println("--mientero1: " + miEntero1);
        System.out.println("--mientero2: " + miEntero2);
        System.out.println("--resultadoSuma: " + resutadoSuma);
        System.out.println("--resultadoResta: " + resutadoResta);
        System.out.println("--resultadoDivision: " + resutadoDivision);
        System.out.println("--resultadoMultiplicacion: " + resutadoMultiplicacion);
        System.out.println("--esCorrecto: " + esCorrecto);

    }
    
}
