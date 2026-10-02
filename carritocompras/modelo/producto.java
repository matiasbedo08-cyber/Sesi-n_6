package modelo;
public class producto {
    private int id;
    private String nombre;
    private double precio;

    public producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getid() {
        return id;
    }

    public String getnombre() {
        return nombre;
    }

    public double getprecio() {
        return precio;
    }

    @Override
    public String tostring() {
        return id + " - " + nombre + " - s/ " + precio;
    }
}
