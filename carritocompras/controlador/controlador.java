package controlador;

import modelo.*;
import vista.vista;

public class controlador {

    private tienda tienda;
    private carrito carrito;
    private vista vista;

    public controlador() {
        tienda = new tienda();
        carrito = new carrito();
        vista = new vista();

        cargarproductos();
    }

    private void cargarproductos() {

        tienda.agregarproducto(
            new producto(1, "laptop", 2500)
        );

        tienda.agregarproducto(
            new producto(2, "mouse", 50)
        );

        tienda.agregarproducto(
            new producto(3, "teclado", 100)
        );
    }

    public void iniciar() {

        int opcion;

        do {

            opcion = vista.menu();

            switch (opcion) {

                case 1:
                    agregarproducto();
                    break;

                case 2:
                    vista.mostrarproductos(tienda);
                    break;

                case 3:
                    agregaralcarrito();
                    break;

                case 4:
                    carrito.mostrarcarrito();
                    break;

                case 5:
                    eliminarcarrito();
                    break;

                case 6:
                    comprar();
                    break;

                case 7:
                    vista.mostrarhistorial(tienda);
                    break;

                case 8:
                    vista.mensaje("programa finalizado");
                    break;

                default:
                    vista.mensaje("opcion no valida");
            }

        } while (opcion != 8);
    }

    private void agregarproducto() {

        producto producto = vista.pedirproducto();

        tienda.agregarproducto(producto);

        vista.mensaje("producto agregado correctamente");
    }

    private void agregaralcarrito() {

        int id = vista.pedirid();

        producto producto = tienda.buscarproducto(id);

        if (producto != null) {

            carrito.agregarproducto(producto);

            vista.mensaje("producto agregado al carrito");

        } else {

            vista.mensaje("producto no encontrado");
        }
    }

    private void eliminarcarrito() {

        int id = vista.pedirid();

        carrito.eliminarproducto(id);
    }

    private void comprar() {

        if (carrito.estavacio()) {

            vista.mensaje("el carrito esta vacio");
            return;
        }

        double subtotal = carrito.calcularsubtotal();

        double descuento = vista.pedirporcentajedescuento();

        double montodescuento = subtotal * descuento / 100;

        double subtotaldescuento = subtotal - montodescuento;

        double envio;

        if (subtotaldescuento >= 200) {
            envio = 0;
        } else {
            envio = 15;
        }

        double total = subtotaldescuento + envio;

        System.out.println("\n--- resumen de compra ---");
        System.out.println("subtotal: s/ " + subtotal);
        System.out.println("descuento: s/ " + montodescuento);
        System.out.println("envio: s/ " + envio);
        System.out.println("total: s/ " + total);

        compra compra = new compra(total);

        tienda.agregarcompra(compra);

        carrito.vaciar();

        vista.mensaje("compra realizada correctamente");
    }
}
