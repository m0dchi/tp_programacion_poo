package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DetalleVentaDAOImpl implements DAOinterfaz<DetalleVenta> {

    private Connection connection;

    public DetalleVentaDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void crear(DetalleVenta detalleVenta) {
        String sql = "INSERT INTO t_detalleventa (idCabVenta, idProducto, cantidad, precioUni, pagarTotal) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, detalleVenta.getIdCabVenta());
            pst.setInt(2, detalleVenta.getIdProducto());
            pst.setInt(3, detalleVenta.getCantidad());
            pst.setDouble(4, detalleVenta.getPrecioUni());
            pst.setDouble(5, detalleVenta.getPagarTotal());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public DetalleVenta leer(int id) {
        DetalleVenta detalleVenta = null;
        try {
            PreparedStatement pst = connection.prepareStatement("SELECT * FROM t_detalleventa WHERE idDetalleVenta = ?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                detalleVenta = new DetalleVenta(
                        rs.getInt("idDetalleVenta"),
                        rs.getInt("idCabVenta"),
                        rs.getInt("idProducto"),
                        rs.getInt("cantidad"),
                        rs.getDouble("precioUni"),
                        rs.getDouble("pagarTotal")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return detalleVenta;
    }

    @Override
    public void actualizar(DetalleVenta detalleVenta) {
        try {
            PreparedStatement pst = connection.prepareStatement(
                    "UPDATE t_detalleventa SET idCabVenta = ?, idProducto = ?, cantidad = ?, precioUni = ?, pagarTotal = ? WHERE idDetalleVenta = ?");
            pst.setInt(1, detalleVenta.getIdCabVenta());
            pst.setInt(2, detalleVenta.getIdProducto());
            pst.setInt(3, detalleVenta.getCantidad());
            pst.setDouble(4, detalleVenta.getPrecioUni());
            pst.setDouble(5, detalleVenta.getPagarTotal());
            pst.setInt(6, detalleVenta.getIdDetalleVenta());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminar(int id) {
        try {
            PreparedStatement pst = connection.prepareStatement("DELETE FROM t_detalleventa WHERE idDetalleVenta = ?");
            pst.setInt(1, id);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<DetalleVenta> leerTodas() {
        List<DetalleVenta> detallesVentas = new ArrayList<>();
        String sql = "SELECT idDetalleVenta, idCabVenta, idProducto, cantidad, precioUni, pagarTotal FROM t_detalleventa";
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                DetalleVenta detalleVenta = new DetalleVenta(
                        rs.getInt("idDetalleVenta"),
                        rs.getInt("idCabVenta"),
                        rs.getInt("idProducto"),
                        rs.getInt("cantidad"),
                        rs.getDouble("precioUni"),
                        rs.getDouble("pagarTotal")
                );
                detallesVentas.add(detalleVenta);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return detallesVentas;
    }

    public void actualizarTotal(int idDetalleVenta, double nuevoTotal) {
        String sql = "UPDATE t_detalleventa SET pagarTotal = ? WHERE idDetalleVenta = ?";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setDouble(1, nuevoTotal);
            pst.setInt(2, idDetalleVenta);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String obtenerFechaVenta(int idCabVenta) {
        String fecha = "";
        String sql = "SELECT fechaVenta FROM t_cabeceraventa WHERE idCabVenta = ?";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, idCabVenta);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                fecha = rs.getString("fechaVenta");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return fecha;
    }

}
