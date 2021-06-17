package ejemplo_con_grafica.main;

import ejemplo_con_grafica.interfazGrafica.ElegirFigura;

import java.awt.*;

public class Fabrica {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                ElegirFigura frame = new ElegirFigura(null);
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }
}
