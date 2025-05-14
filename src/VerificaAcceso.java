import java.util.Scanner;

public class VerificaAcceso {
    /*
    Juan está desarrollando un sistema de seguridad para una empresa.
    Para acceder al sistema, el usuario debe proporcionar:
    - Un código de acceso numérico (el código correcto es 2023).
    - Un nivel de permiso numérico (los niveles válidos son 1, 2 o 3).

    El sistema solo permitirá el acceso si:
    - El código de acceso es correcto.
    - El nivel de permiso es válido (1, 2 o 3).
    De lo contrario, el acceso será denegado, y el programa debe informar el motivo
    (código incorrecto, nivel de permiso inválido o ambos).

    Crea un programa que reciba el código de acceso y el nivel de permiso y muestre un mensaje
    indicando si el acceso fue permitido o denegado, además del motivo, si es el caso.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el código de acceso: ");
        int codigo = scanner.nextInt();
        System.out.println("Ingrese el nivel de permiso: ");
        int nivel = scanner.nextInt();

        if(codigo == 2023 && (nivel == 1 || nivel == 2 || nivel == 3)){
            System.out.println("Acceso permitido. ¡Bienvenido al sistema!");
        }else{
            System.out.print("Acceso Denegado. ");
            if(codigo != 2023){
                System.out.print("Codigo de acceso incorrecto. ");
            }
            if(!(nivel == 1 || nivel == 2 || nivel == 3)){
                System.out.print("Nivel de permiso invalido.");
            }
        }
        scanner.close();
    }
}
