package co.edu.uniquindio.biblioteca.parcial1.services;

import co.edu.uniquindio.biblioteca.parcial1.model.Miembro;

public interface ICrudMiembro {

    public boolean agregarMiembro (int idMiembro);
    public boolean eliminarMiembro(String nombre);
    public boolean modificarMiembro(String nombre, int edad);
    public Miembro getMiembro(String nombre);

}
