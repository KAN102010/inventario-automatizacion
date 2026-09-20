package cl.iplacex.inventario;

public class Main {

    public static void main(String[] args) {

        InventarioService inventario = new InventarioService();

        int stockInicial = 20;
        int cantidadVendida = 7;

        int stockDisponible =
                inventario.calcularStockDisponible(
                        stockInicial,
                        cantidadVendida);

        System.out.println("=== SISTEMA DE INVENTARIO ===");
        System.out.println("Stock inicial: " + stockInicial);
        System.out.println("Cantidad vendida: " + cantidadVendida);
        System.out.println("Stock disponible: " + stockDisponible);
    }
}