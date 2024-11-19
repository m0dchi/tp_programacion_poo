package modelo;

public class DetalleVenta {
    private int idDetalleVenta;
    private int idCabVenta;
    private int idProducto;
    private String nombre;
    private int cantidad;
    private double precioUni;
    private double pagarTotal;
    
    public DetalleVenta() {
        this.idDetalleVenta = 0;
        this.idCabVenta = 0;
        this.idProducto = 0;
        this.nombre = "";
        this.cantidad = 0;
        this.precioUni = 0.0;
        this.pagarTotal = 0.0;
    }

    public DetalleVenta(int idDetalleVenta, int idCabVenta, int idProducto, int cantidad, double precioUni, double pagarTotal) {
        this.idDetalleVenta = idDetalleVenta;
        this.idCabVenta = idCabVenta;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precioUni = precioUni;
        this.pagarTotal = pagarTotal;
    }

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public int getIdCabVenta() {
        return idCabVenta;
    }

    public void setIdCabVenta(int idCabVenta) {
        this.idCabVenta = idCabVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUni() {
        return precioUni;
    }

    public void setPrecioUni(double precioUni) {
        this.precioUni = precioUni;
    }

    public double getPagarTotal() {
        return pagarTotal;
    }

    public void setPagarTotal(double pagarTotal) {
        this.pagarTotal = pagarTotal;
    }
    
    
}
