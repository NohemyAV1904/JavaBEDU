/*
 Nohemy Aguilar Valladares
 Reto 2 - Sesion 5
*/

public class PagoTranferencia extends MetodoPago{

    private boolean validadoExternamente;

    public PagoTranferencia(double monto, boolean validadoExternamente){
        super(monto);
        this.validadoExternamente = validadoExternamente;
    }

    @Override
    public boolean autenticar(){
        return validadoExternamente;
    }

    @Override
    public void procesarPago(){
        System.out.println("---- Pago por tranferencia de: $" + monto);
    }
}
