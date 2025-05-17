/*
 Nohemy Aguilar Valladares
 Reto 1 - Sesión 3
*/

public class Principal {
    public static void main(String[] args){

        Pasajero pasajero = new Pasajero("Kenia Aguilar", "P789416");
        Vuelo vuelo = new Vuelo("EU746", "Boston", "05:30");

        boolean reservado = vuelo.reservarAsiento(pasajero);
        if(reservado){
            System.out.println("Reserva realizada con éxito! \n Disfrute su viaje!");
        }else{
            System.out.println("No se pudo realizar la reserva. Lo sentimos. \n");
        }

        System.out.println(vuelo.obtenerIntinerario());

        System.out.println("Cancelando reserva...\n");
        vuelo.cancelarReserva();

        System.out.println(vuelo.obtenerIntinerario());

        vuelo.reservarAsiento("Nohemy Aguilar", "P156971");
        System.out.println(vuelo.obtenerIntinerario());
    }
}
