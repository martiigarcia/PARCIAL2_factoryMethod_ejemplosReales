package ejemplo1.modelo;


public class CreadorConcreto extends Creador {

    public Figura factoryMethod(String figura) {
        if (figura.equalsIgnoreCase("circulo"))
            return new CirculoConcreto();
        if (figura.equalsIgnoreCase("cuadrado"))
            return new CuadradoConcreto();
        if(figura.equalsIgnoreCase("triangulo"))
            return new TrianguloConcreto();
        return null;
    }

}
