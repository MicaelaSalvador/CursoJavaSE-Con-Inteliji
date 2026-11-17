import java.util.Scanner;
import java.util.concurrent.TimeoutException;

public class SistemaDescuentoVIP {
    public static void main(String[] args) {
        System.out.println(" *** Sistema descuento VIP  *** ");
        final var NUM_PRODUCTOS_DESCUENTO = 10;

        System.out.print("Ingresa los productos que compraste : ");
        var cantidadComprados = Integer.parseInt(new Scanner(System.in).nextLine());

        System.out.print("Tienes membresía de la tienda : ");
        boolean tieneMembresia = Boolean.parseBoolean(new Scanner(System.in).nextLine());

        if (NUM_PRODUCTOS_DESCUENTO >= cantidadComprados && tieneMembresia) {
            System.out.println("Felicidades !!! Eres candidato para un descuento");
        } else {
            System.out.println("Desafortundamente no eres candidato para un descuento.");
        }
    }
}
