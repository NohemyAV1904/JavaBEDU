/*
 Nohemy Aguilar Valladares
 Reto 1 - Sesion 1
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlantaIndustrial {
    public static void main(String[] args) {
        List<OrdenMasa> ordenesMasa = Arrays.asList(
                new OrdenMasa("M123", 20),
                new OrdenMasa("M124", 75)
        );

        List<OrdenPersonalizada> ordenesPersonalizadas = Arrays.asList(
                new OrdenPersonalizada("P456", 10, "Lucia"),
                new OrdenPersonalizada("P789", 15, "Pedro")
        );

        List<OrdenPrototipo> ordenesPrototipo = Arrays.asList(
                new OrdenPrototipo("O578", 10, "Diseño"),
                new OrdenPrototipo("O598", 5, "Pruebas")
        );


        ProcesadorOrdenes.mostrarOrdenes(ordenesMasa);
        ProcesadorOrdenes.mostrarOrdenes(ordenesPersonalizadas);
        ProcesadorOrdenes.mostrarOrdenes(ordenesPrototipo);

        ProcesadorOrdenes.procesarPersonalizadas(new ArrayList<>(ordenesPersonalizadas), 270);

        List<OrdenProduccion> todas = new ArrayList<>();
        todas.addAll(ordenesMasa);
        todas.addAll(ordenesPersonalizadas);
        todas.addAll(ordenesPrototipo);
        ProcesadorOrdenes.contarOrdenes(todas);
    }
}
