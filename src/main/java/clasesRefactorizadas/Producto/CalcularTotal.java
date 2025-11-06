package clasesRefactorizadas.Producto;

public class CalcularTotal {
    public double obtenerTotal(int cantidad, double precio, double descuento) {
        return cantidad * precio * (1 - descuento);
    }
}