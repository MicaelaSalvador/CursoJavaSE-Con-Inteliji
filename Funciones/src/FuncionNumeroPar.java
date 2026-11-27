import java.util.Scanner;

public class FuncionNumeroPar {
    public static boolean numeroPar(int numero) {
        //if (numero % 2 == 0)
        //  return true;
        //else
        //  return false;
        return (numero % 2 == 0) ? true : false;
    }

    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Ingresa un número : ");
        var numero = Integer.parseInt(consola.nextLine());

        if (numeroPar(numero))
            System.out.println("El número " + numero + " es par");
        else
            System.out.println("El número " + numero + " es impar");
    }
}
