import java.util.Scanner;

public class EstacionesAnioConSwitch {
    public static void main(String[] args) {
        System.out.println(" **** Estación del año con switch ***");
        var consola = new Scanner(System.in);

        System.out.print("Indica la estación del año (1-12) : ");
        var mes = Integer.parseInt(consola.nextLine());
        String estacion = switch (mes) {
            case 1, 2, 12 -> "Invierno";
            case 3, 4, 5 -> "Primavera";
            case 6, 7, 8 -> "Verano";
            case 9, 10, 11 -> "Otoño";
            default -> "Estación desconocidad";
        };
        System.out.printf("%nLa estación para el %d es %s : ", mes, estacion);
    }
}
