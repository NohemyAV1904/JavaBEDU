/*
 Nohemy Aguilar Valladares
 Reto 2 - Sesion 1
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CursoOnline {

    public static void main(String[] args) {

        List<MaterialCurso> materiales = new ArrayList<>();

        Video v1 = new Video("Introducción a Java", "Mario", 25);
        Video v2 = new Video("POO en Java", "Carlos", 20);
        Articulo a1 = new Articulo("Historia de Java", "Ana", 12895);
        Articulo a2 = new Articulo("Tipos de datos", "Luis", 6378);
        Ejercicio e1 = new Ejercicio("Variables y tipos", "Luis");
        Ejercicio e2 = new Ejercicio("Condicionales", "Mario");

        materiales.addAll(Arrays.asList(v1, v2, a1, a2, e1, e2));

        PlataformaEducativa.mostrarMateriales(materiales);

        PlataformaEducativa.contarDuracionVideos(Arrays.asList(v1, v2));

        PlataformaEducativa.marcarEjerciciosRevisados(materiales);

        PlataformaEducativa.filtrarPorAutor(materiales, m -> m.getAutor().equals("Luis"));
    }
}
