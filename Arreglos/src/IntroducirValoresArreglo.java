public class IntroducirValoresArreglo {
    public static void main(String[] args) {
        System.out.println("*** Introducir valores de un arreglo ***");
        var consola = new java.util.Scanner(System.in);
        System.out.print("Ingrese el largo del arreglo: ");
        int largo  = consola.nextInt();
        var arreglo = new double[largo];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            arreglo[i] = consola.nextDouble();
        }
        System.out.println("\n*** Valores ingresados ***");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Valor para la posición " + i + ": " + arreglo[i]);
        }
    }
}
