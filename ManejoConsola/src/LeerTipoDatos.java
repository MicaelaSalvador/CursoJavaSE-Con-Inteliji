import java.util.Scanner;

public class LeerTipoDatos {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        // Leer tipos de dato int
        System.out.print("Ingresa tú edad :");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);

        //Leer tipo de dato de tipo double
        System.out.print("Ingresa tú altura: ");
        var altura = consola.nextDouble();
        System.out.println("altura  = " + altura);

        //Leer tipo de dato string
        consola.nextLine();
        System.out.print("Ingresa tú nombre :");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

        //  conversion de  datos
        System.out.println("Proporciona un valor entero :");
        var enteroString = consola.nextLine();
        var entero = Integer.parseInt(enteroString);
        System.out.println("entero = " + entero);

        // Tipo de dato flotante
        System.out.println("Proporciona un valor flotante : ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);
    }
}
