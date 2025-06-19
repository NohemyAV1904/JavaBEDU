/*
 Nohemy Aguilar Valladares
 Reto 2 - Sesion 1
*/

public class Ejercicio extends MaterialCurso{

    private boolean revisado;

    public Ejercicio(String titulo, String autor) {
        super(titulo, autor);
        this.revisado = false;
    }

    public void marcarRevisado() {
        this.revisado = true;
        System.out.println("♠ Ejercicio '" + titulo + "' revisado.");
    }

    public boolean isRevisado() {
        return revisado;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("<<<< Ejercicio >>>>>");
        System.out.println("• Ejercicio: " + titulo + "\n• Autor: " + autor + "\n• Revisado: " + revisado);
    }

}
