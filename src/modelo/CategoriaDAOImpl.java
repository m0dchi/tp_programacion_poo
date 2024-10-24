package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAOImpl implements DAOinterfaz<Categoria> {
    private Connection connection;

    public CategoriaDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void crear(Categoria categoria) {
        try {
            PreparedStatement pst = connection.prepareStatement("INSERT INTO t_categoria VALUES (?, ?, ?)");
            pst.setInt(1, categoria.getId());
            pst.setString(2, categoria.getNombre());
            pst.setString(3, categoria.getDescripcion());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Categoria leer(int id) {
        Categoria categoria = null;
        try {
            PreparedStatement pst = connection.prepareStatement("SELECT * FROM t_categoria WHERE idCategoria = ?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                categoria = new Categoria(
                        rs.getInt("idCategoria"),
                        rs.getString("nombre"),
                        rs.getString("descripcion")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categoria;
    }

    @Override
    public void actualizar(Categoria categoria) {
        try {
            PreparedStatement pst = connection.prepareStatement(
                    "UPDATE t_categoria SET nombre = ?, descripcion = ? WHERE idCategoria = ?");
            pst.setString(1, categoria.getNombre());
            pst.setString(2, categoria.getDescripcion());
            pst.setInt(3, categoria.getId());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminar(int id) {
        try {
            PreparedStatement pst = connection.prepareStatement("DELETE FROM t_categoria WHERE idCategoria = ?");
            pst.setInt(1, id);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Categoria> leerTodas() {
        List<Categoria> categorias = new ArrayList<>();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM t_categoria");
            while (rs.next()) {
                Categoria categoria = new Categoria(
                        rs.getInt("idCategoria"),
                        rs.getString("nombre"),
                        rs.getString("descripcion")
                );
                categorias.add(categoria);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categorias;
    }
}
