import java.util.Scanner;

public class SistemaEnvio {
    public static void main(String[] args) {
        System.out.println("*** Sistema de envío ***");
        final var COSTO_ENVIO_NACIONAL_KILO = 10;
        final var COSTO_ENVIO_INTERNACIONAL_KILO = 20;

        var consola = new Scanner(System.in);
        System.out.print("Ingresa el destino de tú paquete(Nacional/Internacional) : ");
        var destinoEnvio = consola.nextLine().strip().toLowerCase();

        System.out.println("Ingresa el peso del paquete (Kgs) ");
        var pesoPaquete = Double.parseDouble(consola.nextLine());

        Double costoEnvio = switch (destinoEnvio) {
            case "nacional" -> pesoPaquete * COSTO_ENVIO_NACIONAL_KILO;
            case "internacional" -> pesoPaquete * COSTO_ENVIO_INTERNACIONAL_KILO;
            default -> {
                System.out.println("Destino inválido. Ingresa nacional/internacional");
                yield null;
            }
        };
        if (costoEnvio != null)
            System.out.printf("El costo del envío del paquete es : $%.2f", costoEnvio);
    }
}
