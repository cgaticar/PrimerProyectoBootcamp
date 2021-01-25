package Clase2;

public class Libro {
    private String titulo;
    private String autor;
    private long isbn = 9999999999L;
    private boolean disponible = true;

    public Libro()
    {
        titulo = "Titulo desconocido";
        autor = "Autor desconocido";
    }

    public Libro(String autor, String titulo)
    {
        setAutor(autor);
        setTitulo(titulo);
    }

    public Libro(String autor, String titulo, long isbn)
    {
        setAutor(autor);
        setTitulo(titulo);
        setIsbn(isbn);
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    public String getAutor()
    {
        return autor;
    }

    public void setIsbn(long isbn)
    {
        this.isbn = isbn;
    }

    public long getIsbn()
    {
        return isbn;
    }

    public void setDisponible()
    {
        disponible = !disponible;
    }

    public boolean getDisponible()
    {
        return disponible;
    }

    public void prestamo()
    {
        if(disponible) setDisponible();
        else System.out.println("No esta disponible");
    }

    public void devolucion()
    {
        if(!disponible) setDisponible();
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn=" + isbn +
                ", disponible=" + disponible +
                '}';
    }
}
