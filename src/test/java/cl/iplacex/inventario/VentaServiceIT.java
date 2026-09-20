package cl.iplacex.inventario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class VentaServiceIT {

    @Test
    void debeProcesarVentaIntegrandoLosServicios() {

        InventarioService inventarioService =
                new InventarioService();

        VentaService ventaService =
                new VentaService(inventarioService);

        String resultado =
                ventaService.procesarVenta(20, 7);

        assertEquals(
                "Venta realizada. Stock restante: 13",
                resultado);
    }

    @Test
    void debeRechazarVentaSinStockSuficiente() {

        InventarioService inventarioService =
                new InventarioService();

        VentaService ventaService =
                new VentaService(inventarioService);

        assertThrows(
                IllegalArgumentException.class,
                () -> ventaService.procesarVenta(5, 10)
        );
    }
}