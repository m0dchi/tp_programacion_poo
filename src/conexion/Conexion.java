package conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost/db_gestion_ventas_cibercafe?useSSL=false&allowPublicKeyRetrieval=true";
    private static final String USUARIO = "";
    private static final String CONTRASEÑA = "";

    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexión local: " + e);
        }
        return null;
    }
}
