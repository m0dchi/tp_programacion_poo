package controlador;

import modelo.Categoria;
import modelo.CategoriaDAOImpl;
import java.sql.Connection;
import java.util.List;

public class C_Categoria {
    private CategoriaDAOImpl categoriaDAO;

    public C_Categoria() {
        Connection connection = conexion.Conexion.conectar();
        categoriaDAO = new CategoriaDAOImpl(connection);
    }

    public void guardar(String nombre, String descripcion) throws Exception {
        if (nombre == null || nombre.isEmpty()) {
            throw new Exception("El nombre no puede estar vacío");
        }
        if (descripcion == null || descripcion.isEmpty()) {
            throw new Exception("La descripción no puede estar vacía");
        }

        Categoria categoria = new Categoria(0, nombre, descripcion); // Crear instancia del objeto Categoria con ID 0 o automático
        categoriaDAO.crear(categoria);
    }

    public boolean categoriaExiste(String nombreCategoria) {
        List<Categoria> categorias = categoriaDAO.leerTodas();
        return categorias.stream().anyMatch(categoria -> categoria.getNombre().equals(nombreCategoria));
    }

    public void actualizar(String nombre, String descripcion, int idCategoria) throws Exception {
        if (nombre == null || nombre.isEmpty()) {
            throw new Exception("El nombre no puede estar vacío");
        }
        if (descripcion == null || descripcion.isEmpty()) {
            throw new Exception("La descripción no puede estar vacía");
        }
        if (categoriaDAO.leer(idCategoria) == null) {
            throw new Exception("La categoría no existe");
        }

        Categoria categoria = new Categoria(idCategoria, nombre, descripcion);
        categoriaDAO.actualizar(categoria);
    }

    public void eliminar(int idCategoria) throws Exception {
        if (categoriaDAO.leer(idCategoria) == null) {
            throw new Exception("La categoría no existe");
        }

        categoriaDAO.eliminar(idCategoria);
    }

    public List<Categoria> leerTodas() {
        return categoriaDAO.leerTodas();
    }

    public Categoria leer(int idCategoria) {
        return categoriaDAO.leer(idCategoria);
    }
}
