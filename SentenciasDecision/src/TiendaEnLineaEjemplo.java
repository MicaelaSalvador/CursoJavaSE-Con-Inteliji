import java.util.Scanner;

public class TiendaEnLineaEjemplo {
    public static void main(String[] args) {
        System.out.println(" *** Tienda en linea con descuento ***");
        var consola = new Scanner(System.in);
        final var MONTO_COMPRA_DESC = 1000;

        System.out.print("Ingrese el monto comprado : ");
        var montoCompra = Double.parseDouble(consola.nextLine());

        System.out.print("Eres miembro de la tienda :");
        var esMiembro = Boolean.parseBoolean(consola.nextLine());

        var descuento = 0.00;
        if (montoCompra >= MONTO_COMPRA_DESC && esMiembro) {
            descuento = 0.1;
        } else if (esMiembro) {
            descuento = 0.05;
        } else {
            descuento = 0;
        }

        //Realizados los calculos necesarios
        if (descuento != 0) {
            var montoDescuento = descuento * montoCompra;
            var montoFinal =montoCompra-montoDescuento;
            System.out.printf("""
                    %n Felicidades!!! tienes un descuento de %.0f%%
                    \n Monto de la copra : $%.2f
                    \n Monto del descuento : $%.2f
                    \n Monto final de la compra : $%.2f
                    """, descuento*100,montoCompra,montoDescuento,montoFinal);
        }
        else {
            System.out.printf("""
                    %nNo obtuviste ningún tipo de descuento.
                    Te invitamos a hacerte miembro de la tienda!
                    Monto final de la compra: $%.2f%n
                    """, montoCompra);
        }
    }
}

