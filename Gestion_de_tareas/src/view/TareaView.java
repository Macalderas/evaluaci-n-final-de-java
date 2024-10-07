package view;

import javax.swing.*;
import java.awt.*;

public class TareaView  extends JPanel {
    public TareaView(String titulo, String descripcion, String fechaLimite, String estado) {
        setLayout(new GridLayout(1, 4, 10, 10));
        JLabel lblTitulo = new JLabel(titulo);
        JLabel lblDescripcion = new JLabel(descripcion);
        JLabel lblFechaLimite = new JLabel(fechaLimite);
        JLabel lblEstado = new JLabel(estado);

        add(lblTitulo);
        add(lblDescripcion);
        add(lblFechaLimite);
        add(lblEstado);
    }
}
