import java.util.Scanner;

public class EsPar {
    /*
    Ana necesita identificar si un número es par o impar para un juego que está desarrollando.
    Para ello, quiere crear un programa que analice si el número que ha definido previamente es par o impar.
     */
    public static void main(String[] args) {

        System.out.println("Ingresa un numero: ");
        Scanner scaner = new Scanner(System.in);
        int numero = scaner.nextInt();

        if(numero%2 == 0){
            System.out.println("El nuemero " + numero + " es par");
        }
        else{
            System.out.println("El nuemero " + numero + " es impar");
        }
        scaner.close();
    }
}
