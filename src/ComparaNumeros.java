import java.util.Scanner;

public class ComparaNumeros {
    /*
    Pedro está aprendiendo Java y se encontró con un problema:
    necesita crear un programa que compare dos números enteros proporcionados por el usuario
    e indique cuál es el mayor o si son iguales.
    Sin embargo, tiene dificultades para implementar la lógica de comparación
    y mostrar el resultado correctamente. ¡Ayuda a Pedro a resolver este problema!
    Crea un programa que solicite al usuario dos números enteros,
    los compare y muestre un mensaje indicando cuál es el mayor o si ambos son iguales.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int primerNumero = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int segundoNumero = scanner.nextInt();

        if(primerNumero > segundoNumero){
            System.out.println("El numero mayor es: " + primerNumero);
        }else if(primerNumero < segundoNumero){
            System.out.println("El numero mayor es: " + segundoNumero);
        }else{
            System.out.println("Lo numeros ingresados son iguales");
        }

        scanner.close();
    }
}
