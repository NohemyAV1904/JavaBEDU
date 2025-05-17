/*
 Nohemy Aguilar Valladares
 Reto 1 - Sesión 2
*/

import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {

        String nombreMed;
        double precioUni, total, des;
        int cantidad;
        Scanner sc = new Scanner(System.in);

        System.out.println("----- Bienvenido a la farmacia ------");
        System.out.println("Ingrese el nombre de su medicamento: ");
        nombreMed = sc.nextLine();
        System.out.println("Ingrese el precio unitario: $");
        precioUni = sc.nextDouble();
        System.out.println("Ingrese la cantidad de piezas: ");
        cantidad = sc.nextInt();

        total = precioUni * cantidad;

        // Calcular si tiene descuento usando operador ternario

        var descuento = total > 500;
        des = descuento ? total * 0.15 : 0;

        double totalDes = total - des;

        System.out.println("---- Resumen de compra -----");
        System.out.println("Su medicamento es: " + nombreMed);
        System.out.println("La cantidad de piezas son: " + cantidad);
        System.out.println("El precio unitario es: $" + precioUni);
        System.out.println("Su total sin descuento es: $" + total);
        System.out.println("¿Se aplica descuento?: " + descuento);
        System.out.println("Su descuento es: $" + des);
        System.out.println("Su total a pagar es: $" + totalDes);
        System.out.println("----- Gracias por su compra ------");

    }
}
