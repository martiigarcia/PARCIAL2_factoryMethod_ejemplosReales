package ejemplo_con_grafica.modelo;

import javax.swing.*;

public class Cuadrado implements Figura {

    private final Icon icono;

    public Cuadrado(String ruta) {
        this.icono = new ImageIcon(ruta);
    }

    @Override
    public Icon pintar() {
        return icono;
    }
}
