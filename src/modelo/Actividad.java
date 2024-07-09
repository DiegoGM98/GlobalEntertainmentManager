package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Actividad {
    private String nombre;
    private Date fecha;
    private String lugar;
    private String detalles;
    private List<Organizador> organizadores;
    private List<Entrada> entradas;
    private List<Cliente> clientes;

    public Actividad(String nombre, Date fecha, String lugar, String detalles) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.detalles = detalles;
        this.organizadores = new ArrayList<>();
        this.entradas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }
    public String getLugar() { return lugar; }
    public void setLugar(String lugar) { this.lugar = lugar; }
    public String getDetalles() { return detalles; }
    public void setDetalles(String detalles) { this.detalles = detalles; }
    public List<Organizador> getOrganizadores() { return organizadores; }
    public List<Entrada> getEntradas() { return entradas; }
    public List<Cliente> getClientes() { return clientes; }

    public void addOrganizador(Organizador organizador) {
        organizadores.add(organizador);
    }

    public void addEntrada(Entrada entrada) {
        entradas.add(entrada);
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }
}

