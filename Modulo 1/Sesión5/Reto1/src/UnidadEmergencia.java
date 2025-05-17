/*
 Nohemy Aguilar Valladares
 Reto 1 - Sesion 5
*/

public abstract class UnidadEmergencia {

    String nombre;

    public UnidadEmergencia(String nombre){

        this.nombre = nombre;

    }

    public void activarUnidad(){
        System.out.println(">>>>> Activando unidad <<<<<");
        System.out.println(nombre + " en camino");
    }

    public abstract void responder();
}
