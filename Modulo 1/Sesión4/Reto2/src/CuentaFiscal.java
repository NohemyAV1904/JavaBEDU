/*
 Nohemy Aguilar Valladares
 Reto 2 - Sesion 4
*/

import java.util.Objects;

public class CuentaFiscal {

    private final String rfc;
    private double saldoDisponible;

    public CuentaFiscal(String rfc, double saldoDisponible){

        this.rfc = rfc;
        if(saldoDisponible >= 0){
            this.saldoDisponible = saldoDisponible;
        }else{
            System.out.println("El saldo no puede ser negativo por lo que se asigna $0");
            this.saldoDisponible = 0;
        }
    }

    public String getRfc(){
        return rfc;
    }

    public double getSaldoDisponible(){
        return saldoDisponible;
    }

    public boolean validarRFC(DeclaracionImpuestos d){
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }

    public void mostrarCuenta(){
        System.out.println("----- Información ------");
        System.out.println("Cuenta fiscal registrada!");
        System.out.println("• RFC registrado: " + rfc);
        System.out.println("• Saldo diponible: $" + saldoDisponible);
    }
}
