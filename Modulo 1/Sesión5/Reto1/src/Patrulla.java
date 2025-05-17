/*
 Nohemy Aguilar Valladares
 Reto 1 - Sesion 5
*/

public class Patrulla extends UnidadEmergencia{

    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    public Patrulla(String nombre, String nombreOperador){

        super(nombre);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(nombreOperador);
    }

    public void iniciarOperacion(){

        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }

    @Override
    public void responder(){
        System.out.println("----- Patrulla en camino a atender situación de seguridad ciudadana -----");
    }
}
