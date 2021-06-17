package ejemplo2.modelo;

import ejemplo2.persistencia.RepositorioArchivoConcreto;
import ejemplo2.persistencia.RepositorioBaseDeDatosConcreto;
import ejemplo2.persistencia.RepositorioMemoriaConcreto;

public class CreadorConcreto extends Creador {

    public Repositorio factoryMethod(String mensaje, String opcionRepositorio){
        return switch (opcionRepositorio) {
            case "Base de datos" -> new RepositorioBaseDeDatosConcreto(mensaje);
            case "Archivo" -> new RepositorioArchivoConcreto(mensaje);
            case "Memoria" -> new RepositorioMemoriaConcreto(mensaje);
            default -> throw new RuntimeException("La forma de guardar datos ingresada no es valida.");
        };
    }

}
