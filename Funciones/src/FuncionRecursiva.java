public class FuncionRecursiva {
     static void funcionRecursiva(int numero) {
        //caso base
        if (numero == 1)
            System.out.print(numero + " ");
        else {
            // función recursiva
            funcionRecursiva(numero - 1);
            System.out.print(numero + " ");
        }
    }

    public static void main(String[] args) {
        funcionRecursiva(5);
    }
}
