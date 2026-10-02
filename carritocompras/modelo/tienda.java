package modelo;

import java.util.ArrayList;

public class tienda {

    private ArrayList<producto> productos;
    private ArrayList<compra> historial;

    public tienda() {
        productos = new ArrayList<>();
        historial = new ArrayList<>();
    }

    public void agregarproducto(producto producto) {
        productos.add(producto);
    }

    public ArrayList<producto> getproductos() {
        return productos;
    }

    public void agregarcompra(compra compra) {
        historial.add(compra);
    }

    public ArrayList<compra> gethistorial() {
        return historial;
    }

    public producto buscarproducto(int id) {
        for (producto producto : productos) {
            if (producto.getid() == id) {
                return producto;
            }
        }

        return null;
    }
}
