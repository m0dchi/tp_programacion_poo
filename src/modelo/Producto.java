package modelo;

public class Producto {

    private int id;
    private String nombre;
    private int idCategoria;
    private double precio;
    
    public Producto(){
        this.id = 0;
        this.nombre = "";
        this.idCategoria = 0;
        this.precio = 0;
    }

    public Producto(int id, String nombre, int idCategoria, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.idCategoria = idCategoria;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{"
                + " id=" + id
                + ", nombre='" + nombre + '\''
                + ", id categoria='" + idCategoria + '\''
                + ", precio=" + precio
                + '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return id == producto.id;
    }
}
