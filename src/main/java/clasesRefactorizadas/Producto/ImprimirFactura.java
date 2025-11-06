package clasesRefactorizadas.Producto;

public class ImprimirFactura {
    public void imprimir(String nombreProducto, int cantidad, double descuento, double total, int stockFinal) {
        System.out.printf("""
            FACTURA
            PRODUCTO: %s
            CANTIDAD COMPRADA: %d
            DESCUENTO APLICADO: %.2f%%
            TOTAL A PAGAR: %.2f
            STOCK FINAL: %d
            """, nombreProducto, cantidad, descuento * 100, total, stockFinal);
    }
}