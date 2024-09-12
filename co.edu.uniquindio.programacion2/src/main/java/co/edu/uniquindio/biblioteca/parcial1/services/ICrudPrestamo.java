package co.edu.uniquindio.biblioteca.parcial1.services;
import co.edu.uniquindio.biblioteca.parcial1.model.Prestamo;
import co.edu.uniquindio.biblioteca.parcial1.model.Libro;
import co.edu.uniquindio.biblioteca.parcial1.model.Miembro;

public interface ICrudPrestamo {

    public boolean crearPrestamo(String tituloLibro, int idMiembro);
    public boolean eliminarPrestamo(String tituloLibro, int idMiembro);
    public Prestamo getPrestamo();
}
