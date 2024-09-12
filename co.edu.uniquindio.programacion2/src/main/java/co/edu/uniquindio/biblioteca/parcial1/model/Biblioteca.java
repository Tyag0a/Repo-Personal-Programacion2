package co.edu.uniquindio.biblioteca.parcial1.model;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;
import co.edu.uniquindio.biblioteca.parcial1.model.*;
import co.edu.uniquindio.biblioteca.parcial1.services.ICrudLibro;
import co.edu.uniquindio.biblioteca.parcial1.services.ICrudMiembro;
import co.edu.uniquindio.biblioteca.parcial1.services.ICrudPrestamo;

public class Biblioteca implements ICrudMiembro, ICrudLibro, ICrudPrestamo {

    String nombre;
    Collection<Miembro> listaMiembros;
    Collection<Empleado> listaEmpleados;
    Collection<Libro> listaLibros;
    Collection<Prestamo> listaPrestamos;
    Collection<Dvd> listaDvds;
    Collection<Revista> listaRevistas;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        listaMiembros = new LinkedList<>();
        listaEmpleados = new LinkedList<>();
        listaLibros = new LinkedList<>();
        listaPrestamos = new LinkedList<>();
        listaDvds = new LinkedList<>();
        listaRevistas = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Miembro> getListaMiembros() {
        return listaMiembros;
    }

    public void setListaMiembros() {
        this.listaMiembros = new LinkedList<>();
    }

    public Collection<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados() {
        this.listaEmpleados = new LinkedList<>();
    }

    public Collection<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros() {
        this.listaLibros = new LinkedList<>();
    }

    public Collection<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos() {
        this.listaPrestamos = new LinkedList<>();
    }

    public void setListaEmpleados(Collection<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public void setListaLibros(Collection<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public void setListaPrestamos(Collection<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public void setListaMiembros(Collection<Miembro> listaMiembros) {
        this.listaMiembros = listaMiembros;
    }

    public Collection<Dvd> getListaDvds() { return listaDvds; }

    public void setListaDvds(Collection<Dvd> listaDvds) { this.listaDvds = listaDvds; }

    public void setListaRevistas(Collection<Revista> listaRevistas) { this.listaRevistas = listaRevistas; }

    public Collection<Revista> getListaRevistas() { return listaRevistas; }

    /**
     * Verifica si un miembro ya existe  en la coleccion.
     *
     * @return un objeto miembro.
     */


    private Miembro verificarMiembro(String nombre, int idMiembro) {
        Miembro miembroExistente = null;

        for (Miembro miembro : listaMiembros) {
            if (miembro.getNombre().equals(nombre) && miembro.getIdMiembro() == idMiembro) {
                miembroExistente = miembro;
                break;
            }
        }

        return miembroExistente;
    }

    /**
     * Verifica si un libro ya existe  en la coleccion.
     *
     * @return un objeto libro.
     */

    private Libro verificarLibro(String titulo) {
        Libro libroExistente = null;

        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equals(titulo)) {
                libroExistente = libro;
                break;
            }
        }

        return libroExistente;
    }

    @Override
    public boolean crearLibro(String titulo, String autor, EstadoItem estado) {
        Libro newLibro = new Libro();
        Libro libroExistente = verificarLibro(titulo);

        if (libroExistente == null) {
            newLibro.setTitulo(titulo);
            newLibro.setAutor(autor);
            newLibro.setEstado(estado);
            listaLibros.add(newLibro);

            return true;
        }

        return false;

    }

    @Override
    public boolean eliminarLibro(String titulo) {
        Libro libro = verificarLibro(titulo);
        if (libro != null) {
            listaLibros.remove(libro);
            return true;
        }
        return false;
    }

    @Override
    public boolean modificarLibro(String titulo, String autor, EstadoItem estado) {
        return false;
    }

    @Override
    public Libro getLibro(String nombre) {
        return null;
    }

    @Override
    public boolean crearMiembro(String nombre, String apellido, int idMiembro) {
        Miembro newMimbro = new Miembro();
        Miembro miembroExistente = verificarMiembro(nombre, idMiembro);

        if (miembroExistente == null) {
            newMimbro.setNombre(nombre);
            newMimbro.setApellido(apellido);
            newMimbro.setIdMiembro(idMiembro);
            listaMiembros.add(newMimbro);

            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarMiembro(int idMiembro) {
        Miembro miembro = verificarMiembro(nombre, idMiembro);
        if (miembro != null) {
            listaMiembros.remove(miembro);
            return true;
        }
        return false;
    }

    @Override
    public boolean modificarMiembro(String nombre, String apellido, int idMiembro) {
        return false;
    }

    @Override
    public Miembro getMiembro(String nombre) {
        return null;
    }

    /**
     * Metodo para buscar un miembro por su ID.
     *
     * @param {int} idMiembro - El ID del miembro que se desea buscar.
     * @return {Miembro} El miembro encontrado o null si no se encuentra.
     */
    private Miembro buscarMiembroPorId(int idMiembro) {
        for (Miembro miembro : listaMiembros) {
            if (miembro.getIdMiembro() == idMiembro) {
                return miembro;
            }
        }
        return null;
    }

    /**
     * Metodo para buscar un libro por su título.
     *
     * @param {String} tituloLibro - El título del libro que se desea buscar.
     * @return {Libro} El libro encontrado o null si no se encuentra.
     */
    private Libro buscarLibroPorTitulo(String tituloLibro) {
        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equalsIgnoreCase(tituloLibro)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Metodo para verificar la disponibilidad de un libro.
     *
     * @param {Libro} libro.
     * @return {Boolean} Confirmacion booleana del estado del libro..
     */

    public boolean verificarDisponibilidadLibro(Libro libro) {
        return libro.getEstado() == EstadoItem.DISPONIBLE;

    }

    /**
     * Metodo para crear un préstamo.
     *
     * @param {String} tituloLibro - El título del libro que se desea prestar.
     * @param {int} idMiembro - El ID del miembro que solicita el préstamo.
     * @return {Boolean} Confirmación booleana de si el préstamo fue exitoso.
     */


    @Override
    public boolean crearPrestamo(String tituloLibro, int idMiembro) {
        Libro libro = buscarLibroPorTitulo(tituloLibro);
        Miembro miembro = buscarMiembroPorId(idMiembro);

        if (libro != null && miembro != null && verificarDisponibilidadLibro(libro)) {
            Prestamo nuevoPrestamo = new Prestamo(LocalDate.now(), null, libro, miembro);
            libro.setEstado(EstadoItem.PRESTADO);
            miembro.getPrestamosActivos().add(nuevoPrestamo);
            listaPrestamos.add(nuevoPrestamo);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarPrestamo(String tituloLibro, int idMiembro) {
        return false;
    }

    @Override
    public Prestamo getPrestamo() {
        return null;
    }



}
