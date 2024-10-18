package controlador;

import modelo.Categoria;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class C_Categoria {

    public boolean guardar(Categoria objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();

        try {
            PreparedStatement pst = cn.prepareStatement("insert into t_categoria values(?,?,?,?)");
            pst.setInt(1, 0);
            pst.setString(2, objeto.getNombre());
            pst.setString(3, objeto.getDescripcion());
            pst.setInt(4, objeto.getEstado());

            if (pst.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar categoria: " + e);
        }
        return respuesta;
    }

    public boolean categoriaExiste(String categoria) {
        boolean respuesta = false;
        String sql = "select nombre from t_categoria where nombre = '" + categoria +"';";
        Statement st;
        Connection cn = conexion.Conexion.conectar();

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar categoria: " + e);
        }
        return respuesta;
    }
    
    public boolean actualizar(Categoria objeto, int idCategoria) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();

        try {
            PreparedStatement pst = cn.prepareStatement("Update t_categoria set nombre=?, descripcion=? where idCategoria='"+idCategoria+"'");
            pst.setString(1, objeto.getNombre());
            pst.setString(2,objeto.getDescripcion());
            

            if (pst.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al actualizar categoria: " + e);
        }
        return respuesta;
    }
    
    public boolean eliminar( int idCategoria) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();

        try {
            PreparedStatement pst = cn.prepareStatement("delete from t_categoria where idCategoria='"+idCategoria+"'");
            pst.executeUpdate();
            

            if (pst.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al eliminar categoria: " + e);
        }
        return respuesta;
    }
}
