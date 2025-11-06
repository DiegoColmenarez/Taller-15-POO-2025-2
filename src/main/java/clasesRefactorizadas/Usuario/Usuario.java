package clasesRefactorizadas.Usuario;

public class Usuario {
    private String nombreUsuario;
    private String contrasena;
    private String email;
    public Usuario(String nombreUsuario, String contrasena, String email) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.email = email;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public String getEmail() {
        return email;
    }
    public String getContrasena(){
        return contrasena;
    }

}