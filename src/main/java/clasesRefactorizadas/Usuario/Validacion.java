package clasesRefactorizadas.Usuario;

public class Validacion {
    public void validarDatos(Usuario usuario) {
        if (usuario.getNombreUsuario() == null || usuario.getNombreUsuario().isEmpty()){
            throw new RuntimeException("Nombre invalido");
        }
        else if (usuario.getContrasena() == null){
            throw new RuntimeException("Contraseña invalida");
        }
        else if (!usuario.getEmail().contains("@")){
            throw new RuntimeException("Email no valido");
        } else{
            System.out.println("Datos validos");
        }
    }
}