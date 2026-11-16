public class OperadorOr {
    public static void main(String[] args) {
        System.out.println("*** Operador or ***");
        // El único caso cuando es falso es cuando los dos valores son falsos
        //  ambos valoresson falsos
        boolean a = false, b = false;
        var resultado = a || b;
        System.out.println("resultado a=false || b=false = " + resultado);
        // a es falso y b es verdadesrp
        a = false;
        b = true;
        resultado = a || b;
        System.out.println("resultado a =false || b=true = " + resultado);
        //a es verdadero y b es falso
        a = true;
        b = false;
        resultado = a || b;
        System.out.println("resultado  a = true || b = false = " + resultado);
        // a es verdadero  y b es verdadero
        a =true; b=true;
        resultado = a || b;
        System.out.println("resultado a=true || b=true = " + resultado);
    }
}
