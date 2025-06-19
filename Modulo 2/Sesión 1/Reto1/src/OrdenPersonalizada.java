/*
 Nohemy Aguilar Valladares
 Reto 1 - Sesion 1
*/

public class OrdenPersonalizada extends OrdenProduccion{

    private String cliente;

    public OrdenPersonalizada(String codigo, int cantidad, String cliente){
        super(codigo, cantidad);
        this.cliente = cliente;
    }

    public void ajustarCosto(int costo){
        System.out.println("----- Ajuste de orden -----");
        System.out.println("♦ Orden: " + codigo + " ajustada con un costo adicional de $" + costo);
    }

    @Override
    public void mostrarResumen(){
        System.out.println("♠ Orden Personalizada ♠");
        System.out.println("• Codigo: " + codigo + "\n• Cantidad: " + cantidad + "\n• Cliente: " + cliente);
    }
}
