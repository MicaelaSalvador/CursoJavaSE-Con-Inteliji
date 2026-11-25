import java.util.Scanner;

public class CreacionValidacionPassword {
    public static void main(String[] args) {
        System.out.println("**** Creación y Validación de Contraseña ****");
        var consola = new Scanner(System.in);

        System.out.print("Ingrese una contraseña (de al menos 6 caracteres): ");
        var password = consola.nextLine();

        while (password.length() < 6) {
            System.out.println();
            System.out.println("La contraseña debe tener al menos 6 caracteres.");
            System.out.print("Ingrese un nuevo valor de password : ");
            password = consola.nextLine();
        }
        System.out.println("Contraseña creada exitosamente: " + password);
    }
}
