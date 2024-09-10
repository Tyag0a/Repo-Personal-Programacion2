package co.edu.uniquindio.preparcial1.finca.model;

import java.util.ArrayList;
import java.util.Collection;

public class FincaUQ {
    String nombre;
    Collection<Tarea> listaTareas;
    Collection<Empleado> listaEmpleados;


    public FincaUQ(String nombre) {
        this.nombre = nombre;
        listaTareas = new ArrayList<>();
        listaEmpleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Tarea> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(Collection<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }

    public void setListaEmpleados(Collection<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public Collection<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }
}
