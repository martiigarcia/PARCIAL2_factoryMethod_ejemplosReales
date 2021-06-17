package ejemplo_con_grafica.modelo;

import javax.swing.*;

public class Triangulo implements Figura {

    private final Icon icono;

    public Triangulo(String ruta) {
        this.icono = new ImageIcon(ruta);
    }

    @Override
    public Icon pintar() {
        return icono;
    }
}
