/*
 Nohemy Aguilar Valladares
 Reto 1 - Sesion 8
*/

public class DialogoTexto implements GestorDialogo{

    public void mostrarDialogo(PaqueteNarrativo paquete){

        System.out.println("~ Escena actual: \n" + paquete.getEscenaActual());
        System.out.println("~~~ Una figura misteriosa aparece y te ofrece dos caminos...");
    }
}
