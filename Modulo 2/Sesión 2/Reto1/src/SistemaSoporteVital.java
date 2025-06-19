/*
 Nohemy Aguilar Valladares
 Reto 1 - Sesion 2
*/

import java.util.concurrent.Callable;

public class SistemaSoporteVital implements Callable<String> {

    public String call() throws Exception {
        Thread.sleep(800);
        return "~~~  Soporte vital ~~~~~ \n ••• Presión y oxígeno dentro de parámetros normales •••";
    }
}
