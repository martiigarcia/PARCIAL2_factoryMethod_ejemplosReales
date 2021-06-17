package ejemplo2.main;

import ejemplo2.interfazGrafica.ElegirRepositorio;

public class FabricaDeObjetos {
    public static void main(String[] args) {

        ElegirRepositorio elegirRepositorio = new ElegirRepositorio();
        elegirRepositorio.setVisible(true);

    }
}
