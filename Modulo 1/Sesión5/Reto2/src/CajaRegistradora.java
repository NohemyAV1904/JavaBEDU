/*
 Nohemy Aguilar Valladares
 Reto 2 - Sesion 5
*/

public class CajaRegistradora {
    public static void main(String[] args){

        MetodoPago[] pagos = {
                new PagoEfectivo(1569.47),
                new PagoTarjeta(897.14, 5971.36),
                new PagoTranferencia(718.12, false)
        };

        for(MetodoPago pago : pagos){
            if(pago.autenticar()){
                System.out.println(">>> Autentificación exitosa, gracias por su compra! ☻ <<<<<");
                pago.procesarPago();
                pago.mostrarResumen();
            }else{
                System.out.println("♦♦♦♦ Fallo autenticación, por favor revise su método de pago ♦♦♦♦\n " + pago.getClass().getSimpleName() + " no valido");
            }
            System.out.println();
        }
    }
}
