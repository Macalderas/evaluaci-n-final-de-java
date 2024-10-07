package view;
import javax.swing.*;
import java.awt.*;


    public class NuevaTareaView extends JPanel {

        private JTextField txtTitulo;
        private JTextField txtDescripcion;
        private JTextField txtFechaLimite;
        private JButton btnAgregarTarea;

        public NuevaTareaView() {
            setLayout(new GridLayout(4, 2, 10, 10));

            JLabel lblTitulo = new JLabel("Título:");
            txtTitulo = new JTextField();

            JLabel lblDescripcion = new JLabel("Descripción:");
            txtDescripcion = new JTextField();

            JLabel lblFechaLimite = new JLabel("Fecha Límite:");
            txtFechaLimite = new JTextField();

            btnAgregarTarea = new JButton("Agregar Tarea");

            add(lblTitulo);
            add(txtTitulo);
            add(lblDescripcion);
            add(txtDescripcion);
            add(lblFechaLimite);
            add(txtFechaLimite);
            add(new JLabel());
            add(btnAgregarTarea);
        }

        public String getTitulo() {
            return txtTitulo.getText();
        }

        public String getDescripcion() {
            return txtDescripcion.getText();
        }

        public String getFechaLimite() {
            return txtFechaLimite.getText();
        }

        public JButton getBtnAgregarTarea() {
            return btnAgregarTarea;
        }
    }

