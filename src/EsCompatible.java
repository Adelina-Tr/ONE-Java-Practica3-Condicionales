import java.util.Scanner;

public class EsCompatible {
    /*
    María trabaja en un banco de sangre y necesita verificar si un donante es compatible para donar sangre.
    Para ser compatible, el donante debe cumplir con los siguientes criterios:
    - Tener entre 18 y 65 años.
    - Pesar más de 50 kg.

    Ella desea un programa que reciba la edad y el peso del donante e indique si es compatible para donar sangre.
    Si no lo es, el programa debe indicar qué criterio no fue cumplido.
    ¿Cómo crearías un programa que reciba la edad y el peso del donante y muestre un mensaje
     indicando si es compatible o no, además de informar qué criterio no fue cumplido, si es el caso?
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la edad del donante: ");
        int edad = scanner.nextInt();
        System.out.println("Ingrese el peso del donante (en kg): ");
        double peso = scanner.nextDouble();

        if(edad < 65 && edad > 18 && peso > 50){
            System.out.println("El donante es compatible");
        }else{
            System.out.println("El donante no es compatible");
            if(peso<50){
                System.out.println("Motivo: Debe pesar más de 50kg");
            }
            if(!(edad < 65 && edad > 18)){
                System.out.println("Motivo: Debe tener entre 18 y 65 años.");
            }
        }
        scanner.close();
    }
}
