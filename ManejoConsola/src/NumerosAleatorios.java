import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println(" **** Numeros aleatorios ***");

        var random = new Random();
        //Generamos el número aleatorio entre 0 y 9.
        var numeroAleatorio = random.nextInt(10);
        System.out.println("Número aleatorio entre 0 y 9 = " + numeroAleatorio);

        //Generamos un número aleatorio entre 1 y 10
        var numeroAleatorio1 = random.nextInt(10) + 1;
        System.out.println("Número aleatorio del 1 y 10 = " + numeroAleatorio1);

        // Generar un número flotante entre 0.0 y 1.0
        var flotante = random.nextFloat();
        System.out.println("Número flotante entre  0.0 y 1.1 = " + flotante);

        // Simulación del lanzamiento de un dado
        var dado = random.nextInt(6) + 1;
        System.out.println("Resultado de lanzar el dado = " + dado);
    }
}
