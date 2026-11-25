public class DibujarTriangulo {
    public static void main(String[] args) {
        System.out.println("Dibujo de un triángulo:");
        var consola = new java.util.Scanner(System.in);
        System.out.print("Porporcona el número de filas: ");
        int numeroFilas = consola.nextInt();

        for (int fila = 1; fila <= numeroFilas; fila++) {
            var espaciosBlancos = " ".repeat(numeroFilas - fila);
            var asteriscos = "*".repeat(2 * fila - 1);
            System.out.println(espaciosBlancos + asteriscos);
        }
    }
}
