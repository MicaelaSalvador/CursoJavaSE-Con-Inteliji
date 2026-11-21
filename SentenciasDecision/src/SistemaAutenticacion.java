import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println(" *** Sistema Autenticación *** ");
        final var USUARIO_PERMITIDO = "admin";
        final var PASSWORD_PERMITIDO = "123";
        var consola = new Scanner(System.in);

        System.out.print("Ingrese usuario :");
        var usuario = consola.nextLine().strip().toLowerCase();

        System.out.print("Ingrese password : ");
        var password = consola.nextLine().strip();

        boolean usuarioCorrecto = USUARIO_PERMITIDO.equals(usuario);
        boolean passwordCorrecto = PASSWORD_PERMITIDO.equals(password);

        if (usuarioCorrecto && passwordCorrecto) {
            System.out.println("Bienvenido al sistema");
        } else if (!usuarioCorrecto && passwordCorrecto) {
            System.out.println("Usuario Incorrecto, favor de corregirlo");
        } else if (usuarioCorrecto && !passwordCorrecto) {
            System.out.println("Password incorrecto, favor de corregirlo");
        } else {
            System.out.println("Usuario y password incorrectos");
        }
    }
}
