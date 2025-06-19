/*
 Nohemy Aguilar Valladares
 Reto 1 - Sesion 3
*/


import java.util.List;
import java.util.Optional;

public class ConfirmacionPedidos {

    public static void main(String[] args) {
        List<Pedido> pedidos = List.of(
                new Pedido("Kenia", "domicilio", "2226784712"),
                new Pedido("Karen", "local", null),
                new Pedido("Alex", "domicilio", null),
                new Pedido("Edgar", "domicilio", "2266903400")
        );

        List<String> mensajes = pedidos.stream()
                .filter(p -> p.getTipoEntrega().equalsIgnoreCase("domicilio"))
                .map(Pedido::getTelefono)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .map(tel -> ">>>> Se envio confirmación al: " + tel)
                .toList();

        System.out.println("---- Confirmaciones a domicilio -----");
        mensajes.forEach(System.out::println);
    }

}
