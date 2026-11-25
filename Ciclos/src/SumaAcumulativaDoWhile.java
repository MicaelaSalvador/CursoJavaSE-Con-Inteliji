public class SumaAcumulativaDoWhile {
    public static void main(String[] args) {
        System.out.println("Suma acumulativa ciclo do while");
        final var MAXIMO = 5;
        var sumaAcumulativa = 0;
        var numero = 1;
        do {
            System.out.println("Número sumados  :" + sumaAcumulativa + " + " +  numero);
            sumaAcumulativa += numero++;
            System.out.println("Suma acumulativa : " + sumaAcumulativa);

        } while (numero <= MAXIMO);

        System.out.println("Suma total de 5 números : " + sumaAcumulativa);
    }
}
