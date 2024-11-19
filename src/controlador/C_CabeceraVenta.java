package controlador;

import modelo.CabeceraVenta;
import modelo.CabeceraVentaDAOImpl;
import java.sql.*;
import conexion.Conexion;

public class C_CabeceraVenta {

    private CabeceraVentaDAOImpl cabeceraVentaDAO;

    public C_CabeceraVenta() {
        Connection connection = Conexion.conectar();
        cabeceraVentaDAO = new CabeceraVentaDAOImpl(connection);
    }

    public void guardar(int idCliente, double pagar, String fechaVenta) throws Exception {
        if (idCliente <= 0) {
            throw new Exception("El ID del cliente debe ser mayor que cero");
        }
        if (pagar <= 0) {
            throw new Exception("El total a pagar debe ser mayor que cero");
        }
        if (fechaVenta == null || fechaVenta.isEmpty()) {
            throw new Exception("La fecha de venta no puede estar vacía");
        }

        CabeceraVenta cabeceraVenta = new CabeceraVenta(0, idCliente, pagar, fechaVenta);
        cabeceraVentaDAO.crear(cabeceraVenta);
    }

    public void actualizar(int idCabVenta, int idCliente, double pagar, String fechaVenta) throws Exception {
        if (idCliente <= 0) {
            throw new Exception("El ID del cliente debe ser mayor que cero");
        }
        if (pagar <= 0) {
            throw new Exception("El total a pagar debe ser mayor que cero");
        }
        if (fechaVenta == null || fechaVenta.isEmpty()) {
            throw new Exception("La fecha de venta no puede estar vacía");
        }
        if (cabeceraVentaDAO.leer(idCabVenta) == null) {
            throw new Exception("La cabecera de venta no existe");
        }

        CabeceraVenta cabeceraVenta = new CabeceraVenta(idCabVenta, idCliente, pagar, fechaVenta);
        cabeceraVentaDAO.actualizar(cabeceraVenta);
    }

    public void eliminar(int idCabVenta) throws Exception {
        if (cabeceraVentaDAO.leer(idCabVenta) == null) {
            throw new Exception("La cabecera de venta no existe");
        }

        cabeceraVentaDAO.eliminar(idCabVenta);
    }

    public CabeceraVenta leer(int idCabVenta) {
        return cabeceraVentaDAO.leer(idCabVenta);
    }

    public int obtenerUltimoIdCabeceraVenta() throws SQLException {
        return cabeceraVentaDAO.obtenerUltimoId();
    }

}
