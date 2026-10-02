package modelo;

import java.util.ArrayList;

public class carrito {

    private ArrayList<producto> productos;

    public carrito() {
        productos = new ArrayList<>();
    }

    public void agregarproducto(producto producto) {
        productos.add(producto);
    }

    public void eliminarproducto(int id) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getid() == id) {
                productos.remove(i);
                System.out.println("producto eliminado");
                return;
            }
        }

        System.out.println("producto no encontrado en el carrito");
    }

    public void mostrarcarrito() {
        if (productos.isEmpty()) {
            System.out.println("el carrito esta vacio");
            return;
        }

        System.out.println("\n--- carrito ---");

        for (producto producto : productos) {
            System.out.println(producto);
        }

        System.out.println("subtotal: s/ " + calcularsubtotal());
    }

    public double calcularsubtotal() {
        double subtotal = 0;

        for (producto producto : productos) {
            subtotal += producto.getprecio();
        }

        return subtotal;
    }

    public void vaciar() {
        productos.clear();
    }

    public boolean estavacio() {
        return productos.isEmpty();
    }
}
