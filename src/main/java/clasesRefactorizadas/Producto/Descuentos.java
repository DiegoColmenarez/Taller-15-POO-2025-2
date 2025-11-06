package clasesRefactorizadas.Producto;

public class Descuentos {
    public double descuentosPorCompras(int cantidad) {
        if (cantidad < 300) {
            return 0.10;
        } else if (cantidad < 500) {
            return 0.35;
        } else if (cantidad < 1000) {
            return 0.45;
        } else {
            return 1.00;
        }
    }
}