/*
 Nohemy Aguilar Valladares
 Reto 2 - Sesion 1
*/

import java.util.List;
import java.util.function.Predicate;

public class PlataformaEducativa {

    public static void mostrarMateriales(List<? extends MaterialCurso> lista) {

        System.out.println("~~~~~ Materiales del curso ~~~~~");
        for (MaterialCurso material : lista) {
            material.mostrarDetalle();
        }
        System.out.println();
    }

    public static void contarDuracionVideos(List<? extends Video> lista) {

        int total = 0;
        for (Video video : lista) {
            total += video.getDuracion();
        }
        System.out.println("• Duración total de videos: " + total + " minutos\n");
    }

    public static void marcarEjerciciosRevisados(List<? super Ejercicio> lista) {

        for (Object obj : lista) {
            if (obj instanceof Ejercicio) {
                ((Ejercicio) obj).marcarRevisado();
            }
        }
        System.out.println();
    }

    // Reto extra

    public static <T extends MaterialCurso> void filtrarPorAutor(List<T> lista, Predicate<T> filtro) {

        System.out.println("••••• Filtrando materiales por autor ••••••");
        for (T material : lista) {
            if (filtro.test(material)) {
                material.mostrarDetalle();
            }
        }
        System.out.println();
    }
}
