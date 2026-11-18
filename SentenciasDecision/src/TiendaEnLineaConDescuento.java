import java.util.Scanner;

public class TiendaEnLineaConDescuento {
    public static void main(String[] args) {
        System.out.println("*** Tienda en linea con descuentos ");
        final var MONTO_MINIMO_DESCUENTO = 1000;
        var consola = new Scanner(System.in);

        System.out.print("Ingresa el total de compra :");
        var totalCompra = Double.parseDouble(consola.nextLine());

        System.out.print("Eres miembro de la tienda (true / false) : ");
        var esMiembro = Boolean.parseBoolean(consola.nextLine());

        // descuento del 10 %
        var descuento10 = totalCompra * .10;
        var pago10 = totalCompra - descuento10;

        // descuento del 5%
        var descuento5 = totalCompra * .05;
        var pago5 = totalCompra - descuento5;

        if (totalCompra >= MONTO_MINIMO_DESCUENTO && esMiembro) {
            System.out.println("Felicidades !! has obtenido un descuento del 10 %");
            System.out.println("Monto de la Compra : " + "$" + totalCompra);
            System.out.println("Monto del descuento : " + "$" + descuento10);
            System.out.println("Monto final de la compra con descuento del 10% : " + "$" + pago10);
        } else if (totalCompra < MONTO_MINIMO_DESCUENTO && esMiembro) {
            System.out.printf("""
                    \t Felicidades !!! has obtenido un descuento del 5%%
                    \t Monto de la compra :  $%.2f
                    \t Monto del descuento : $%.2f
                    \t Monto final de la compra con descuento del 5%% : $%.2f
                    """, totalCompra, descuento5, pago5);
        } else {
            System.out.println();
            System.out.println("No obtuviste ningún descuento ");
            System.out.println("Te invitamos a hacerte miembro de la tienda ");
            System.out.println("Monto final de la compra  : " + totalCompra);
        }
    }
}
