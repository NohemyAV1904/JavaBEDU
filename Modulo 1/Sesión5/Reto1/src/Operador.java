/*
 Nohemy Aguilar Valladares
 Reto 1 - Sesion 5
*/

public class Operador {

    String nombre;

    public Operador(String nombre){
        this.nombre = nombre;
    }

    public void reportarse(){
        System.out.println("**** Operador: " + nombre + " activo ****");
    }
}
