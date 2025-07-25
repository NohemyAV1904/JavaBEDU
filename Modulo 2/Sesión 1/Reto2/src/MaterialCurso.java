/*
 Nohemy Aguilar Valladares
 Reto 2 - Sesion 1
*/

public abstract class MaterialCurso {
    protected String titulo;
    protected String autor;

    public MaterialCurso(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public abstract void mostrarDetalle();
}
