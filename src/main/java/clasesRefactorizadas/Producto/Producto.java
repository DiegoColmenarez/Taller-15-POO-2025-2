package clasesRefactorizadas.Producto;

public class Producto {
    String nombreProducto;
    double precioDeCompra;
    String numeroDeSerie;
    int stock;
    private final EntradaCantidad entradaCantidad = new EntradaCantidad();
    private final GestorStock agregarStock = new GestorStock();
    private final Descuentos calcularDescuento = new Descuentos();
    private final CalcularTotal calcularTotal = new CalcularTotal();
    private final ImprimirFactura imprimirFactura = new ImprimirFactura();
    public Producto(String nombreProducto, double precioDeCompra, int stock, String numeroDeSerie) {
        this.nombreProducto = nombreProducto;
        this.precioDeCompra = precioDeCompra;
        this.stock = stock;
        this.numeroDeSerie = numeroDeSerie;
        validarDatos();
    }
    private void validarDatos() {
        if (precioDeCompra < 0) {
            throw new RuntimeException("No se puede tener un precio negativo");
        }
        if (stock < 0) {
            throw new RuntimeException("No se puede tener un stock negativo");
        }
    }
    public void procesarCompra() {
        int cantidad = entradaCantidad.obtenerCantidad();
        double descuento = calcularDescuento.descuentosPorCompras(cantidad);
        double total = calcularTotal.obtenerTotal(cantidad, precioDeCompra, descuento);
        stock = agregarStock.agregar(stock, cantidad);
        imprimirFactura.imprimir(nombreProducto, cantidad, descuento, total, stock);
    }
}