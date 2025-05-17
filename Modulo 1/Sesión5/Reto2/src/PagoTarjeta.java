/*
 Nohemy Aguilar Valladares
 Reto 2 - Sesion 5
*/

public class PagoTarjeta extends MetodoPago{

    private double saldoDisponible;

    public PagoTarjeta(double monto, double saldoDisponible){
        super(monto);
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public boolean autenticar(){
        return saldoDisponible >= monto;
    }

    @Override
    public void procesarPago(){
        System.out.println(">>> Pago con tarjeta por: $" + monto);
    }
}
