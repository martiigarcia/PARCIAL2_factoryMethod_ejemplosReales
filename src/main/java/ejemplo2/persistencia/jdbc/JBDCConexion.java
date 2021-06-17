package ejemplo2.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JBDCConexion {

    public Connection conexion() throws SQLException {
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/parcial2_factory_method", "root", "");
    }



}
