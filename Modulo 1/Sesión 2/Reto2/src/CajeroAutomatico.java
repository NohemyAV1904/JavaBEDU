/*
 Nohemy Aguilar Valladares
 Reto 2 - Sesión 2
*/

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opc;
        var saldo = 1000.0;

        do {
            System.out.println("----- Bienvenido al cajero automatico -----");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Deporsitar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.println("Ingrese su opcion: ");

            opc = sc.nextInt();

            switch (opc) {
                case 1 -> {
                    System.out.println("Su saldo actual es: $" + saldo);
                }
                case 2 -> {
                    System.out.println("Ingrese el monto a depositar: $");
                    double deposito = sc.nextDouble();
                    if (deposito <= 0) {
                        System.out.println("Ingrese un monto mayor a 0");
                        continue;
                    }
                    saldo += deposito;
                    System.out.println("Depósito actualizado con éxito!");
                    System.out.println("Su nuevo saldo es: $" + saldo);
                }
                case 3 -> {
                    System.out.println("Ingrese el monto a retirar: $");
                    double retirar = sc.nextDouble();
                    if (retirar <= 0) {
                        System.out.println("El monto a retirar debe ser mayor a 0");
                        continue;
                    }
                    if (retirar > saldo) {
                        System.out.println("Su saldo es insuficiente para realizar este retiro, su saldo actual es: $" + saldo);
                    } else {
                        saldo -= retirar;
                        System.out.println("Retiro exitoso!");
                        System.out.println("Su saldo actual es de: $" + saldo);
                    }
                }
                case 4 -> {
                    System.out.println("Gracias por usar el cajero automatico!");
                }
                default -> {
                    System.out.println("Elija una opción entre 1 y 4");
                }
            }
        } while (opc != 4);
        sc.close();
    }
}
