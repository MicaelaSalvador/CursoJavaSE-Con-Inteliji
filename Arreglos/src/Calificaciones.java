
import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        System.out.println("*** Promedio de Calificaciones ***");
        var console = new Scanner(System.in);
        double sumaPromedio = 0;
        System.out.print("Cuantas calificaciones deseas ingresar? ");
        int sumaCalificaciones = console.nextInt();

        var filas = new double[sumaCalificaciones];
        for (int i = 0; i < filas.length; i++) {
            System.out.print("Ingresa la calificacion " + (i + 1) + ": ");
            filas[i] = console.nextDouble();
            sumaPromedio += filas[i];
        }
        var promedio = sumaPromedio / sumaCalificaciones;
        System.out.printf("El promedio de las calificaciones es: %.2f", promedio);
    }
}
