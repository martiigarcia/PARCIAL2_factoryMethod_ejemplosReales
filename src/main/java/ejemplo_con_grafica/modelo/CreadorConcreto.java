package ejemplo_con_grafica.modelo;

public class CreadorConcreto extends Creador{

    @Override
    public Figura factoryMethod(int numeroIdentificador) {
        return switch (numeroIdentificador) {
            case 0 -> new Circulo("circulo.png");
            case 1 -> new Triangulo("triangulo.png");
            case 2 -> new Cuadrado("cuadrado.jpg");
            default -> throw new RuntimeException("El numero identificador de la figura no existe.");
        };
    }

}
