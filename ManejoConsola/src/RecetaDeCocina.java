import java.util.Scanner;

public class RecetaDeCocina {
    public static void main(String[] args) {
        //Receta de cocina
        System.out.println("*** Receta de cocina ***");
        var consola = new Scanner(System.in);
        // Nombre de la receta
        System.out.print("Ingrese el nombre : ");
        var NombreReceta = consola.nextLine();

        //Ingredientes
        System.out.print("Ingrese los ingredientes: ");
        var ingrediente = consola.nextLine();

        //Tiempo de preparación
        System.out.print("Ingresa el tiempo de preparación (min) :");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());

        //Grado de dificultad para preparar la receta
        System.out.print("Ingresa la dificaultad : ");
        var dificultad = consola.nextLine();

        System.out.println();
        System.out.println("*** Datos de la receta de cocina **** ");
        System.out.println("NombreReceta = " + NombreReceta);
        System.out.println("Ingresa los ingredientes = " + ingrediente);
        System.out.println("Tiempo de Preparación  = " + tiempoPreparacion);
        System.out.println("dificultad = " + dificultad);


    }
}
