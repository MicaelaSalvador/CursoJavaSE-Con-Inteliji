public class DiaDeLaSemanaMejorado2 {
    public static void main(String[] args) {
        System.out.println("*** Dia de la semana con switch");
        int dia = 1;

        String mombreDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Día inválido";
        };
        System.out.println(mombreDia);
    }
}
