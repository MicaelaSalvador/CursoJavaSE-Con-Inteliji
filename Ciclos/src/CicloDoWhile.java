public class CicloDoWhile {
    public static void main(String[] args) {
        System.out.println("Ciclo DO While");

        var contador = 0;
        do {
            System.out.println(contador++ + "");
        } while (contador <= 3);
    }
}
