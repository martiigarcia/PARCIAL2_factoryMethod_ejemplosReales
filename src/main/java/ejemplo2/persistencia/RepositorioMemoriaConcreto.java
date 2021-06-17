package ejemplo2.persistencia;

import ejemplo2.modelo.Repositorio;

public class RepositorioMemoriaConcreto implements Repositorio {

    private String mensaje;

    public RepositorioMemoriaConcreto(String mensaje) {
        if (validarMensaje(mensaje))
            throw new RuntimeException("El mensaje no puede ser nulo ni vacio");
        this.mensaje = mensaje;
    }

    @Override
    public void anOperation() {
        System.out.println("..." + mensaje);
    }

    private boolean validarMensaje(String mensaje) {
        return (mensaje == null || mensaje.isEmpty());
    }
}
