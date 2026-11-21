import java.util.Scanner;

public class SaludyFitness {
    public static void main(String[] args) {
        System.out.println("Salud y Fitness");
        final var META_PASOS_DIARIOS = 10000;
        final var CALORIAS_POR_PASOS = 0.04; // Valor aproximado en kilo calorías

        var consola = new Scanner(System.in);

        System.out.print("Cuál es tú nombre : ");
        var nombre = consola.nextLine();

        System.out.print("Cuántos pasos has realizado el día de hoy :  ");
        var pasosDiarios = Integer.parseInt(consola.nextLine());

        // Verificamos meta alcanzada
        var metaAlcanzada = (pasosDiarios >= META_PASOS_DIARIOS) ? "SI :)" : "NO ):";

        // caloriía quemadas
        var caloriasQuemadas= pasosDiarios * CALORIAS_POR_PASOS;

        System.out.printf("""
                %nUsuario : %s
                Pasos dados hoy : %d
                Calorías quemadas : %.2f kcal
                Meta  de pasos diario alzanzada : %s
                ------------------------------
                La meta de pasos diarios es de : %d pasos
                """,nombre,pasosDiarios,caloriasQuemadas,metaAlcanzada,META_PASOS_DIARIOS);
    }
}
