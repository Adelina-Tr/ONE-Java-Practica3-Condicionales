import java.util.Scanner;

public class EsDiaHabil {
    /*
    Carlos trabaja en una empresa de logística que opera solo de lunes a viernes, sin actividades los fines de semana.
    Para evitar confusiones, necesita un programa que, al recibir un día de la semana, indique si es un día hábil o no.
    Crea un programa que reciba un día de la semana (en minúsculas)
    y muestre un mensaje indicando si es un día hábil o no.
     */
    public static void main(String[] args) {

        System.out.println("Ingrese el día de la semana (en minúsculas): ");
        Scanner scanner = new Scanner(System.in);
        String dia = scanner.nextLine();

        switch (dia){
            case "lunes", "martes", "miercoles", "miércoles", "jueves", "viernes":
                System.out.println(dia +" es dia habil");
                break;
            case "sabado", "sábado", "domingo":
                System.out.println(dia +" no es dia habil");
                break;
            default:
                System.out.println("Ingresa un valor valido");
                break;
        }
        scanner.close();
    }
}
