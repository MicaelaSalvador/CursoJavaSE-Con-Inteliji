public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("*** Formmateo de cadenas ***");
        var nombre = "Matías";
        var edad = 35;
        var salario = 21000.50;

        // String.format
        var mensaje = String.format("Nombre : %s, Edad : %d ,Salario : $%.2f",nombre,edad,salario);
        System.out.println( mensaje);

        //Formato de cadena utilizando printf
        System.out.printf("Nombre : %s, Edad : %d, Salario : $%.2f%n", nombre,edad,salario);
    }
}
