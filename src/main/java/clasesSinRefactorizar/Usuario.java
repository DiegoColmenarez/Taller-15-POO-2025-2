package clasesSinRefactorizar;

public class Usuario {
    private String nombreUsuario;
    private String contrasena;
    private String email;
    public Usuario(String nombreUsuario, String contrasena, String email) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.email = email;
        validarDatos();
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public String getEmail() {
        return email;
    }
    Boolean autenticarDatos(String nombreUsuario, String contrasena){
        return this.nombreUsuario.equals(nombreUsuario) && this.contrasena.equals(contrasena) && this.email.equals(email);
    }
    public void validarDatos() {
        if (nombreUsuario == null || nombreUsuario.isEmpty()){
            throw new RuntimeException("Nombre invalido");
        }
        else if (contrasena == null){
            throw new RuntimeException("Contraseña invalida");
        }
        else if (!email.contains("@")){
            throw new RuntimeException("Email no valido");
        } else{
            System.out.println("Datos validos");
        }
    }
}