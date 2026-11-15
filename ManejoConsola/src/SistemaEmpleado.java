import java.util.Scanner;

public class SistemaEmpleado {
    public static void main(String[] args) {
        // Sistema de empleados
        System.out.println("**** Sistema de Empleado ***");
        var consola = new Scanner(System.in);

        //Capturamos el nombre del empleado
        System.out.print("Ingresa el nombre del empleado :");
        var empleado = consola.nextLine();

        //Capturamos la edad del empleado
        System.out.print("Edad  empleado: ");
        var edadEmpleado = Integer.parseInt(consola.nextLine());

        // Capturamos su salario
        System.out.print("Salario  empleado: ");
        var salarioEmpleado = Double.parseDouble(consola.nextLine());

        //Capturamos para saber si es jefe del departamento
        System.out.print("Es jefe del departamento (true/false) : ");
        var esJefe = Boolean.parseBoolean(consola.nextLine());

        //Datos del empleado
        System.out.println(" *** Datos del empleado **** ");
        System.out.println("\tNombre empleado = " + empleado);
        System.out.println("\tedad = " + edadEmpleado);
        System.out.printf("\tsalario :$%.2f%n", salarioEmpleado);
        System.out.print("\tEs jefe de departamento = " + esJefe);

    }
}
