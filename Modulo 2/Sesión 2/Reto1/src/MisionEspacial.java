/*
 Nohemy Aguilar Valladares
 Reto 1 - Sesion 2
*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MisionEspacial {

    public static void main(String[] args) throws Exception {
        System.out.println(">>>>> Misión espacial iniciada <<<<<<\n");

        ExecutorService executor = Executors.newFixedThreadPool(4);

        Future<String> futuroNav = executor.submit(new SistemaNavegacion());
        Future<String> futuroSoporte = executor.submit(new SistemaSoporteVital());
        Future<String> futuroTermico = executor.submit(new SistemaControlTermico());
        Future<String> futuroCom = executor.submit(new SistemaComunicaciones());

        System.out.println(futuroCom.get());
        System.out.println(futuroSoporte.get());
        System.out.println(futuroTermico.get());
        System.out.println(futuroNav.get());

        System.out.println("\n•••••• Todos los sistemas reportan estado operativo ••••••");

        executor.shutdown();
    }
}
