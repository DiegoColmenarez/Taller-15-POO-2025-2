package clasesSinRefactorizar;

import java.util.Scanner;

public class Producto {
    String nombreProducto;
    double precioDeCompra;
    String numeroDeSerie;
    int stock;
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
    int comprarParaStock() {
        Scanner scStock = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de productos a agregar: ");
        int cantidadProducto = scStock.nextInt();
        if (cantidadProducto < 0) {
            throw new RuntimeException("No se pueden ingresar números negativos");
        }
        return cantidadProducto;
    }
    void agregarStock() {
        this.stock = stock + comprarParaStock();
    }
    double descuentosPorCompras() {
        if (comprarParaStock() < 300) {
            return 0.1;
        } else if (comprarParaStock() < 500) {
            return 0.35;
        } else if (comprarParaStock() < 1000) {
            return 0.45;
        } else return 1;
    }
    void calcularTotal(){
        int cantidad = comprarParaStock();
        double descuento = descuentosPorCompras();
        double total = cantidad * this.precioDeCompra * descuento;
        System.out.printf("""
            FACTURA.
            PRODUCTO PEDIDO: %s
            CANTIDAD DEL PEDIDO: %d
            DESCUENTO APLICADO: %.2f%%
            TOTAL: %.2f
            """, nombreProducto, cantidad, descuento*100, total);
    }
}