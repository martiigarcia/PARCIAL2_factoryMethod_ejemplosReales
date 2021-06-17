package ejemplo1.modelo;

public abstract class Creador {

    public abstract Figura factoryMethod(String figura);

    public void anOperation(String figura){
        factoryMethod(figura).anOperation();
    }

}
