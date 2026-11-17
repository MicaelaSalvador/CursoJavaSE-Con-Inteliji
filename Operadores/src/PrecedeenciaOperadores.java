public class PrecedeenciaOperadores {
    public static void main(String[] args) {
        // Precedencia de Operadores en Java:
        // 1. Parentesis y Corchetes
        // 2. Operadores unarios -, ++, --
        // 3. Operadores aritmeticos *, / y %
        // 4. Operadores aritmeticos + y -
        // 5. Relacionales <, <=, >, >=
        // 6. Equivalencia == y !=
        // 7. Logicos && y ||
        // 8. Asignacion =, +=, -=, *=, etc

        //Expresión
        // paso 1 : División 12/3 =4
        // paso 2 : Multiplicación  2*3 =6
        // paso 3 : Suma  4+6 = 10
        // paso 4 : Resta  10-1 =9
        var a = 12 / 3 + 2 * 3 - 1;
        System.out.println("a = " + a);
    }
}
