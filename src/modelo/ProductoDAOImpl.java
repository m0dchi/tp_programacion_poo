package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAOImpl implements DAOinterfaz<Producto> {

    private Connection connection;

    public ProductoDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void crear(Producto producto) {
        try {
            PreparedStatement pst = connection.prepareStatement("INSERT INTO t_producto VALUES (?, ?, ?, ?)");
            pst.setInt(1, producto.getId());
            pst.setString(2, producto.getNombre());
            pst.setDouble(3, producto.getPrecio());
            pst.setInt(4, producto.getIdCategoria());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Producto leer(int id) {
        Producto producto = null;
        try {
            PreparedStatement pst = connection.prepareStatement("SELECT * FROM t_producto WHERE idProducto = ?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                producto = new Producto(
                        rs.getInt("idProducto"),
                        rs.getString("nombre"),
                        rs.getInt("idCategoria"),
                        rs.getDouble("precio")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return producto;
    }

    @Override
    public void actualizar(Producto producto) {
        try {
            PreparedStatement pst = connection.prepareStatement(
                    "UPDATE t_producto SET nombre = ?, precio = ?, idCategoria = ? WHERE idProducto = ?");
            pst.setString(1, producto.getNombre());
            pst.setDouble(2, producto.getPrecio());
            pst.setInt(3, producto.getIdCategoria());
            pst.setInt(4, producto.getId());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminar(int id) {
        try {
            PreparedStatement pst = connection.prepareStatement("DELETE FROM t_producto WHERE idProducto = ?");
            pst.setInt(1, id);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Producto> leerTodas() {
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT idProducto, nombre, idCategoria, precio FROM t_producto";
        try {
            System.out.println("Ejecutando consulta: " + sql);
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Producto producto = new Producto(
                        rs.getInt("idProducto"),
                        rs.getString("nombre"),
                        rs.getInt("idCategoria"),
                        rs.getDouble("precio")
                );
                System.out.println("Producto encontrado: " + producto.getNombre());
                productos.add(producto);
            }
        } catch (SQLException e) {
            System.out.println("Error en leerTodas: " + e.getMessage());
            e.printStackTrace();
        }
        return productos;
    }

    public Producto leerPorNombre(String nombre) {
        Producto producto = null;
        String sql = "SELECT idProducto, nombre, idCategoria, precio FROM t_producto WHERE nombre = ?";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, nombre);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                producto = new Producto(
                        rs.getInt("idProducto"),
                        rs.getString("nombre"),
                        rs.getInt("idCategoria"),
                        rs.getDouble("precio")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return producto;
    }

}
