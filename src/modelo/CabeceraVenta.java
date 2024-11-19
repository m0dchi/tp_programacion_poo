package modelo;

public class CabeceraVenta {

    private int idCabVenta;
    private int idCliente;
    private double pagar;
    private String fechaVenta;

    public CabeceraVenta() {
        this.idCabVenta = 0;
        this.idCliente = 0;
        this.pagar = 0.0;
        this.fechaVenta = "";
    }

    public CabeceraVenta(int idCabVenta, int idCliente, double pagar, String fechaVenta) {
        this.idCabVenta = idCabVenta;
        this.idCliente = idCliente;
        this.pagar = pagar;
        this.fechaVenta = fechaVenta;
    }

    public int getIdCabVenta() {
        return idCabVenta;
    }

    public void setIdCabVenta(int idCabVenta) {
        this.idCabVenta = idCabVenta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getPagar() {
        return pagar;
    }

    public void setPagar(double pagar) {
        this.pagar = pagar;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    // Método equals
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CabeceraVenta cabeceraVenta = (CabeceraVenta) o;
        return idCabVenta == cabeceraVenta.idCabVenta;
    }

    // Método toString
    @Override
    public String toString() {
        return "CabeceraVenta{"
                + "idCabVenta=" + idCabVenta
                + ", idCliente=" + idCliente
                + ", pagar=" + pagar
                + ", fechaVenta='" + fechaVenta + '\''
                + '}';
    }
}
