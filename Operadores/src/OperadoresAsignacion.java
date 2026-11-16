public class OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de Asignación ***");
        // Asignación =
        var miNumero = 10;
        int miNumero1;
        miNumero1 = 15;
        //Asignación compuesto
        //+=
        miNumero += 5; // miNumero = miNumero +5 => 15;
        System.out.println("miNumero  = " + miNumero);
        // Asignación compuesto de multiplicación
        miNumero *= 2; // miNumero = miNumero *2 =>30
        System.out.println("miNumero = " + miNumero);
        // Asignación compuesta -=
        miNumero = 10;
        miNumero -= 4; // miNumero = miNumero-4 =>6;
        System.out.println("miNumero = " + miNumero);
        //Asignación compuesta /=
        miNumero = 15;
        miNumero /= 2; // miNumero = miNumero /2 => =7
        System.out.println("miNumero = " + miNumero);
        // Asignación compuesta %=
        miNumero = 15;
        miNumero %= 2;// miNumero =miNumero %2 =>2
        System.out.println("miNumero = " + miNumero);

        // Asignación de variables multiples
        int a=10, b=15, c=20;
        System.out.printf("a= %d, b= %d , c = %d",a,b,c);
    }
}
