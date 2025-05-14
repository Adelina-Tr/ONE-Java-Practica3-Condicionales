import java.util.Scanner;

public class VerificaTriangulo {
    /*
    Marcos está estudiando geometría y necesita verificar si tres lados pueden formar un triángulo.
    Para que tres lados formen un triángulo, la suma de dos lados debe ser mayor que el tercer lado.
    Él quiere un programa que reciba tres lados y muestre un mensaje indicando
    si los lados pueden formar un triángulo o no.
    Con base en este escenario, crea un programa que reciba tres lados
    y muestre un mensaje indicando si los lados pueden formar un triángulo o no.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer lado: ");
        double primerLado = scanner.nextDouble();
        System.out.println("Ingrese el segundo lado: ");
        double segundoLado = scanner.nextDouble();
        System.out.println("Ingrese el tercer lado: ");
        double tercerLado = scanner.nextDouble();

        double suma1 = primerLado + segundoLado;
        double suma2 = primerLado + tercerLado;
        double suma3 = segundoLado + tercerLado;

        if(suma1 > tercerLado && suma2 > segundoLado && suma3 > primerLado){
            System.out.println("Los lados SÍ pueden formar un triángulo.");
        }else{
            System.out.println("Los lados NO pueden formar un triángulo.");
        }
        scanner.close();
    }
}
