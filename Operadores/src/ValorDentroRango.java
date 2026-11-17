import java.time.chrono.MinguoChronology;
import java.util.Scanner;

public class ValorDentroRango {

    public static void main(String[] args) {
        System.out.println(" *** Verificar valor si está dentro del rango ***  ");
        final var MIN = 0;
        final var MAX = 5;
        System.out.print("Ingrese  un Valor  : ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());
        if (dato >= MIN && dato <= MAX) {
            System.out.println("Estás dentro del rango");
        } else if (dato < MIN) {
            System.out.println("Estás por debajo del rango ");
        } else {
            System.out.println("Sobre pasaste el rango");
        }
    }
}
