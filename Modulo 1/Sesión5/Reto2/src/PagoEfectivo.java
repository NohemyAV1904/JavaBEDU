/*
 Nohemy Aguilar Valladares
 Reto 2 - Sesion 5
*/

public class PagoEfectivo extends MetodoPago{

    public PagoEfectivo(double monto){
        super(monto);
    }

    @Override
    public boolean autenticar(){
        return true;
    }

    @Override
    public void procesarPago(){
        System.out.println("*** Pago en efectivo por: $" + monto);
    }
}
