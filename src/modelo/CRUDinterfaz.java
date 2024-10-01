package modelo;

public interface CRUDinterfaz<T> {
    void crear(T t);
    T leer(int id);
    void actualizar(T t);
    void eliminar(int id);
}
