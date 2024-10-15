package modelo;

public class Persona {

    private int id;
    private String nombre;
    private String apellido;
    private int dni;
    private int estado;

    public Persona() {
        this.id = 0;
        this.nombre = "";
        this.apellido = "";
        this.dni = 0;
        this.estado = 0;
    }

    public Persona(int id, String nombre, String apellido, int dni, int estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estado = estado;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Persona persona = (Persona) o;
        return id == persona.id;
    }

    @Override
    public String toString() {
        return "Persona{"
                + "id=" + id
                + ", nombre='" + nombre + '\''
                + ", apellido='" + apellido + '\''
                + ", dni='" + dni + '\''
                + '}';
    }
}
