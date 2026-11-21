import java.util.Scanner;

public class AutenticacionSwitch {
    public static void main(String[] args) {
        System.out.println("*** Sistema Autenticación *** ");
        final var USUARIO_VALIDO = "admin";
        final var PASSWORD_VALIDO = "123";

        var consola = new Scanner(System.in);

        System.out.print("Ingresa tu usuario : ");
        var usuario = consola.nextLine().strip();

        System.out.print("Ingresa tú password :");
        var password = consola.nextLine().strip();

        // Cada caso de validación de usuario y password
        var mensajeAutenticacion = switch (usuario) {
            case USUARIO_VALIDO -> {
                if (PASSWORD_VALIDO.equals(password))
                    yield "Bienvenido al sistema";
                else
                    yield "Password incorrecto, favor de corregir";
            }
            default -> {
                if (PASSWORD_VALIDO.equals(password)) {
                    yield "Usuario incorrecto, favor de corregi";
                } else {
                    yield "Usuario y password incorrectos";
                }
            }
        };

        // imprimimimos el mensaje
        System.out.println(mensajeAutenticacion);
    }
}
