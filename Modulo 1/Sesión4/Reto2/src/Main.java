/*
 Nohemy Aguilar Valladares
 Reto 2 - Sesion 4
*/

public class Main {
    public static void main(String[] args){

        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("WSRA970612YU7", 41589.89);
        CuentaFiscal cuenta = new CuentaFiscal("WSRA970612YU7", 12347.50);

        System.out.println("----- Resumen de declaración ------");
        System.out.println("• Declaración enviada por RFC: " + declaracion.rfcContribuyente());
        System.out.println("• Declaración por: $" + declaracion.montoDeclarado());
        cuenta.mostrarCuenta();

        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println(">>>>> ¿El RFC es valido para esta cuenta? <<<<<\n" + rfcValido);

    }
}
