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

    public boolean guardar(Categoria categoria) {
        try {
            categoriaDAO.crear(categoria);
            return true;
        } catch (Exception e) {
            System.out.println("Error al guardar categoria: " + e);
            return false;
        }
    }

    public boolean categoriaExiste(String nombreCategoria) {
        List<Categoria> categorias = categoriaDAO.leerTodas();
        return categorias.stream().anyMatch(categoria -> categoria.getNombre().equals(nombreCategoria));
    }

    public boolean actualizar(Categoria categoria, int idCategoria) {
        try {
            categoria.setId(idCategoria);
            categoriaDAO.actualizar(categoria);
            return true;
        } catch (Exception e) {
            System.out.println("Error al actualizar categoria: " + e);
            return false;
        }
    }

    public boolean eliminar(int idCategoria) {
        try {
            categoriaDAO.eliminar(idCategoria);
            return true;
        } catch (Exception e) {
            System.out.println("Error al eliminar categoria: " + e);
            return false;
        }
    }

    public List<Categoria> leerTodas() {
        return categoriaDAO.leerTodas();
    }

    public Categoria leer(int idCategoria) {
        return categoriaDAO.leer(idCategoria);
    }
}
