package controlador;

import modelo.Producto;
import modelo.ProductoDAOImpl;
import java.sql.Connection;
import java.util.List;

public class C_Producto {
    private ProductoDAOImpl productoDAO;

    public C_Producto() {
        Connection connection = conexion.Conexion.conectar();
        productoDAO = new ProductoDAOImpl(connection);
    }

    public boolean guardar(Producto producto) {
        try {
            productoDAO.crear(producto);
            return true;
        } catch (Exception e) {
            System.out.println("Error al guardar producto: " + e);
            return false;
        }
    }

    public boolean productoExiste(String nombreProducto) {
        List<Producto> productos = productoDAO.leerTodas();
        return productos.stream().anyMatch(producto -> producto.getNombre().equals(nombreProducto));
    }

    public boolean actualizar(Producto producto, int idProducto) {
        try {
            producto.setId(idProducto);
            productoDAO.actualizar(producto);
            return true;
        } catch (Exception e) {
            System.out.println("Error al actualizar producto: " + e);
            return false;
        }
    }

    public boolean eliminar(int idProducto) {
        try {
            productoDAO.eliminar(idProducto);
            return true;
        } catch (Exception e) {
            System.out.println("Error al eliminar producto: " + e);
            return false;
        }
    }

    public List<Producto> leerTodas() {
        return productoDAO.leerTodas();
    }

    public Producto leer(int idProducto) {
        return productoDAO.leer(idProducto);
    }
}
