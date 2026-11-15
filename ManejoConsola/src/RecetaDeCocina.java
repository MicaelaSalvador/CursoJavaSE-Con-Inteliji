import java.util.Scanner;

public class RecetaDeCocina {
    public static void main(String[] args) {
        //Receta de cocina
        System.out.println("*** Receta de cocina ***");

        var consola = new Scanner(System.in);

        // Ingresa nombre de la receta
        System.out.println("Ingresa el nombre de la receta ");
        var nombreReceta = consola.nextLine();

        // Ingredientes
        System.out.print("Ingresa los ingredientes");
        var ingredientes = consola.nextLine();

        // Tiempo de preparación.
        System.out.println("Ingresa el tiempo de preparación (minutos) :");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());

        // grado de dificultad
        System.out.println("Ingrese el grado de diificultad : " );
        var gradoDidicultad = consola.nextLine();

        System.out.println(" ****  Datos de la receta  ***");
        System.out.println("nombreReceta = " + nombreReceta);
        System.out.println("ingredientes = " + ingredientes);
        System.out.println("tiempoPreparacion = " + tiempoPreparacion);
        System.out.println("tiempoPreparacion = " + tiempoPreparacion);


    }
}
