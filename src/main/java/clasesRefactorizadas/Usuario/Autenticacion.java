package clasesRefactorizadas.Usuario;

public class Autenticacion {
    Boolean autenticarDatos(Usuario usuario, String nombreUsuario, String contrasena, String email){
        return usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getContrasena().equals(contrasena) &&
                usuario.getEmail().equals(email);
    }
}
