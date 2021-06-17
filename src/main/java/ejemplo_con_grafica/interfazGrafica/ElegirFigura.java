package ejemplo_con_grafica.interfazGrafica;

import ejemplo_con_grafica.modelo.CreadorConcreto;

import java.io.IOException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class ElegirFigura extends JFrame {

    private JPanel contentPane;
    private JLabel lblNewLabel;
    private final JButton continuar = new JButton("Continuar");
    private JLabel lblNewLabel_1;


    public ElegirFigura(Icon icon) {

        if (icon == null) {
            lblNewLabel = new JLabel();
        } else
            lblNewLabel = new JLabel(icon);


        lblNewLabel.setBounds(243, 38, 352, 253);
        lblNewLabel.setLabelFor(lblNewLabel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 638, 382);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("CIRCULO");
        comboBox.addItem("TRIANGULO");
        comboBox.addItem("CUADRADO");
        comboBox.setBounds(30, 90, 173, 21);
        contentPane.add(comboBox);


        continuar.setBounds(30, 134, 173, 21);
        continuar.addActionListener(e -> {
            dispose();
            setVisible(false);
            try {
                setIconoLabel(comboBox.getSelectedIndex());
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

        });
        contentPane.setLayout(null);
        contentPane.add(continuar);
        contentPane.add(lblNewLabel);

        lblNewLabel_1 = new JLabel("Ingrese la figura que desea crear: ");
        lblNewLabel_1.setBounds(30, 41, 203, 13);
        contentPane.add(lblNewLabel_1);


    }

    private void setIconoLabel(int i) throws IOException {
        try {

            ElegirFigura elegirFigura = new ElegirFigura(
                    new CreadorConcreto().factoryMethod(i).pintar());
            elegirFigura.setVisible(true);

        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}
