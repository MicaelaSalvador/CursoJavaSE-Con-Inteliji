import java.util.Scanner;

public class RangoVariable {
    private static String Sytem;

    public static void main(String[] args) {
        //Rango de una variable
        System.out.println(" *** Identificar el rango de una variable  ***");

        // Datos requeridos
        System.out.print("Ingresa un dato entero : ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());
        // revisamos si el rango está dentro (1 -10)
        if (dato >= 0 && dato <= 10) {
            System.out.println("Estas dentro del rango permitido (1-10)");
        } else {
            System.out.println("Estas fuera del rango");
        }
    }
}
