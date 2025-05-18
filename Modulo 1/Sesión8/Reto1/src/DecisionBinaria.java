/*
 Nohemy Aguilar Valladares
 Reto 1 - Sesion 8
*/

import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision{

    public String tomarDecision(){

        Scanner sc = new Scanner(System.in);

        System.out.println("--- ¿Qué deseas hacer? ---");
        System.out.println("• A: Ir al bosque");
        System.out.println("• B: Volver al pueblo");
        System.out.println("--- Selecciona A o B ---\n");
        String input = sc.nextLine();
        return input.toUpperCase();
    }
}
