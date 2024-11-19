package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import conexion.Conexion;

public class C_Usuario {

    public void loginUser(String usuario, String password) throws Exception {
        if (usuario == null || usuario.isEmpty()) {
            throw new Exception("El usuario no puede estar vacío");
        }
        if (password == null || password.isEmpty()) {
            throw new Exception("La contraseña no puede estar vacía");
        }

        Connection cn = null;
        try {
            cn = Conexion.conectar();
            if (cn == null) {
                throw new Exception("Error al conectar con la base de datos");
            }

            String sql = "SELECT usuario, password FROM t_usuario WHERE usuario = ? AND password = ?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, usuario);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();

            if (!rs.next()) {
                throw new Exception("Usuario o contraseña incorrectos");
            }

        } catch (SQLException e) {
            throw new Exception("Error al iniciar sesión: " + e.getMessage());
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    throw new Exception("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
    }
}
