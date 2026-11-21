import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        System.out.println("*** Sistema de calificaciones *** ");
        var consola = new Scanner(System.in);

        // Solicitamos la calificacón al usuario
        System.out.print("Ingresa tú calificación : ");
        var calificacion = Double.parseDouble(consola.nextLine());
        var letra = "";
        if (calificacion >= 9 && calificacion <= 10)
            letra = "A";
        else if (calificacion >= 8 && calificacion < 9)
            letra = "B";
        else if (calificacion >= 7 && calificacion < 8)
            letra = "C";
        else if (calificacion >= 6 && calificacion < 7)
            letra = "D";
        else if (calificacion >= 0 && calificacion < 6)
            letra = "F";
        else
            letra = "Valor desconocido";
        System.out.printf("Tu calificación %.1fcorresponde a la letra  %s", calificacion, letra);
    }
}
