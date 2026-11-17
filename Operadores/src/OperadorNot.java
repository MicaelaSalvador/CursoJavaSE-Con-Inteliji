public class OperadorNot {
    public static void main(String[] args) {
        System.out.println("Operador Not");
        boolean a= false;
        var resultado =!a;
        System.out.println("resultado !a = " + resultado);
        a=true;
        resultado =!a;
        System.out.println("resultado !a = " + resultado);


    }
}
