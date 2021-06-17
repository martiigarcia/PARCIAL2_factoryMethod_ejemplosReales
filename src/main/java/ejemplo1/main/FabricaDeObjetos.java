package ejemplo1.main;

import ejemplo1.modelo.Creador;
import ejemplo1.modelo.CreadorConcreto;

public class FabricaDeObjetos {
    public static void main(String[] args) {

        Creador creador = new CreadorConcreto();
        creador.anOperation("circulo");
        creador.anOperation("triangulo");
        creador.anOperation("cuadrado");

    }
}
