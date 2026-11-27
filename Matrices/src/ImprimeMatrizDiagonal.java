public class ImprimeMatrizDiagonal {
    public static void main(String[] args) {
        System.out.println(" *** Imprime matriz diagonal ***");
        var scanner = new java.util.Scanner(System.in);

        System.out.print("Ïndique el tamaño de la fila: ");
        var fila = scanner.nextInt();
        System.out.print("Ïndique el tamaño de la columna: ");
        var columna = scanner.nextInt();
        System.out.println();
        var matriz = new double[fila][columna];

        for (int fil = 0; fil < fila; fil++) {
            for (int col = 0; col < columna; col++) {
                System.out.print("Indique el valor de la posición [" + fil + "][" + col + "]: ");
                matriz[fil][col] = scanner.nextDouble();
            }
        }

        var sumaMatrizDiagonal = 0;

        for (int fil = 0; fil < fila; fil++) {
            for (int col = 0; col < columna; col++) {
                if (fil == col) {
                    sumaMatrizDiagonal += matriz[fil][col];
                }
            }
        }
        System.out.println();
        System.out.println("La suma de la matriz diagonal es: " + sumaMatrizDiagonal);
    }
}