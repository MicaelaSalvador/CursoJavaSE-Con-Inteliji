public class OperadoresComparacion {
    public static void main(String[] args) {
        System.out.println(" ***  Operadores de comparación *** ");
        int a = 3, b = 2;
        // Igualdad ==
        var resultado = a == b;
        System.out.println("resultado a == b = " + resultado);
        // Distinto !=
        resultado = a != b;
        System.out.println("resultado a !=b = " + resultado);
        // comparar si son distintos  con resultado true
        a = 5;
        b = 5;
        resultado = a != b;
        System.out.println("resultado = " + resultado);
        // Mayor que
        a = 3;
        b = 2;
        resultado = a > b;
        System.out.println("resultado a > b = " + resultado);
        //>=  mayor o igual que
        resultado = a >= b;
        System.out.println("resultado a >= b = " + resultado);
        //< menor que
        resultado = a < b;
        System.out.println("resultado  a < b = " + resultado);
        // <= menor o igual que
        resultado = a<= b;
        System.out.println("resultado a <= b = " + resultado);

    }
}
