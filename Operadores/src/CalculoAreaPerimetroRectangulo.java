import java.util.Scanner;

public class CalculoAreaPerimetroRectangulo {
    public static void main(String[] args) {
        System.out.println(" *** Calculo área y perímetro de un rectangulo ***");

        var consola = new Scanner(System.in);

        System.out.print("Ingrese la base del rectángulo : ");
        var baseRectangulo = Integer.parseInt(consola.nextLine());

        System.out.print("Ingrese la altura del rectángulo : ");
        var alturaRectangulo = Integer.parseInt(consola.nextLine());

        var areaRectangulo = baseRectangulo * alturaRectangulo;
        System.out.printf("""
                La base del rectángulo es:%d cm
                """, areaRectangulo);

        var perimetroRectangulo = (baseRectangulo + alturaRectangulo)*2;
        System.out.printf("""
                El perimetro del rectángulo es:%d cm
                """, perimetroRectangulo);
    }
}
