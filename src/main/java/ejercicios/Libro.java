package ejercicios;

public class Libro {
    private String titulo;
    private String autor;
    private int numPaginas;
    private String fechaPublicacion;
    private Double precio;
    private boolean esDisponible;
    public Libro(String titulo, String autor, int numPaginas, String fechaPublicacion, double precio, Boolean esDisponible){
    this.titulo = titulo;
    this.autor = autor;
    this.numPaginas = numPaginas;
    this.fechaPublicacion = fechaPublicacion;
    this.precio = precio;
    this.esDisponible = esDisponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(!titulo.equals(this.titulo)){
            this.titulo = titulo;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if(!autor.equals(this.autor)){
            this.autor = autor;
        }
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        if(!(fechaPublicacion.equals(this.fechaPublicacion))){
            this.fechaPublicacion = fechaPublicacion;
        }
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        if((numPaginas != this.numPaginas) && numPaginas > 0){
            this.numPaginas = numPaginas;
        }
    }

    public boolean getEsDisponible() {
        return esDisponible;
    }

    public void setEsDisponible(boolean esDisponible) {
        if (esDisponible != this.esDisponible){
            this.esDisponible = esDisponible;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio != this.precio && precio > 0){
            this.precio = precio;
        }
    }
    public void reporteLibro(Libro a){
        System.out.printf("""
                Titulo: %s %nAutor: %s %nFecha de publicacion: %s %nNumero de paginas: %d %nPrecio: %.2f
                Disponible: %b %n""", getTitulo(), getAutor(), getFechaPublicacion(), getNumPaginas(), getPrecio(), getEsDisponible());
    }
    public void guardarDatosLibro(Libro a){
        System.out.println("Datos guardados");
    }
}