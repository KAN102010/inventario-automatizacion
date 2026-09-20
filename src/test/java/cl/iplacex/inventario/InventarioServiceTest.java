package cl.iplacex.inventario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InventarioServiceTest {

    @Test
    void debeCalcularStockDisponibleCorrectamente() {

        InventarioService inventario = new InventarioService();

        int resultado =
                inventario.calcularStockDisponible(20, 7);

        assertEquals(13, resultado);
    }

    @Test
    void debePermitirVenderTodoElStock() {

        InventarioService inventario = new InventarioService();

        int resultado =
                inventario.calcularStockDisponible(10, 10);

        assertEquals(0, resultado);
    }

    @Test
    void debeRechazarStockInicialNegativo() {

        InventarioService inventario = new InventarioService();

        assertThrows(
                IllegalArgumentException.class,
                () -> inventario.calcularStockDisponible(-5, 2)
        );
    }

    @Test
    void debeRechazarVentaMayorAlStock() {

        InventarioService inventario = new InventarioService();

        assertThrows(
                IllegalArgumentException.class,
                () -> inventario.calcularStockDisponible(10, 15)
        );
    }
}
