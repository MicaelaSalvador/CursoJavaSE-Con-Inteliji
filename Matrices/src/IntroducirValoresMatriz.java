public class IntroducirValoresMatriz {
    public static void main(String[] args) {
        System.out.println("*** Introducir valores a una matriz ***");
        var scanner = new java.util.Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int fil = scanner.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int col = scanner.nextInt();

        int[][] matriz = new int[fil][col];
        System.out.println();

        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println();

        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Valor[" + i + "][" + j + "]: " + matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
