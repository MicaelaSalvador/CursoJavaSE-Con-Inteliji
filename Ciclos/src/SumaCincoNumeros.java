public class SumaCincoNumeros {
    public static void main(String[] args) {
        System.out.println("Suma de cinco números");

        final var VALOR_MAXIMO = 5;
        var numero = 1;
        var sumaAcomulativa = 0;

        while (numero <= VALOR_MAXIMO) {
            System.out.println("Imprime lo que se va sumar " + sumaAcomulativa + " " + numero );
            sumaAcomulativa += numero++;
            System.out.println("Suma parcial acumulativa" + sumaAcomulativa);
        }
        System.out.println("La suma de los primeros  " + VALOR_MAXIMO + " números" + " es : " + " " + sumaAcomulativa);
    }
}
