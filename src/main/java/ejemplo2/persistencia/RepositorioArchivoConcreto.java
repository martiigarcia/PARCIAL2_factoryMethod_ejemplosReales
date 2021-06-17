package ejemplo2.persistencia;

import ejemplo2.modelo.Repositorio;

import java.io.*;

public class RepositorioArchivoConcreto implements Repositorio {

    private String mensaje;

    public RepositorioArchivoConcreto(String mensaje) {
        if (validarMensaje(mensaje))
            throw new RuntimeException("El mensaje no puede ser nulo ni vacio");
        this.mensaje = mensaje;
    }

    @Override
    public void anOperation() {
        File file = new File("archivo.txt");

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(mensaje + "\n");
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException("No se pudo escribir en el archivo.", e);
        }
    }

    private boolean validarMensaje(String mensaje) {
        return (mensaje == null || mensaje.isEmpty());
    }

}
