package ActividadMVC;

import java.util.ArrayList;
import java.util.List;

public class Controlador {
    private List<Modelo> tareas;
    private Vista vista;

    public Controlador(Vista vista) {
        this.vista = vista;
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(String nombre) {
        Modelo tarea = new Modelo(nombre);
        tareas.add(tarea);
        vista.printMessage("Tarea agregada correctamente.");
    }

    public void completarTarea(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            tareas.get(indice).complete();
            vista.printMessage("Tarea completada.");
        } else {
            vista.printMessage("Índice de tarea no válido.");
        }
    }
    public void mostrarTareas()
    {
        System.out.println("\nESTADO FINAL");
        vista.printTasks(tareas);
    }
}
