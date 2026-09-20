package cl.iplacex.inventario;

/**
 * Servicio encargado de realizar operaciones
 * relacionadas con el inventario.
 */
public class InventarioService {

    public int calcularStockDisponible(int stockInicial, int cantidadVendida) {

        if (stockInicial < 0) {
            throw new IllegalArgumentException(
                    "El stock inicial no puede ser negativo");
        }

        if (cantidadVendida < 0) {
            throw new IllegalArgumentException(
                    "La cantidad vendida no puede ser negativa");
        }

        if (cantidadVendida > stockInicial) {
            throw new IllegalArgumentException(
                    "No se puede vender más productos que el stock disponible");
        }

        return stockInicial - cantidadVendida;
    }
}