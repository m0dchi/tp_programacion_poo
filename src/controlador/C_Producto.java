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

    public void guardar(String nombre, double precio, int idCategoria) throws Exception {
        if (nombre == null || nombre.isEmpty()) {
            throw new Exception("El nombre no puede estar vacío");
        }
        if (precio <= 0) {
            throw new Exception("El precio debe ser mayor que cero");
        }
        if (idCategoria <= 0) {
            throw new Exception("El ID de la categoría debe ser válido");
        }

        Producto producto = new Producto(0, nombre, idCategoria, precio); // Crear instancia del objeto Producto con ID 0 o automático
        productoDAO.crear(producto);
    }

    public boolean productoExiste(String nombreProducto) {
        List<Producto> productos = productoDAO.leerTodas();
        return productos.stream().anyMatch(producto -> producto.getNombre().equals(nombreProducto));
    }

    public void actualizar(String nombre, double precio, int idCategoria, int idProducto) throws Exception {
        if (nombre == null || nombre.isEmpty()) {
            throw new Exception("El nombre no puede estar vacío");
        }
        if (precio <= 0) {
            throw new Exception("El precio debe ser mayor que cero");
        }
        if (idCategoria <= 0) {
            throw new Exception("El ID de la categoría debe ser válido");
        }
        if (productoDAO.leer(idProducto) == null) {
            throw new Exception("El producto no existe");
        }

        Producto producto = new Producto(idProducto, nombre, idCategoria, precio);
        productoDAO.actualizar(producto);
    }

    public void eliminar(int idProducto) throws Exception {
        if (productoDAO.leer(idProducto) == null) {
            throw new Exception("El producto no existe");
        }

        productoDAO.eliminar(idProducto);
    }

    public List<Producto> leerTodas() {
        return productoDAO.leerTodas();
    }

    public Producto leer(int idProducto) {
        return productoDAO.leer(idProducto);
    }
}
