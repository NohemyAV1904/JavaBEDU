/*
 Nohemy Aguilar Valladares
 Reto 2 - Sesion 3
*/

import java.util.List;

public class ProcesadorEncuestas {

    public static void main(String[] args) {

        List<Sucursal> sucursales = List.of(
                new Sucursal("Centro", List.of(
                        new Encuesta("Ana", "El tiempo de espera fue largo", 2),
                        new Encuesta("Sofia", null, 5)
                )),
                new Sucursal("Norte", List.of(
                        new Encuesta("Lucia", "La atención fue buena, pero la limpieza puede mejorar", 3),
                        new Encuesta("Pedro", null, 4)
                )),
                new Sucursal("Sur", List.of(
                        new Encuesta("Valentina", null, 2),
                        new Encuesta("Edgar", "No encontré el medicamento que necesitaba", 1)
                ))
        );

        System.out.println("---- Seguimiento a pacientes insatisfechos ----- ");

        sucursales.stream()
                .flatMap(sucursal ->
                        sucursal.getEncuestas().stream()
                                .filter(e -> e.getCalificacion() <= 3)
                                .map(encuesta -> new Seguimiento(encuesta, sucursal.getNombre()))
                )
                .filter(seg -> seg.encuesta().getComentario().isPresent())
                .map(seg -> {
                    String comentario = seg.encuesta().getComentario().get();
                    return "• Sucursal " + seg.sucursal() +
                            ": ○ Seguimiento a paciente con comentario ○ \"" + comentario + "\"";
                })
                .forEach(System.out::println);
    }

    record Seguimiento(Encuesta encuesta, String sucursal) {
    }
}



