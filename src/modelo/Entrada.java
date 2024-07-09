package modelo;

public class Entrada {
    private String tipo;
    private double precio;
    private boolean disponibilidad;

    public Entrada(String tipo, double precio, boolean disponibilidad) {
        this.tipo = tipo;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
    }

    // Getters y Setters
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public boolean isDisponibilidad() { return disponibilidad; }
    public void setDisponibilidad(boolean disponibilidad) { this.disponibilidad = disponibilidad; }
}

