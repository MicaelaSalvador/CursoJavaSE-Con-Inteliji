public class OperadorAnd {
    public static void main(String[] args) {
        System.out.println(" *** Operador And *** ");
        // Sólo regresa verdadero si ambos valores son verdaderos
        boolean a = false, b = false;
        // a y b son false
        var resultado = a && b;
        System.out.println("resultado a =false && b = false = " + resultado);
        //  a es falso y b es verdadero
        a = false;
        b = true;
         resultado = a && b;
        System.out.println("resultado a = false  && b =true   = " + resultado);
        // a es verdadero y b es falso
        a= true; b=false;
        resultado = a && b;
        System.out.println("resultado  a = true && b= false = " + resultado);
        // a = true y b=true
        a=true; b=true;
        resultado = a && b;
        System.out.println("resultado a=true && b=true = " + resultado);

    }
}
