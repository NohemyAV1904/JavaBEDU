/*
 Nohemy Aguilar Valladares
 Reto 1 - Sesion 1
*/

public class OrdenMasa extends OrdenProduccion{

    public OrdenMasa(String codigo, int cantidad){
        super(codigo, cantidad);
    }

    @Override
    public void mostrarResumen(){
        System.out.println("---- Orden Masa -----");
        System.out.println("• Codigo: " + codigo + "\n• Cantidad: " + cantidad);
    }
}
