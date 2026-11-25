public class PalabraBreakContinue {
    public static void main(String[] args) {
        System.out.println("*** Ejemplo de break y continue ***");
        //Ejemplo Break, solo imprime un número par y sale del bucle
        System.out.println("\n palabra break");
        for (int numero = 1; numero<= 10; numero++) {
            if (numero %2 == 0) {
                System.out.println("El número " + numero + " es par");
                break;
            }
        }

        // Ejemplo Continue, imprime los números pares, ignorando los impares
        System.out.println("\n palabra continue");
        for (int numero = 1; numero<= 10; numero++) {
            if (numero %2 != 0) { // número impar
                continue;// saltamos al siguiente iteración del bucle
            }
            System.out.println("El número " + numero + " es par");
        }
    }
}
