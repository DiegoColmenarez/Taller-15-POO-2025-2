package clasesRefactorizadas.Producto;

import java.util.Scanner;

public class EntradaCantidad {
    public int obtenerCantidad() {
        Scanner scCantidad = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de productos a agregar: ");
        int cantidad = scCantidad.nextInt();
        if (cantidad < 0) {
            throw new IllegalArgumentException("No se pueden ingresar números negativos");
        }
        return cantidad;
    }
}