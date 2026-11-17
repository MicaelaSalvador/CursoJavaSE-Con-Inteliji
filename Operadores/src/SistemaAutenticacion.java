import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("***  Sistema autenticación  ***");
        var consola = new Scanner(System.in);

        final var USUARIO_VALIDO = "Admin";
        final var PASSWORD_VALIDO = 123;

        System.out.print("Ingresa el usuario :");
        var usurioIngresado = consola.nextLine();

        System.out.print("Ingrese el password : ");
        var passwordIngresado = Integer.parseInt(consola.nextLine());

        if (USUARIO_VALIDO.equals(usurioIngresado) && PASSWORD_VALIDO == passwordIngresado) {
            System.out.println("Estás autorizado para acceder al sistema");
        } else {
            System.out.println("Lo sentimos, no tienes autorización para acceder al sitema");
        }
    }
}
