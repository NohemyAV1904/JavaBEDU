/*
 Nohemy Aguilar Valladares
 Reto 2 - Sesion 1
*/

public class Video extends MaterialCurso{

    private int duracion;

    public Video(String titulo, String autor, int duracion) {
        super(titulo, autor);
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("<<<< Video >>>>");
        System.out.println("• Video: " + titulo + "\n• Autor: " + autor + "\n • Duración: " + duracion + " min");
    }

}
