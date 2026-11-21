import java.util.Scanner;

public class MayorDosNumerosEnteros {
    public static void main(String[] args) {
        System.out.println(" *****  Mayor de dos números enteros ***");
        var consola = new Scanner(System.in);

        //Datos solicitados al usuario
        System.out.print("Ingrese un primer número entero : ");
        var numeroUno = Integer.parseInt(consola.nextLine());

        System.out.print("Ingrese segundo número entero : ");
        var numeroDos =Integer.parseInt(consola.nextLine());

       var esmayo = (numeroUno > numeroDos)? numeroUno + " es mayor" :(numeroDos>numeroUno)? numeroDos + " es Mayor":numeroUno + " y "+ numeroDos +" son iguales";

        System.out.printf("""
                %n
                Resultado de comprar dos número para identificar si es mayor o menor
                %n
                Primer número dado es : %d
                El segundo número dado es :%d
                Resultado de la comparación  : %s
                """,numeroUno,numeroDos,esmayo);
    }
}
