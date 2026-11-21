import java.util.Scanner;

public class EstacionesDelAno {
    public static void main(String[] args) {
        System.out.println("*** Estaciones del año ***");
        //System.out.println();
        //System.out.println("1,2,12 corresponden al invierno");
        //System.out.println("3,4,5 corresponden al primavera ");
        //System.out.println("6,7,8 corresponden al verano ");
        //System.out.println("9,10,11 corresponden al otoño");
        var consola = new Scanner(System.in);
        System.out.println();
        //Solicitud de información
        System.out.print("Ingresa un número que corresponda a la estación del año :");
        var mes = Integer.parseInt(consola.nextLine());
        System.out.println();
        var estacion = "";
        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otoño";
        } else {
            estacion = "Estación desconocidad" + mes;
        }

        System.out.printf("La estación para el  mes %d es %s", mes, estacion);
    }
}
