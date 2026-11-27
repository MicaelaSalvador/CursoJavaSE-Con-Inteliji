public class Matriz {
    public static void main(String[] args) {
        System.out.println("*** Matriz ***");
        final  var RENGLONES = 2;
        final  var COLUMNAS = 3;
        //int[][] matriz = new int[2][3];
        var matriz = new int[RENGLONES][COLUMNAS];
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;

        for (int reg =0; reg< RENGLONES; reg++) {
            for (int col = 0; col < COLUMNAS; col++) {
                System.out.print(" valor[" +  reg  + "][" +  col  + "] = " + matriz[reg][col] +" ");
            }
            System.out.println();
        }
    }
}
