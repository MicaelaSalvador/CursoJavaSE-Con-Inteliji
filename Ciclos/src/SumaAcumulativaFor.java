public class SumaAcumulativaFor {
    public static void main(String[] args) {
        System.out.println("Suma Acumulativa FOR");

        final var MAXIMO=5;
        var sumaAcumulativa =0;
        for (var numero =1; numero <= MAXIMO ; numero++){
            System.out.println("Números sumados : " + sumaAcumulativa + " y " + numero);
            sumaAcumulativa += numero;
            System.out.println("Suma acumulativa es  : " + sumaAcumulativa);
        }
        System.out.println("La suma acumulativa es: " + sumaAcumulativa);
    }
}
