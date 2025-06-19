/*
 Nohemy Aguilar Valladares
 Reto 1 - Sesion 1
*/

public class OrdenPrototipo extends OrdenProduccion{

    private String faseDesarrollo;

    public OrdenPrototipo(String codigo, int cantidad, String faseDesarrollo){
        super(codigo, cantidad);
        this.faseDesarrollo = faseDesarrollo;
    }

    @Override
    public void mostrarResumen(){
        System.out.println("◘ Orden prototipo ◘");
        System.out.println("• Codigo: " + codigo + "\n• Cantidad: " + cantidad +"\n• Fase: " + faseDesarrollo);
    }
}
