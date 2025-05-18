/*
 Nohemy Aguilar Valladares
 Reto 1 - Sesion 8
*/

public class MainNarrativa {
    public static void main(String[] args){

        PaqueteNarrativo paquete = new PaqueteNarrativo("~~~ Iniciando Viaje  ~~~~~");
        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        dialogo.mostrarDialogo(paquete);
        String accion = decision.tomarDecision();
        transicion.realizarTransicion(accion);
    }
}
