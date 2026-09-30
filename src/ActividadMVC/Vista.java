package ActividadMVC;
import java.util.List;

public class Vista 
{
    // Método para recorrer la lista de tareas y mostrar su nombre y estado
    public void printTasks(List<Task> tasks) {
        System.out.println("--- LISTA DE TAREAS ---");
        for (Task task : tasks) {
            // Evaluamos el estado para mostrar "Completada" o "Pendiente"
            String estado = task.isCompleted() ? "Completada" : "Pendiente";
            System.out.println("- " + task.getName() + " [" + estado + "]");
        }
    }

    // Método para imprimir mensajes generales en la consola
    public void printMessage(String message) {
        System.out.println(message);
    }
}
