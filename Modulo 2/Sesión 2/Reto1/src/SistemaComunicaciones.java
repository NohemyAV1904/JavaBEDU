/*
 Nohemy Aguilar Valladares
 Reto 1 - Sesion 2
*/

import java.util.concurrent.Callable;

public class SistemaComunicaciones implements Callable<String> {

    public String call() throws Exception {
        Thread.sleep(600);
        return "~~~~ Comunicaciones ~~~~ \n••• Enlace con estación terrestre establecido •••";
    }

}
