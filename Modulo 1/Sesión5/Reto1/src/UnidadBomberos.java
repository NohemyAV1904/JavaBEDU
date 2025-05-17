/*
 Nohemy Aguilar Valladares
 Reto 1 - Sesion 5
*/


public class UnidadBomberos extends UnidadEmergencia {

    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    public UnidadBomberos(String nombre, String nombreOperador){

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
        System.out.println("----- Unidad de Bomberos atendiendo incendio estructural ------");
    }

}