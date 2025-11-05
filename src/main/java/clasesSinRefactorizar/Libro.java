package clasesSinRefactorizar;

class Libro {
    private String titulo;
    private String autor;
    private int numPaginas;
    private String fechaPublicacion;
    private Double precio;
    private boolean esDisponible;
    protected Libro(String titulo, String autor, int numPaginas, String fechaPublicacion, double precio, Boolean esDisponible){
    this.titulo = titulo;
    this.autor = autor;
    this.numPaginas = numPaginas;
    this.fechaPublicacion = fechaPublicacion;
    this.precio = precio;
    this.esDisponible = esDisponible;
    }

    protected String getTitulo() {
        return titulo;
    }

    protected void setTitulo(String titulo) {
        if(!titulo.equals(this.titulo)){
            this.titulo = titulo;
        }
    }

    protected String getAutor() {
        return autor;
    }

    protected void setAutor(String autor) {
        if(!autor.equals(this.autor)){
            this.autor = autor;
        }
    }

    protected String getFechaPublicacion() {
        return fechaPublicacion;
    }

    protected void setFechaPublicacion(String fechaPublicacion) {
        if(!(fechaPublicacion.equals(this.fechaPublicacion))){
            this.fechaPublicacion = fechaPublicacion;
        }
    }

    protected int getNumPaginas() {
        return numPaginas;
    }

    protected void setNumPaginas(int numPaginas) {
        if((numPaginas != this.numPaginas) && numPaginas > 0){
            this.numPaginas = numPaginas;
        }
    }

    protected boolean getEsDisponible() {
        return esDisponible;
    }

    protected void setEsDisponible(boolean esDisponible) {
        if (esDisponible != this.esDisponible){
            this.esDisponible = esDisponible;
        }
    }

    protected double getPrecio() {
        return precio;
    }

    protected void setPrecio(double precio) {
        if (precio != this.precio && precio > 0){
            this.precio = precio;
        }
    }
    protected void reporteLibro(Libro a){
        System.out.printf("""
                Titulo: %s %nAutor: %s %nFecha de publicacion: %s %nNumero de paginas: %d %nPrecio: %.2f
                Disponible: %b %n""", getTitulo(), getAutor(), getFechaPublicacion(), getNumPaginas(), getPrecio(), getEsDisponible());
    }
    protected void guardarDatosLibro(Libro a){
        System.out.println("Datos guardados");
    }
}