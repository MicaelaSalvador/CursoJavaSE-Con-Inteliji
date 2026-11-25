import java.util.Scanner;

public class SistemaAdministracionDeCuentas {
    public static void main(String[] args) {
        System.out.println("*** Administración de cuentas *** ");
        var consola = new Scanner(System.in);
        var salir = false;
        while (!salir) {
            System.out.print("""
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir
                    """);
            System.out.print("Seleccione una opción: ");
            var opcion = consola.nextInt();
            switch (opcion) {
                case 1 -> System.out.println("Creando cuenta...");

                case 2 -> System.out.println("Eliminando cuenta...");
                case 3 -> {
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                }
                default -> System.out.println("Opción no válida.");
            }
        }

    }
}
