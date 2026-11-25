import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println(" *** Calculadora en Java *** ");
        var consola = new Scanner(System.in);
        double operando1 = 0, operando2 = 0, resultado = 0;

        var salir = false;
        while (!salir) {
            System.out.print("""
                    *** Menú de opciones *** %n
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    Ingrese la opción deseada:\s """);
            var opcion = consola.nextInt();
            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingresa el primer número : ");
                operando1 = consola.nextDouble();
                System.out.print("Ingresa el segundo número : ");
                operando2 = consola.nextDouble();
            }
            switch (opcion) {
                case 1 -> {
                    //Logica para suma
                    System.out.println();
                    resultado = operando1 + operando2;
                    System.out.printf("El resultado de la suma es: %.2f%n%n", resultado );
                }
                case 2 -> {
                    // Lógica para resta
                    resultado = operando1 - operando2;
                    System.out.printf("El resultado de la resta es: %.2f%n%n", resultado);
                }
                case 3 -> {
                    // Lógica para multiplicación
                    resultado = operando1 * operando2;
                    System.out.printf("El resultado de la multiplicación es: %.2f%n%n", resultado);
                }
                case 4 -> {
                    // Lógica para división
                    if (operando2 != 0) {
                        resultado = operando1 / operando2;
                        System.out.printf("El resultado de la división es: %.2f%n%n", resultado);
                    } else {
                        System.out.println("Error: No se puede dividir por cero." + "\n");
                    }
                }
                case 5 -> {
                    salir = true;
                    System.out.println("Saliendo del programa de calculadora...");
                }
                default -> {
                    System.out.println("Opción no válida. Intente de nuevo." +"\n");
                }
            }
        }
    }
}
