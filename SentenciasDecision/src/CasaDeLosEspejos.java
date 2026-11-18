import java.util.Scanner;

public class CasaDeLosEspejos {
    public static void main(String[] args) {
        System.out.println("*** Casa de los espejos *** ");
        var EDAD_LIMITE_ENTRAR = 10;
        var consola = new Scanner(System.in);

        System.out.print("Que edad tienes ? ");
        var edad = Integer.parseInt(consola.nextLine());

        System.out.print("Te da miedo la oscuridad (true/false): ");
        var miedoOscuridad = Boolean.parseBoolean(consola.nextLine());

        if (edad >= EDAD_LIMITE_ENTRAR && !miedoOscuridad) {
            System.out.println("Puedes entrar a la casa de los espejos ");
        }else {
            System.out.println("Lo siento, la casa de los espejos podría darte miedo");
        }
    }
}
