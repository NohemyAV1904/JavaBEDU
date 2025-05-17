/*
 Nohemy Aguilar Valladares
 Reto 1 - Sesión 4
*/

public class Factura {

    private String folio, cliente;
    private double total;

    public Factura(String folio, String cliente, double total){

        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    @Override
    public String toString(){
        return "Factura: \n [• folio = " + folio + "\n • cliente: " + cliente + "\n • total: $" + total + "]\n";
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;

        Factura otra= (Factura) obj;
        return this.folio.equals(otra.folio);
    }

    @Override
    public int hashCode(){
        return folio.hashCode();
    }
}
