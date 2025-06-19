/*
 Nohemy Aguilar Valladares
 Reto 1 - Sesion 1
*/

import java.util.List;

public class ProcesadorOrdenes {

    public static void mostrarOrdenes(List<? extends OrdenProduccion> lista){

        System.out.println("<<<<< Ordenes registradas >>>>>>");
        for(OrdenProduccion orden : lista){
            orden.mostrarResumen();
        }
        System.out.println();
    }

    public static void procesarPersonalizadas(List<? super OrdenPersonalizada> lista, int costoAdicional){

        System.out.println("~~~~~ Procesando ordenes personalizadas ~~~~~~~");
        for(Object obj : lista){
            if(obj instanceof OrdenPersonalizada){
                ((OrdenPersonalizada) obj).ajustarCosto(costoAdicional);
            }
        }
        System.out.println();
    }

    //Reto adicional

    public static void contarOrdenes(List<OrdenProduccion> lista){
        int masa = 0, personalizadas = 0, prototipos = 0;

        for(OrdenProduccion orden : lista){
            if(orden instanceof OrdenMasa) masa++;
            else if (orden instanceof OrdenPersonalizada) personalizadas++;
            else if (orden instanceof OrdenPrototipo) prototipos++;

        }

        System.out.println("<<<<< Resumen de ordenes >>>>>>");
        System.out.println("♦ Produccion en masa: " + masa);
        System.out.println("♦ Personalizadas: " + personalizadas);
        System.out.println("♦ Prototipos: " + prototipos);
    }
}

