public class MatrizSimplificada {
    public static void main(String[] args) {
        System.out.println("Matriz Simplificada");

        var matriz = new int[][]{{100, 200, 300}, {400, 500, 600}};
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.println(" valor[" + fila + "][" + col + "] = " + matriz[fila][col] + " ");
            }
        }
    }
}

