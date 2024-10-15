package conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conexion {

    public static Connection conectar() {

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/gestion_ventas_cibercafe?useSSL=false", "root", "q00215803");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexión local: " + e);
        }
        return null;
    }
}
