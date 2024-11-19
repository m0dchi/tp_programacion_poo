package modelo;

import java.util.List;

public interface DAOinterfaz<T> {
    void crear(T t);
    T leer(int id);
    void actualizar(T t);
    void eliminar(int id);
    List<T> leerTodas(); 
}
