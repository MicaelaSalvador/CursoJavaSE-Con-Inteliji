public class NumerosParesCicloFor {
    public static void main(String[] args) {
        System.out.println("*** Números pares ciclo for");
        for (var contador = 0; contador <= 30; contador++) {
            if (contador % 2 == 0)
                System.out.print(contador + " ");
        }
    }
}
