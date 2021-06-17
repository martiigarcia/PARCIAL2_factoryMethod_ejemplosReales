package ejemplo1.modelo;

public class CirculoConcreto implements Figura {

    //private final String nombre = "CIRCULO";

    public CirculoConcreto() {

    }

    @Override
    public void anOperation() {
        System.out.println("pinto un circulo...");
    }

}
