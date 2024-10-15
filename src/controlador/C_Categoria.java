package controlador;

import modelo.Categoria;
import java.sql.Connection;
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
}
