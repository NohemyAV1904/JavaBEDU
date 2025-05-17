/*
 Nohemy Aguilar Valladares
 Reto 1 - Sesión 4
*/

public class Main {
    public static void main(String[] args){

        Factura f1 = new Factura("FAC123456", "Kenia Aguilar", 4987.99);
        Factura f2 = new Factura("FAC123456", "Karen Rosales", 4987.99);

        System.out.println(f1);
        System.out.println(f2);

        System.out.println("---- ¿Facturas iguales? -----\n" + f1.equals(f2));
    }
}
