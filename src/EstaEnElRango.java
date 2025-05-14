import java.util.Scanner;

public class EstaEnElRango {
    /*
    Emerson trabaja en un banco y necesita verificar si un número digitado por el cliente
    está dentro del rango permitido de valores para un préstamo, que va de 1000 a 5000 dólares.
    Crea un programa que reciba un valor y muestre si está dentro del intervalo permitido o no.
     */
    public static void main(String[] args) {
        System.out.println("Ingrese el valor del préstamo: ");
        Scanner scanner = new Scanner(System.in);
        double valor = scanner.nextDouble();

        if(valor > 1000 && valor < 5000){
            System.out.println("El valor $"+valor+" SÍ está dentro del intervalo permitido para el préstamo.");
        }else{
            System.out.println("El valor $"+valor+" NO está dentro del intervalo permitido para el préstamo.");
        }
        scanner.close();
    }
}
