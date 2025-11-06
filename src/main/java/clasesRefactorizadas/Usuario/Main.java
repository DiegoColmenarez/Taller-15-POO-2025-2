package clasesRefactorizadas.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Carlos", "13455", "carlos@gmail.com");
        Validacion validacionUsuario1 = new Validacion();
        Autenticacion autenticacionUsuario1 = new Autenticacion();
        validacionUsuario1.validarDatos(usuario1);
        System.out.println("Autenticacion exitosa: " + autenticacionUsuario1.autenticarDatos(usuario1, "Carlos", "13456", "carlos@gmail.com"));
    }
}