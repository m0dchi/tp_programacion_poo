package controlador;

import modelo.Cliente;
import modelo.ClienteDAOImpl;
import java.sql.*;
import java.util.List;

public class C_Cliente {

    private ClienteDAOImpl clienteDAO;

    public C_Cliente() {
        Connection connection = conexion.Conexion.conectar();
        clienteDAO = new ClienteDAOImpl(connection);
    }

    public void guardar(String nombre, String apellido, int dni, long telefono) throws Exception {
        if (nombre == null || nombre.isEmpty()) {
            throw new Exception("El nombre no puede estar vacío");
        }
        if (apellido == null || apellido.isEmpty()) {
            throw new Exception("El apellido no puede estar vacío");
        }
        if (dni <= 0) {
            throw new Exception("El DNI no puede estar vacío o negativo");
        }
        if (telefono <= 0) {
            throw new Exception("El teléfono no puede estar vacío o negativo");
        }
        Cliente cliente = new Cliente(0, nombre, apellido, dni, telefono);
        clienteDAO.crear(cliente);
    }

    public boolean clienteExiste(int dni) {
        List<Cliente> clientes = clienteDAO.leerTodas();
        return clientes.stream().anyMatch(cliente -> cliente.getDni() == dni);
    }

    public void actualizar(int id, String nombre, String apellido, int dni, long telefono) throws Exception {
        if (nombre == null || nombre.isEmpty()) {
            throw new Exception("El nombre no puede estar vacío");
        }
        if (apellido == null || apellido.isEmpty()) {
            throw new Exception("El apellido no puede estar vacío");
        }
        if (dni <= 0) {
            throw new Exception("El DNI no puede estar vacío o negativo");
        }
        if (telefono <= 0) {
            throw new Exception("El teléfono no puede estar vacío o negativo");
        }
        if (clienteDAO.leer(id) == null) {
            throw new Exception("El cliente no existe");
        }
        Cliente cliente = new Cliente(id, nombre, apellido, dni, telefono);
        clienteDAO.actualizar(cliente);
    }

    public void eliminar(int id) throws Exception {
        if (clienteDAO.leer(id) == null) {
            throw new Exception("El cliente no existe");
        }
        clienteDAO.eliminar(id);
    }

    public List<Cliente> leerTodas() {
        return clienteDAO.leerTodas();
    }

    public Cliente leer(int id) {
        return clienteDAO.leer(id);
    }

   public Cliente buscarClientePorDNI(int dni) throws Exception {
    Cliente cliente = clienteDAO.buscarPorDNI(dni);
    if (cliente == null) {
        throw new Exception("¡DNI de cliente incorrecto o no encontrado!");
    }
    return cliente;
}


    public List<Cliente> obtenerTodosLosClientes() throws SQLException {
        return clienteDAO.leerTodas();
    }

    public int obtenerIdClientePorNombreCompleto(String nombreCompleto) throws Exception {
        int idCliente = clienteDAO.leerIdPorNombreCompleto(nombreCompleto);
        if (idCliente == 0) {
            throw new Exception("¡Error al obtener ID del cliente!");
        }
        return idCliente;
    }

}
