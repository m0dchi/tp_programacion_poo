package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements DAOinterfaz<Cliente> {

    private Connection connection;

    public ClienteDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void crear(Cliente cliente) {
        try {
            PreparedStatement pst = connection.prepareStatement(
                    "INSERT INTO t_cliente (nombre, apellido, dni, telefono) VALUES (?, ?, ?, ?)");
            pst.setString(1, cliente.getNombre());
            pst.setString(2, cliente.getApellido());
            pst.setInt(3, cliente.getDni());
            pst.setLong(4, cliente.getTelefono());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Cliente leer(int id) {
        Cliente cliente = null;
        try {
            PreparedStatement pst = connection.prepareStatement("SELECT * FROM t_cliente WHERE idCliente = ?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                cliente = new Cliente(
                        rs.getInt("idCliente"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("dni"),
                        rs.getLong("telefono")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cliente;
    }

    @Override
    public void actualizar(Cliente cliente) {
        try {
            PreparedStatement pst = connection.prepareStatement(
                    "UPDATE t_cliente SET nombre = ?, apellido = ?, dni = ?, telefono = ? WHERE idCliente = ?");
            pst.setString(1, cliente.getNombre());
            pst.setString(2, cliente.getApellido());
            pst.setInt(3, cliente.getDni());
            pst.setLong(4, cliente.getTelefono());
            pst.setInt(5, cliente.getId());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminar(int id) {
        try {
            PreparedStatement pst = connection.prepareStatement("DELETE FROM t_cliente WHERE idCliente = ?");
            pst.setInt(1, id);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Cliente> leerTodas() {
        List<Cliente> clientes = new ArrayList<>();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM t_cliente");
            while (rs.next()) {
                Cliente cliente = new Cliente(
                        rs.getInt("idCliente"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("dni"),
                        rs.getLong("telefono")
                );
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
    }

    public Cliente buscarPorDNI(String dni) {
        Cliente cliente = null;
        String sql = "SELECT idCliente, nombre, apellido FROM t_cliente WHERE dni = ?";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, dni);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                cliente = new Cliente(
                        rs.getInt("idCliente"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("dni"),
                        rs.getLong("telefono")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cliente;
    }

    public Cliente buscarPorDNI(int dni) {
        Cliente cliente = null;
        String sql = "SELECT idCliente, nombre, apellido, dni, telefono FROM t_cliente WHERE dni = ?";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, dni);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                cliente = new Cliente(
                        rs.getInt("idCliente"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("dni"),
                        rs.getLong("telefono")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cliente;
    }

    public int leerIdPorNombreCompleto(String nombreCompleto) {
        int idCliente = 0;
        String sql = "SELECT idCliente FROM t_cliente WHERE CONCAT(nombre, ' ', apellido) = ?";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, nombreCompleto);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                idCliente = rs.getInt("idCliente");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return idCliente;
    }

}
