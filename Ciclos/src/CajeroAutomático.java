public class CajeroAutomático {
    public static void main(String[] args) {
        System.out.println("*** Aplicación de Cajero Automático ***");
        System.out.println();

        var consola = new java.util.Scanner(System.in);
        var saldo = 1000.00;
        var salir = false;
        while (!salir) {
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            var opcion = consola.nextInt();
            switch (opcion) {
                case 1 -> System.out.println("Su saldo es: $" + saldo + "\n");
                case 2 -> {
                    System.out.print("Ingrese la cantidad a retirar: ");
                    var cantidad = consola.nextDouble();
                    if (cantidad <= saldo) {
                        System.out.println("Retirando dinero...");
                        saldo -= cantidad;
                        System.out.println("Su nuevo saldo es: $" + saldo + "\n");
                    } else {
                        System.out.println("Fondos insuficientes." + "\n");
                    }
                }
                case 3 -> {
                    System.out.print("Ingrese la cantidad a depositar: ");
                    var cantidad = consola.nextDouble();
                    saldo += cantidad;
                    System.out.println("Depositando dinero...");
                    System.out.println("Su nuevo saldo es: $" + saldo + "\n");
                }
                case 4 -> {
                    System.out.println("Saliendo del cajero automático ... Hasta pronto");
                    salir = true;
                }
                default -> System.out.println("Opción no válida.");
            }
        }
    }
}
