public class FuncionSuma {
    public static int suma(int a, int b) {
        var resultado = a + b;
        return resultado;
    }

    public static void main(String[] args) {
        int argumento1=8, argumento2=12;
        int resultado = suma(argumento1, argumento2);
        System.out.println("La suma de " + argumento1 + " y " + argumento2 + " es: " + resultado);
    }
}
