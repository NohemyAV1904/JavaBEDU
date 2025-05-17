/*
 Nohemy Aguilar Valladares
 Reto 1 - Sesión 3
*/

import java.util.Scanner;

public class Vuelo {

    final String codigoVuelo;
    String destino;
    String horaSalida;
    Pasajero asientoReservado;

    public Vuelo(String codigoVuelo, String destino, String horaSalida){

        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    public boolean reservarAsiento(Pasajero p){

        if(asientoReservado == null){
            asientoReservado = p;
            return true;
        }else{
            return false;
        }
    }

    public boolean reservarAsiento(String nombre, String pasaporte){

        Pasajero nuevoPasajero = new Pasajero(nombre, pasaporte);
        return reservarAsiento(nuevoPasajero);
    }

    public void cancelarReserva(){
        asientoReservado = null;
    }

    public String obtenerIntinerario(){

        String info = "---- Intinerario de vuelo----\n";
        info += "Código de vuelo: " + codigoVuelo + "\n";
        info += "Destino: " + destino + "\n";
        info += "Hora de salida: " + horaSalida + " hrs.\n";
        if(asientoReservado != null){
            info += "Pasajero: " + asientoReservado.nombre + "\n";
        }else{
            info += "Pasajero: [Sin reserva]\n";
        }
        return info;
    }

}
