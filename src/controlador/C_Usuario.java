package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import conexion.Conexion;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class C_Usuario {

    public boolean loginUser(Usuario objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        String sql = "SELECT usuario, password FROM t_usuario WHERE usuario = ? AND password = ?";
        
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, objeto.getUsuario());
            pst.setString(2, objeto.getPassword());
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                respuesta = true;
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o clave incorrectos");
            }
            
        } catch (SQLException e) {
            System.out.println("Error al iniciar sesión: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión");
        } finally {
            try {
                cn.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        
        return respuesta;
    }
}
