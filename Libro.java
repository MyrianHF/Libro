
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
    }
    /**
     * Devuelve el nombre del autor del libro.
     */
    public String getNombreAutor() {
       return autor;
    }
    /**
     * Devuelve el nombre del t�tulo del libro.
     */
    public String getTituloLibro() {
       return titulo;
    }
    /**
     * Devuelve el n�mero de p�ginas del libro.
     */
    public int getNumeroPaginas() {
       return numeroPaginas;
    }
    /**
     * Devuelve detalles sobre el libro.
     */
    public String getDetalles() {
       return titulo + autor + numeroPaginas;
    }
    /**
     * Imprime nombre del autor.
     */
    public void imprimirNombreAutor() {
        System.out.println("Nombre del autor: " + autor);
    }
    /**
     * Imprime nombre del t�tulo del libro.
     */
    public void imprimirTituloLibro() {
        System.out.println("T�tulo del libro: " + titulo);
    }
    /**
     * Imprime detalles del libro.
     */
    public void imprimirDetalles() {
        System.out.println("T�tulo del libro: " + titulo);
        System.out.println("Nombre del autor: " + autor);
        System.out.println("N�mero de p�ginas: " + numeroPaginas);
    }
}
