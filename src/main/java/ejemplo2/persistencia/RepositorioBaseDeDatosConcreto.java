package ejemplo2.persistencia;

import ejemplo2.modelo.Repositorio;
import ejemplo2.persistencia.jdbc.JBDCConexion;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RepositorioBaseDeDatosConcreto implements Repositorio {

    private String mensaje;

    public RepositorioBaseDeDatosConcreto(String mensaje) {
        if (validarMensaje(mensaje))
            throw new RuntimeException("El mensaje no puede ser nulo ni vacio");
        this.mensaje = mensaje;
    }

    @Override
    public void anOperation() {
        JBDCConexion conexion = new JBDCConexion();

        try {

            PreparedStatement consulta =
                    conexion.conexion().prepareStatement(
                            "INSERT INTO ejemplo2 " +
                                    "(mensaje) " +
                                    "VALUES (?)");

            consulta.setString(1, this.mensaje);


            consulta.executeUpdate();
            consulta.close();
            conexion.conexion().close();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("No se pudo registrar el mensaje en la base de datos.", e);
        }
    }

    private boolean validarMensaje(String mensaje) {
        return (mensaje == null || mensaje.isEmpty());
    }

}
