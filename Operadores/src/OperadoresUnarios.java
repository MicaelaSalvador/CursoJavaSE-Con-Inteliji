public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("***  Operadores Unarios  ***");
        int a = 3, b = -2, resultado;
        var c = true;
        // Operador unarios +
        resultado = +a;
        System.out.println("resultado +a = " + resultado);
        //Operador Unario -
        resultado = -a;
        System.out.println("resultado -a = " + resultado);
        //Operadores unitarios incremento/decremento
        //Pre-incremento
        a = 3;
        resultado = ++a; // Primero de incrementa el valor
        System.out.println("resultado ++a = " + resultado);
        System.out.println("a  ya se incrementó= " + a);
        //Post-incremento
        a = 3;
        resultado = a++; // primero usa el valor y después de incrementa
        System.out.println("resultado a++ = " + resultado);
        System.out.println("a en este momento se incrementa  = " + a);
        // Pre-decremento
        b = -2;
        resultado = --b; // Primero se decrementa y después de usa el valor
        System.out.println("resultado --b = " + resultado);
        System.out.println("b ya se decrementó = " + b);
        // Post-decremento
        b = -2;
        resultado = b--; //Primero usa el valor y después de decrementa
        System.out.println("resultado b -- = " + resultado);
        System.out.println("b en este momento se decrementa = " + b);


    }
}
