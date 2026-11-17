import java.util.Scanner;

public class OperadoresPrestamoLibros {
    public static void main(String[] args) {
        System.out.println("*** Sistema para prestamos de libros  ***");
        final var KILOMETROS_ADQUIRIR_LIBROS = 3;
        //Se pregunta si tiene credencial
        System.out.print(" Tienes credencia de estudiante (true/false)");
        var tieneCredencial = Boolean.parseBoolean(new Scanner(System.in).nextLine());
        // Se pregunta la distancia en la que vive.
        System.out.print("Distancia aproximada en la que vives (km)");
        var distaciaVive = Integer.parseInt(new Scanner(System.in).nextLine());

        //De acuerdo a los datos pproporcionados y las reglas establecidas se decide si se presta el libro
        if (tieneCredencial || distaciaVive <= KILOMETROS_ADQUIRIR_LIBROS) {
            System.out.println("Puedes adquirir el prestamo del libro ");
        } else {
            System.out.println("Lo sentimos,las reglas no te permiten el prestamo del libro");
        }
    }
}
