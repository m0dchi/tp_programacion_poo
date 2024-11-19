package controlador;

import modelo.DetalleVenta;
import modelo.DetalleVentaDAOImpl;
import java.sql.Connection;
import java.util.List;
import conexion.Conexion;

public class C_DetalleVenta {

    private DetalleVentaDAOImpl detalleVentaDAO;

    public C_DetalleVenta() {
        Connection connection = Conexion.conectar();
        detalleVentaDAO = new DetalleVentaDAOImpl(connection);
    }

    public void guardar(int idCabVenta, int idProducto, int cantidad, double precioUni, double pagarTotal) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("La cantidad debe ser mayor que cero");
        }
        if (precioUni <= 0) {
            throw new Exception("El precio unitario debe ser mayor que cero");
        }
        if (pagarTotal <= 0) {
            throw new Exception("El total a pagar debe ser mayor que cero");
        }
        DetalleVenta detalleVenta = new DetalleVenta(0, idCabVenta, idProducto, cantidad, precioUni, pagarTotal);
        detalleVentaDAO.crear(detalleVenta);
    }

    public void actualizar(int idDetalleVenta, int idCabVenta, int idProducto, int cantidad, double precioUni, double pagarTotal) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("La cantidad debe ser mayor que cero");
        }
        if (precioUni <= 0) {
            throw new Exception("El precio unitario debe ser mayor que cero");
        }
        if (pagarTotal <= 0) {
            throw new Exception("El total a pagar debe ser mayor que cero");
        }
        if (detalleVentaDAO.leer(idDetalleVenta) == null) {
            throw new Exception("El detalle de venta no existe");
        }

        DetalleVenta detalleVenta = new DetalleVenta(idDetalleVenta, idCabVenta, idProducto, cantidad, precioUni, pagarTotal);
        detalleVentaDAO.actualizar(detalleVenta);
    }

    public void eliminar(int idDetalleVenta) throws Exception {
        if (detalleVentaDAO.leer(idDetalleVenta) == null) {
            throw new Exception("El detalle de venta no existe");
        }

        detalleVentaDAO.eliminar(idDetalleVenta);
    }

    public List<DetalleVenta> leerTodas() {
        return detalleVentaDAO.leerTodas();
    }

    public DetalleVenta leer(int idDetalleVenta) {
        return detalleVentaDAO.leer(idDetalleVenta);
    }

    public List<DetalleVenta> obtenerTodosLosDetallesVenta() {
        return detalleVentaDAO.leerTodas();
    }

    public void actualizarTotalDetalleVenta(int idDetalleVenta, double nuevoTotal) {
        detalleVentaDAO.actualizarTotal(idDetalleVenta, nuevoTotal);
    }

    public void eliminarDetalleVenta(int idDetalleVenta) {
        detalleVentaDAO.eliminar(idDetalleVenta);
    }

    public List<DetalleVenta> obtenerTodasLasVentas() {
        return detalleVentaDAO.leerTodas();
    }

    public String obtenerFechaVenta(int idCabVenta) {
        return detalleVentaDAO.obtenerFechaVenta(idCabVenta);
    }
}
