package Ordenamiento;

public class ArticuloInventario {
    private String nombreArticulo;
    private double precioUnitario;
    private int cantidadStock;

    public ArticuloInventario(String nombreArticulo, double precioUnitario, int cantidadStock) {
        this.nombreArticulo = nombreArticulo;
        this.precioUnitario = precioUnitario;
        this.cantidadStock = cantidadStock;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        if (nombreArticulo != null && !nombreArticulo.trim().isEmpty()) {
            this.nombreArticulo = nombreArticulo;
        }
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario >= 0) {
            this.precioUnitario = precioUnitario;
        }
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        if (cantidadStock >= 0) {
            this.cantidadStock = cantidadStock;
        }
    }



    public double calcularSubtotalInventario() {
        return cantidadStock * precioUnitario;
    }

    public double calcularTotalConDescuento(double porcentajeDescuento) {
        double subtotal = calcularSubtotalInventario();
        double montoDescuento = subtotal * (porcentajeDescuento / 100.0);
        return subtotal - montoDescuento;
    }


    public String generarResumenInventario(double porcentajeDescuento) {
        double totalValorizado = calcularTotalConDescuento(porcentajeDescuento);
        return "Articulo: " + nombreArticulo + " | Stock: " + cantidadStock + "\n" +
               "Total inventario valorizado: $" + String.format("%.2f", totalValorizado);
    }

    public static void main(String[] args) {
        ArticuloInventario articulo = new ArticuloInventario("Laptop Pro", 12500.0, 8);
        String reporte = articulo.generarResumenInventario(10.0);
        System.out.println(reporte);
    }
}