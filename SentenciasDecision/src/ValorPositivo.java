import java.util.Scanner;

public class ValorPositivo {

    public static void main(String[] args) {
        System.out.println("*** Valor positivo *** ");
        var consola = new Scanner(System.in);

        System.out.print("Ingresa un número : ");
        var numero = Integer.parseInt(consola.nextLine());

        if (numero > 0)
        {
            System.out.println(" Ingresaste un valor positivo :  " + numero);
        }
        else if (numero < 0 ){
            System.out.println("Ingresaste un valor negativo : " +  numero);
        }else {
            System.out.println("Valor ingresado es un 0  : " + numero);
        }
    }
}
