import java.util.Scanner;

public class ReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Reservación de Hotel");

        var consola = new Scanner(System.in);

        final var PRECIO_CUARTO_SIN_VISTA_AL_MAR_POR_DIA = 150.50;
        final var PRECIO_CUARTO_VISTA_MAR_POR_DIA = 190.50;

        System.out.print("Nombre del cliente :");
        var nombreCliente = consola.nextLine();

        System.out.print("Días de estadía  : ");
        var diasReservados = Integer.parseInt(consola.nextLine());

        System.out.print("Con vista al mar (true/false) ");
        var conVistaAlMar = Boolean.parseBoolean(consola.nextLine());

        //Calculo del costo total de la estadía
        var costoTotal = 0.0;
        var pagoPorDia = 0.0;

        if (conVistaAlMar) {
            costoTotal = diasReservados * PRECIO_CUARTO_VISTA_MAR_POR_DIA;
            pagoPorDia = PRECIO_CUARTO_VISTA_MAR_POR_DIA;
        } else {
            costoTotal = diasReservados * PRECIO_CUARTO_SIN_VISTA_AL_MAR_POR_DIA;
            pagoPorDia = PRECIO_CUARTO_SIN_VISTA_AL_MAR_POR_DIA;
        }

        var cuartoConVistaAlMar = (conVistaAlMar) ? "SI :)" : "NO ):";
        System.out.printf("""
                 --------------   Detalles de la reservación  ---------- %n
                 \tCliente : %s
                 \tDías de estadía : %d
                 \tCosto Total : $%.2f
                 \tCon vista al mar : %s
                \tPago por día :$%.2f
                """, nombreCliente, diasReservados, costoTotal, cuartoConVistaAlMar, pagoPorDia);
    }
}
