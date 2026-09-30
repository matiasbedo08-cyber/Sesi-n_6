package ActividadMVC;

import java.util.List;

public class Vista {
    public void printTasks(List<Modelo> tasks) {
        System.out.println("LISTA DE TAREAS");

        for (Modelo task : tasks) {
            String estado = task.isCompleted()
                    ? "Completada"
                    : "Pendiente";

            System.out.println("- " + task.getName()
                    + " [" + estado + "]");
        }
    }
    public void printMessage(String message) {
        System.out.println(message);
    }
}