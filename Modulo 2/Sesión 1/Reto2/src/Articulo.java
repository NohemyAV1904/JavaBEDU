/*
 Nohemy Aguilar Valladares
 Reto 2 - Sesion 1
*/

public class Articulo extends MaterialCurso{

    private int palabras;

    public Articulo(String titulo, String autor, int palabras) {
        super(titulo, autor);
        this.palabras = palabras;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("<<<< Articulo >>>>");
        System.out.println("• Artículo: " + titulo + "\n• Autor: " + autor + "\n• Palabras: " + palabras);
    }
}
