/*
 Nohemy Aguilar Valladares
 Reto 2 - Sesión 3
*/

public class Principal {
    public static void main (String[] args){
        Factura facturaRFC = new Factura(69747.36, "Servicio de consultoria", "OUJS97455DS1");
        Factura facturaSinRFC = new Factura(8569.99, "Servicio automovilistico", null);

        System.out.println(facturaRFC.getResumen());
        System.out.println(facturaSinRFC.getResumen());
    }
}
