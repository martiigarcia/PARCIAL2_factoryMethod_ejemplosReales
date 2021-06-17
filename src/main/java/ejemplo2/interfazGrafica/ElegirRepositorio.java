package ejemplo2.interfazGrafica;

import ejemplo2.modelo.Creador;
import ejemplo2.modelo.CreadorConcreto;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ElegirRepositorio extends JFrame {

    private JPanel contentPane;
    private final JButton continuar = new JButton("Registrar mensaje");
    private JTextField mensaje;
    private JComboBox<String> comboBox;

    public ElegirRepositorio() {

        establecerPropiedades();
        propiedadesComboBox();

        continuar.setBounds(355, 252, 203, 21);
        continuar.addActionListener(e ->
                bottonContinuarOnClick(mensaje.getText(), (String) comboBox.getSelectedItem())
        );

        contentPane.setLayout(null);
        contentPane.add(continuar);


        mensaje = new JTextField();
        mensaje.setBounds(30, 85, 328, 19);
        contentPane.add(mensaje);
        mensaje.setColumns(10);


    }

    private void bottonContinuarOnClick(String mensaje, String repositorio) {
        try {
            Creador creador = new CreadorConcreto();
            creador.anOperation(mensaje, repositorio);
            JOptionPane.showMessageDialog(null, "Se registro el mensaje exitosamente.");
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void establecerPropiedades() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 638, 382);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);


        JLabel lblNewLabel_1 = new JLabel("Seleccione donde quiera guardar el mensaje:");
        lblNewLabel_1.setBounds(30, 196, 272, 13);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel = new JLabel("Ingrese un mensaje para guardar:");
        lblNewLabel.setBounds(30, 42, 328, 13);
        contentPane.add(lblNewLabel);
    }

    private void propiedadesComboBox() {
        comboBox = new JComboBox<>();
        comboBox.addItem("Base de datos");
        comboBox.addItem("Archivo");
        comboBox.addItem("Memoria");
        comboBox.setBounds(30, 252, 221, 21);
        contentPane.add(comboBox);
    }

}
