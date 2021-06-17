package ejemplo2.modelo;

public abstract class Creador {

    public abstract Repositorio factoryMethod(String mensaje, String opcionRepositorio);

    public void anOperation(String mensaje, String opcionRepositorio){
        factoryMethod(mensaje, opcionRepositorio).anOperation();
    }

}
