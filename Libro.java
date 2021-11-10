
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
    private String numeroReferencia;
    private int vecesPrestado;
    private boolean esLibroDeTexto;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
        numeroReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto = false;
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
    public boolean getSiEsLibroDeTexto() {
       return esLibroDeTexto;
    }
    /**
     * Devuelve si el libro es de texto.
     */
    public int getNumeroPaginas() {
       return numeroPaginas;
    }
    /**
     * Devuelve el n�mero de referencia del libro.
     */
    public String getNumeroReferencia() {
       return numeroReferencia;
    }
    /**
     * Devuelve el n�mero de veces que se ha prestado un libro.
     */
    public int getNumeroDeVecesPrestado() {
       return vecesPrestado;
    }
    /**
     * Contabiliza n�mero de veces que se presta.
     */
    public void prestar() {
       vecesPrestado = vecesPrestado + 1;
    }
    /**
     * Establece n�mero de referencia.
     */
    public void setNumeroReferencia(String numeroDeReferencia) {
       if (numeroDeReferencia.length() >= 3) {
           numeroReferencia = numeroDeReferencia;
       }
       else {
           System.out.println("Error: caracteres del n�mero de referencia insuficiente");
       }
    }
    /**
     * Devuelve detalles sobre el libro.
     */
    public String getDetalles() {
        String numReferencia = "";
        String libroTexto = "";
       if (numeroReferencia.length() > 0) {
           numReferencia = numeroReferencia;
       }
       else {
           numReferencia = "ZZZ";
       }
       if (esLibroDeTexto == true) {
            libroTexto = "Si es libro de texto";
        }
        else {
            libroTexto = "No es libro de texto";
        }
        return "Titulo: " + titulo + "/ Autor: " + autor + "/ N� p�gs.: " + numeroPaginas + "/ N� ref.: " + numReferencia + "/ N� veces prestado: " + vecesPrestado + " / " + libroTexto;
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
        System.out.println("N�mero de veces prestado: " + vecesPrestado);
        if (numeroReferencia != "") {
            System.out.println("N�mero de referencia: " + numeroReferencia);
        }
        else {
            System.out.println("N�mero de referencia: ZZZ");
        }
        if (esLibroDeTexto == true) {
            System.out.println("Si es un libro de texto.");
        }
        else {
            System.out.println("No es un libro de texto.");
        }
    }
}
