import java.util.Scanner;

public class ValidaPasword {
    /*
    Jéssica trabaja en el departamento de TI de una empresa y necesita
    garantizar la seguridad de los accesos al sistema interno.
    Los empleados utilizan una contraseña fija para acceder a sus cuentas,
    y el sistema debe verificar si la contraseña ingresada es correcta.

    Ayuda a Jéssica a crear un programa que, con base en una contraseña predefinida,
    por ejemplo: 123456, verifique si lo que el usuario digitó es correcto o no.
    El programa debe comparar el intento con la contraseña correcta
    y mostrar si el acceso fue permitido o denegado.
     */

    public static void main(String[] args) {

        System.out.println("Ingrese la contraseña: ");
        Scanner scanner = new Scanner(System.in);
        String contrasenia = scanner.nextLine();

        if(contrasenia.equals("123abc#")){
            System.out.println("¡Acceso permitido!");
        }else{
            System.out.println("¡Acceso denegado!");
        }

        scanner.close();
    }
}
