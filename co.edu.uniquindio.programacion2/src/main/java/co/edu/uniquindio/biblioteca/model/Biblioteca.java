package co.edu.uniquindio.biblioteca.model;

import java.util.Collection;
import java.util.LinkedList;

public class Biblioteca {

    String nombre;
    Collection<Miembro> listaMiembros;
    Collection<Empleado> listaEmpleados;
    Collection<Libro> listaLibros;
    Collection<Prestamo> listaPrestamos;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        listaMiembros = new LinkedList<>();
        listaEmpleados = new LinkedList<>();
        listaLibros = new LinkedList<>();
        listaPrestamos = new LinkedList<>();
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
}
