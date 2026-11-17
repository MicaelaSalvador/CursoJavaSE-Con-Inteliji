import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        System.out.println(" *** Generación ticket de  venta ***");
        var consola = new Scanner(System.in);

        System.out.print("Precio Leche : ");
        var precioLeche = Double.parseDouble(consola.nextLine());

        System.out.print("Precio pan :");
        var precioPan = Double.parseDouble(consola.nextLine());

        System.out.print("Precio Lechuga : ");
        var precioLechuga = Double.parseDouble(consola.nextLine());

        System.out.print("Precio plátano :");
        var precioPlatano = Double.parseDouble(consola.nextLine());

        // Precio de cada producto
        System.out.println();
        System.out.println("\t\tCosto de los productos ");
        System.out.println("precio Leche = " + precioLeche);
        System.out.println("precio Pan = " + precioPan);
        System.out.println("precio Lechuga = " + precioLechuga);
        System.out.println("precio Plátano = " + precioPlatano);

        //Subtotal de la compra
        var subTotal = precioLeche + precioPan + precioLechuga + precioPlatano;
        //Cálculo impuestos(16%)
        var impuestos = subTotal * .16;
        // Pago total incluyendo impuestos
        var costoTotalCompra = subTotal + impuestos;
        //Ticket
        System.out.println();
        System.out.printf(""" 
                %n Ticket de venta
                -------------------
                Subtotal : $%.2f
                Impuesto (16%%) :$%.2f
                Costo total compra :$%.2f
                """,subTotal,impuestos,costoTotalCompra);
    }
}
