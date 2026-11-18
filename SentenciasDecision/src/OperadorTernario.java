import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("*** Operador Ternario ***");
        var consola = new Scanner(System.in);

        System.out.print("Ingres un número entero : ");
        var numero =Integer.parseInt(consola.nextLine());

        var resultado =(numero % 2 ==0)?"Par" :"Impar";
        System.out.printf("""
                \nEl número proporcionado : %d
                \nEs un numero : %s
                """,numero,resultado);
    }
}
