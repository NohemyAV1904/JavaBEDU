/*
 Nohemy Aguilar Valladares
 Reto 1 - Sesion 1
*/

public abstract class OrdenProduccion {

    protected String codigo;
    protected int cantidad;

    public OrdenProduccion(String codigo, int cantidad){
        this.codigo = codigo;
        this.cantidad = cantidad;
    }

    public void mostrarResumen(){
        System.out.println("• Código: " + codigo + "\n•Cantidad: " + cantidad);
    }

}
