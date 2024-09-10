package co.edu.uniquindio.biblioteca.parcial1.services;

import co.edu.uniquindio.biblioteca.parcial1.model.Libro;

public interface ICrudLibro {

    public boolean aagregarLibro (int idMiembro);
    public boolean eliminarLibro(String nombre);
    public boolean modificarLibro(String nombre, int edad);
    public Libro getLibro(String nombre);
}
