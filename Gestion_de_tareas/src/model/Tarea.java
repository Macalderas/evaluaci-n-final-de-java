package model;

public class Tarea {

    public static Object Estado;
    private String titulo;
    private String descripcion;
    private String fechaLimite;
    private String estado;

    public Tarea(String titulo, String descripcion, String fechaLimite) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        this.estado = "pendiente"; // Estado por defecto
    }

    public Tarea(String estudiarParaElExamen, String estudiarMatemáticasYFísica) {
    }

    public void actualizarEstado(String nuevoEstado) {
        if (nuevoEstado.equals("pendiente") || nuevoEstado.equals("en progreso") || nuevoEstado.equals("completado")) {
            this.estado = nuevoEstado;
        } else {
            throw new IllegalArgumentException("El estado debe ser 'pendiente', 'en progreso' o 'completado'.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Tarea: " + titulo + "\nDescripción: " + descripcion + "\nFecha Límite: " + fechaLimite + "\nEstado: " + estado;
    }
}