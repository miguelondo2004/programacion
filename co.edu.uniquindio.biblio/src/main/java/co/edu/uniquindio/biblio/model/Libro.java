package co.edu.uniquindio.biblio.model;

public class Libro {
    private String titulo;
    private String genero;
    private String autor;
    private int anioPublicacion;
    private String editorial;
    private int numeroPaginas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }


    public static boolean esVocal(char caracter) {

        char caracterMinusc = Character.toLowerCase(caracter);

        return caracterMinusc == 'a' || caracterMinusc == 'e' || caracterMinusc == 'i' || caracterMinusc == 'o' || caracterMinusc == 'u';
    }
}
