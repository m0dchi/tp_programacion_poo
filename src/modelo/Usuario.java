package modelo;

public class Usuario extends Persona {
    private String usuario;
    private String password;
    
    public Usuario(){
        this.usuario = "";
        this.password = "";
    }
    
    public Usuario(int id,String nombre, String apellido, int dni, String usuario, String password) {
        super(id,nombre,apellido,dni);
        this.usuario = usuario;
        this.password = password;
    }
    
    public String getUsuario() {
        return usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    // Método equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Usuario usuario1 = (Usuario) o;
        return usuario.equals(usuario1.usuario);
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", dni='" + getDni() + '\'' +
                ", usuario='" + usuario + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
