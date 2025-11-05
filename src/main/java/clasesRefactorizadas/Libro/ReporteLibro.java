package clasesRefactorizadas.Libro;

public class ReporteLibro {
    public void imprimirReporte(Libro libro) {
        System.out.printf("""
                        Título: %s
                        Autor: %s
                        Fecha de publicación: %s
                        Número de páginas: %d
                        Precio: %.2f
                        Disponible: %b
                        %n""",
                libro.getTitulo(),
                libro.getAutor(),
                libro.getFechaPublicacion(),
                libro.getNumPaginas(),
                libro.getPrecio(),
                libro.getEsDisponible());
    }
}