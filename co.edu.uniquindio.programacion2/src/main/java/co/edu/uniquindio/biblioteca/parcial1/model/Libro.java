package co.edu.uniquindio.biblioteca.parcial1.model;

public class Libro extends Item{

    public String Isbn;

    public Libro(){
    }

    public Libro(String titulo, String autor, EstadoItem estado){
        super(titulo, autor, estado);

    }

    public String getIsbn() { return Isbn; }

    public void setIsbn(String isbn) { Isbn = isbn; }
}
