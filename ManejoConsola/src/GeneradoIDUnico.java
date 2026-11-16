import java.util.Random;
import java.util.Scanner;

public class GeneradoIDUnico {
    public static void main(String[] args) {
        System.out.println("*** Sitema  generador de ID único *** ");
        var consola = new Scanner(System.in);
        var random = new Random();

        System.out.println(" Ingesa la siguiente información que se te pide ");
        // Nombre del usuario
        System.out.print("Ingresa tú nombre : ");
        var nombre = consola.nextLine();

        // Apellido del usuario
        System.out.print(" Ingresa tú apellido : ");
        var apellido = consola.nextLine();

        // Año de nacimiento.
        System.out.print(" Ingresa tú año de nacimiento (yyyy) : ");
        var anoNacimiento = consola.nextLine();

        //Generar valor aleatorio.
        var numero = random.nextInt(5);

        System.out.println();
        System.out.printf("Hola : %s,\n", nombre);
        System.out.println("\tTú nuevo número de identificación(ID) generado por el sistema es el siguiente");
        System.out.printf(""" 
               \t %s%s%s%04d
                """, nombre.substring(0, 2).toUpperCase(), apellido.substring(0, 2).toUpperCase(), anoNacimiento.substring(anoNacimiento.length() - 2), numero);
        System.out.println("\t Felicidades !!!!");
    }
}







