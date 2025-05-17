/*
 Nohemy Aguilar Valladares
 Reto 2 - Sesion 1
 */

public class Entrada {

    String nombreEvento;
    double precio;

    public Entrada (String nombreEvento, double precio){
        this.nombreEvento = nombreEvento;
        this.precio = precio;
    }

    public void mostrarInfo(){
        System.out.println("----- Bienvenido al teatro ------");
        System.out.println("Su evento es: " + nombreEvento);
        System.out.println("Y el precio es: $" + precio);
        System.out.println("---- Gracias por su preferencia ----");
    }
}
