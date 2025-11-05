package clasesRefactorizadas.Libro;

public class Main {
    public static void main(String[] args) {
        var libro1= new Libro("El Principito", "Antoine de Saint-Exupéry", 120, "1943-04-06", 350.4, true);
        var reporteLibro1 = new ReporteLibro();
        var guardarDatosLibro1= new GuardarDatosLibro();
        reporteLibro1.imprimirReporte(libro1);
        guardarDatosLibro1.libroRepositorio(libro1);
    }
}