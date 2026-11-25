import java.util.Random;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        System.out.println("*** Bienvenido al juego de adivinanza ***");
        var console = new java.util.Scanner(System.in);
        var random = new Random();

        //generamos un número aleatorio entre 1 y 50
        var numeroSecreto = random.nextInt(50) + 1;
        var numeroIntentos = 0;
        var adivinanza = 0;
        final var MAX_INTENTOS = 5;

        while (adivinanza != numeroSecreto && numeroIntentos < MAX_INTENTOS) {
            System.out.print("Adivina el número secreto (entre 1 y 50): ");
            adivinanza = console.nextInt();

            //Agregar ayuda para orientar al jugador
            if (adivinanza < numeroSecreto)
                System.out.println("El número secreto es mayor.");
            else if (adivinanza > numeroSecreto)
                System.out.println("El número secreto es menor.");

            // Incrementamos el número de intentos
            numeroIntentos++;
        }
        // Verificamos si el jugador adivinó el número secreto o agotó los intentos
        if (adivinanza == numeroSecreto) {
            System.out.println("¡Felicidades! Has adivinado el número secreto." + " Intentos realizados: " + numeroIntentos);
        } else {
            System.out.printf("Lo siento, has agotado los intentos. Máximo permitido: %d%n", numeroIntentos);
            System.out.printf("El número secreto era: %d%n", numeroSecreto);
        }
    }
}
