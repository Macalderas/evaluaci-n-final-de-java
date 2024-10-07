package view;


import javax.swing.*;
import java.awt.*;

public class TareasView  extends JFrame {
    public TareasView() {
        setTitle("Ventana Compacta Ajustada");
        setSize(300, 250);  // Tamaño ajustado
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelIzquierda = new JPanel();
        panelIzquierda.setLayout(new GridLayout(4, 1, 5, 5));
        panelIzquierda.add(new JTextField("Cuadro 1"));
        panelIzquierda.add(new JTextField("Cuadro 2"));
        panelIzquierda.add(new JTextField("Cuadro 3"));
        panelIzquierda.add(new JTextField("Cuadro 4"));

        JPanel panelDerecha = new JPanel();
        GridBagLayout gridBagLayout = new GridBagLayout();
        panelDerecha.setLayout(gridBagLayout);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JTextField cuadroDerecha = new JTextField("Cuadro derecha");
        gbc.gridx = 0; // columna 0
        gbc.gridy = 0; // fila 0
        gbc.weightx = 1.0; // Ocupar el máximo ancho posible
        panelDerecha.add(cuadroDerecha, gbc);

        JButton botonAbajo = new JButton("Botón");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(5, 0, 0, 0);
        panelDerecha.add(botonAbajo, gbc);

        JTextArea textoAbajo = new JTextArea("Texto en la parte inferior");
        textoAbajo.setRows(2);
        textoAbajo.setEditable(false);

        add(panelIzquierda, BorderLayout.WEST);
        add(panelDerecha, BorderLayout.EAST);
        add(textoAbajo, BorderLayout.SOUTH);

            setVisible(true);

    }
    }



