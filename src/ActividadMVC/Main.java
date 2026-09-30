package ActividadMVC;

public class Main {
    public static void main(String[] args) {
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista);

        controlador.agregarTarea("Estudiar Java");
        controlador.agregarTarea("Realizar ejercicios");
        controlador.agregarTarea("Repasar MVC");

        controlador.mostrarTareas();

        controlador.completarTarea(0);
        controlador.completarTarea(2);

        System.out.println("\n--- ESTADO FINAL ---");
        controlador.mostrarTareas();
    }
}
