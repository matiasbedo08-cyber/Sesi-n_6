package vista;

import java.util.Scanner;
import modelo.*;

public class vista {

    private Scanner teclado;

    public vista() {
        teclado = new Scanner(System.in);
    }

    public int menu() {

        System.out.println("\n===== carrito de compras =====");
        System.out.println("1. agregar producto");
        System.out.println("2. listar productos");
        System.out.println("3. agregar producto al carrito");
        System.out.println("4. ver carrito");
        System.out.println("5. eliminar producto del carrito");
        System.out.println("6. realizar compra");
        System.out.println("7. ver historial de compras");
        System.out.println("8. salir");
        System.out.print("opcion: ");

        return teclado.nextInt();
    }

    public producto pedirproducto() {

        System.out.print("id: ");
        int id = teclado.nextInt();

        teclado.nextLine();

        System.out.print("nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("precio: ");
        double precio = teclado.nextDouble();

        return new producto(id, nombre, precio);
    }

    public int pedirid() {

        System.out.print("ingrese el id del producto: ");
        return teclado.nextInt();
    }

    public double pedirporcentajedescuento() {

        System.out.print("ingrese descuento (%): ");
        return teclado.nextDouble();
    }

    public void mostrarproductos(tienda tienda) {

        System.out.println("\n--- productos ---");

        if (tienda.getproductos().isEmpty()) {
            System.out.println("no hay productos");
            return;
        }

        for (producto producto : tienda.getproductos()) {
            System.out.println(producto);
        }
    }

    public void mostrarhistorial(tienda tienda) {

        System.out.println("\n--- historial de compras ---");

        if (tienda.gethistorial().isEmpty()) {
            System.out.println("no hay compras realizadas");
            return;
        }

        for (compra compra : tienda.gethistorial()) {
            System.out.println(compra);
        }
    }

    public void mensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
