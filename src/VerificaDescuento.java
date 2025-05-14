import java.util.Scanner;

public class VerificaDescuento {
     /*
    Marcos trabaja en una tienda y necesita verificar si un cliente tiene derecho a un descuento del 10% en su compra.
    El descuento se aplica solo si el valor de la compra es mayor o igual a $100.00.
    Para ello, quiere un programa que permita ingresar el valor de la compra y muestre
    si el descuento fue aplicado o no, junto con el nuevo valor después del descuento, en caso de que corresponda.

    Basado en este escenario, crea un programa que reciba el valor de la compra
    y muestre un mensaje indicando si el descuento fue aplicado o no.
     */
    public static void main(String[] args) {
        System.out.println("Ingrese el valor de la compra: ");
        Scanner scanner = new Scanner(System.in);
        double compra = scanner.nextDouble();

        if(compra >= 100){
            double nuevoValor = compra * 0.9;
            System.out.println("Descuento del 10% aplicado.");
            System.out.println("Nuevo valor: $"+ nuevoValor);
        }else{
            System.out.println("Descuento no aplicado. ");
            System.out.println("Valor total: $"+compra);
        }
        scanner.close();
    }
}
