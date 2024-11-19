package modelo;

public class Cliente extends Persona {

    private long telefono;

    public Cliente() {
        this.telefono = 0;
    }

    public Cliente(int id, String nombre, String apellido, int dni, long telefono) {
        super(id, nombre, apellido, dni);
        this.telefono = telefono;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
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
        if (!super.equals(o)) {
            return false;
        }
        Cliente cliente = (Cliente) o;
        return telefono == cliente.telefono;
    }

    // Método toString
    @Override
    public String toString() {
        return "Cliente{"
                + "id=" + getId()
                + ", nombre='" + getNombre() + '\''
                + ", apellido='" + getApellido() + '\''
                + ", dni=" + getDni() + '\''
                + ", telefono='" + telefono + '\''
                + '}';
    }
}
