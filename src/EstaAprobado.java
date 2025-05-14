import java.util.Scanner;

public class EstaAprobado {
    /*
    Julia es profesora y necesita un programa que la ayude a determinar si un estudiante
    ha sido aprobado en la asignatura. La regla de la escuela es:
    - El estudiante es aprobado si su promedio final es mayor o igual a 7.0.
    - Si el promedio está entre 5.0 y 6.9, está en recuperación.
    - Si es inferior a 5.0, está reprobado.

    Crea un programa que, a partir de una variable media,
    muestre la situación del estudiante según las reglas de la escuela.
     */
    public static void main(String[] args) {

        System.out.println("Ingresa el promedio final del estudiante: ");
        Scanner scanner = new Scanner(System.in);
        double promedio = scanner.nextDouble();

        if(promedio <= 5){
            System.out.println("El estudiante tuvo un promedio de " +promedio+ " y fue reprobado.");
        } else if (promedio < 7) {
            System.out.println("El estudiante tuvo un promedio de " +promedio+ " y está en recuperación.");
        }else{
            System.out.println("El estudiante tuvo un promedio de " +promedio+ " y fue aprobado.");
        }

        scanner.close();
    }
}
