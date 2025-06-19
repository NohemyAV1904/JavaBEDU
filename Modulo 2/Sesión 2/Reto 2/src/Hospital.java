/*
 Nohemy Aguilar Valladares
 Reto 2 - Sesión 2
*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Hospital {

    public static void main(String[] args) {
        System.out.println(" ~~~~~ Acceso al recurso ~~~~~~");

        RecursoMedico Quirofano = new RecursoMedico("Quirofano");

        ExecutorService executor = Executors.newFixedThreadPool(4);

        executor.submit(new Profesional("Dr. Torres", Quirofano));
        executor.submit(new Profesional("Dr. Gonzales", Quirofano));
        executor.submit(new Profesional("Enfermero Luna", Quirofano));
        executor.submit(new Profesional("Dra. Torrecillas", Quirofano));

        executor.shutdown();
    }
}
