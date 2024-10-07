import model.Tarea;
import services.DataTareas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // tarea
        Tarea tarea = new Tarea("Estudiar para el examen", "Estudiar matemáticas y física");
        System.out.println(tarea);

        tarea.actualizarEstado("en progreso");
        System.out.println(tarea);

        // Data Taras
        DataTareas dataTareas = new DataTareas();
        dataTareas.agregarTareasDeEjemplo();
        dataTareas.mostrarTareas();
    }
}