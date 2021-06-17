package ejemplo_con_grafica.modelo;

import javax.swing.*;

public class Circulo implements Figura{

    private final Icon icono;

    public Circulo(String ruta) {
        this.icono = new ImageIcon(ruta);
    }
    @Override
    public Icon pintar() {
        return icono;
    }
}
