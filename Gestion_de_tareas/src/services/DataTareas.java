package services;
import model.Tarea;
import java.time.LocalDate;
import java.util.ArrayList;

public class DataTareas {
    private ArrayList<Tarea> listaTareas;

    public DataTareas() {
        listaTareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        listaTareas.add(tarea);
    }

    public void mostrarTareas() {
        for (Tarea tarea : listaTareas) {
            System.out.println(tarea);
            System.out.println("------");
        }
    }

    public void agregarTareasDeEjemplo() {
        agregarTarea(new Tarea("Estudiar para el examen", "Estudiar matemáticas y física", "2024-10-15"));
        agregarTarea(new Tarea("Hacer ejercicio", "Ir al gimnasio a las 6:00 PM", "2024-10-10"));
        agregarTarea(new Tarea("Terminar el proyecto", "Completar la implementación del código", "2024-10-12"));
        agregarTarea(new Tarea("Comprar víveres", "Comprar frutas y verduras", "2024-10-08"));
        agregarTarea(new Tarea("Leer un libro", "Leer el capítulo 3 del libro de historia", "2024-10-14"));
    }

}