/*
 Nohemy Aguilar Valladares
 Reto 2 - Sesion 8
*/

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class MonitorCPU {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Set<Integer> registrosCPU = new HashSet<>();

        try{

            System.out.println("~~~~ Bienvenido al monitoreo de CPU ~~~~~");
            System.out.println("Ingrese los consumos del CPU en porcentajes (enteros).");
            System.out.println("* Escribe '-1' para terminar *");

            while (true){
                System.out.println("• Consumo del CPU (%): ");
                int valor = sc.nextInt();

                if (valor == -1){
                    break;
                }
                if (valor < 0 || valor > 100){
                    System.out.println("--- Valores fuera de rango ---");
                    System.out.println("Ingrese un valor entre 0 y 100");
                    continue;
                }
                if (!registrosCPU.add(valor)){
                    System.out.println("*** Hay un valor duplicado ***\n • Valor duplicado: " + valor + "%");
                    continue;
                }
                if (valor > 95){
                    throw new ConsumoCriticoException("*** ALERTA ***\n --- Consumo critico dectectado ---\n" + valor + "% de CPU consumido");
                }

                System.out.println("~~~~ Registro exitoso ~~~~");
                System.out.println("♦ Consumo de CPU: " + valor + "%");
            }
        } catch (InputMismatchException e){
            System.out.println("---- ERROR ----\n - Debe ingresarse un número entero valido -");
        } catch (ConsumoCriticoException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("---- ERROR inesperado ----\n" + e.getMessage());
        } finally {
            sc.close();
            System.out.println("~~~~ Registros completados correctamente ~~~~");
        }
    }
}
