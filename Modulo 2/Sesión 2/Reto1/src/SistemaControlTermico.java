/*
 Nohemy Aguilar Valladares
 Reto 1 - Sesion 2
*/

import java.util.concurrent.Callable;

public class SistemaControlTermico implements Callable<String> {

    public String call() throws Exception {
        Thread.sleep(1000);
        return "~~~~~ Control térmico ~~~~~ \n ••• Temperatura estable (22°C) •••";
    }

}
