package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CabeceraVentaDAOImpl implements DAOinterfaz<CabeceraVenta> {
    private Connection connection;

    public CabeceraVentaDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void crear(CabeceraVenta cabeceraVenta) {
        try {
            PreparedStatement pst = connection.prepareStatement(
                    "INSERT INTO t_cabeceraventa (idCliente, pagar, fechaVenta) VALUES (?, ?, ?)");
            pst.setInt(1, cabeceraVenta.getIdCliente());
            pst.setDouble(2, cabeceraVenta.getPagar());
            pst.setString(3, cabeceraVenta.getFechaVenta());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public CabeceraVenta leer(int id) {
        CabeceraVenta cabeceraVenta = null;
        try {
            PreparedStatement pst = connection.prepareStatement("SELECT * FROM t_cabeceraventa WHERE idCabVenta = ?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                cabeceraVenta = new CabeceraVenta(
                        rs.getInt("idCabVenta"),
                        rs.getInt("idCliente"),
                        rs.getDouble("pagar"),
                        rs.getString("fechaVenta")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cabeceraVenta;
    }

    @Override
    public void actualizar(CabeceraVenta cabeceraVenta) {
        try {
            PreparedStatement pst = connection.prepareStatement(
                    "UPDATE t_cabeceraventa SET idCliente = ?, pagar = ?, fechaVenta = ? WHERE idCabVenta = ?");
            pst.setInt(1, cabeceraVenta.getIdCliente());
            pst.setDouble(2, cabeceraVenta.getPagar());
            pst.setString(3, cabeceraVenta.getFechaVenta());
            pst.setInt(4, cabeceraVenta.getIdCabVenta());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminar(int id) {
        try {
            PreparedStatement pst = connection.prepareStatement("DELETE FROM t_cabeceraventa WHERE idCabVenta = ?");
            pst.setInt(1, id);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public List<CabeceraVenta> leerTodas() {
        List<CabeceraVenta> cabeceraVentas = new ArrayList<>();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM t_cabeceraventa");
            while (rs.next()) {
                CabeceraVenta cabeceraVenta = new CabeceraVenta(
                        rs.getInt("idCabVenta"),
                        rs.getInt("idCliente"),
                        rs.getDouble("pagar"),
                        rs.getString("fechaVenta")
                );
                cabeceraVentas.add(cabeceraVenta);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cabeceraVentas;
    }
    
    public int obtenerUltimoId() {
        int idCabVenta = 0;
        String sql = "SELECT MAX(idCabVenta) AS idCabVenta FROM t_cabeceraventa";
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                idCabVenta = rs.getInt("idCabVenta");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return idCabVenta;
    }
}
