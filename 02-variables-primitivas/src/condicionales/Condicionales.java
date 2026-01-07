package condicionales;

public class Condicionales {
    public static void main(String[] args) {
        int age = 19;
        double average = 7.5;

        boolean isAdult = age > 18;
        boolean hasPassingGrade = average >= 9;

        if (isAdult && hasPassingGrade) {
            System.out.println("El estudiante cumple con todos los requisitos");
        }

        if (isAdult) {
            System.out.println("Es un adulto");
        }



        // Comentarios
        /*
        * Este es
        * un comentario
        * de multiples
        * líneas
        * */

        /*
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("El dato ingresado no es válido");
        }
        */
    }
}
