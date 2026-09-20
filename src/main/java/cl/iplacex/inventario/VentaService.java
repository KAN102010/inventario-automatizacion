package cl.iplacex.inventario;

/**
 * Servicio encargado de procesar una venta
 * utilizando el servicio de inventario.
 */
public class VentaService {

    private final InventarioService inventarioService;

    public VentaService(InventarioService inventarioService) {
        this.inventarioService = inventarioService;
    }

    public String procesarVenta(int stockInicial, int cantidadVendida) {

        int stockRestante =
                inventarioService.calcularStockDisponible(
                        stockInicial,
                        cantidadVendida);

        return "Venta realizada. Stock restante: " + stockRestante;
    }
}