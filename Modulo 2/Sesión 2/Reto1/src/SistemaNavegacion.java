/*
 Nohemy Aguilar Valladares
 Reto 1 - Sesion 2
*/

import java.util.concurrent.Callable;

public class SistemaNavegacion implements Callable<String> {

    public String call() throws Exception {
        Thread.sleep(1200); // Simulación de procesamiento
        return "~~~~~ Navegación ~~~~~ \n  ••• Trayectoria corregida con éxito •••";

    }

}
