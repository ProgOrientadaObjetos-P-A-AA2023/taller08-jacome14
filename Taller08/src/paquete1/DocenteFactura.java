
package paquete1;


public class DocenteFactura extends Docente {
    private double valorFactura;
    private double valorIvaDescuento;
    private double valorCancelar;

    public void establecerValorFactura(double v) {
        valorFactura = v;
    }

    public void establecerValorIvaDescuento(double v) {
        valorIvaDescuento = v;
    }

    public void calcularValorCancelar() {
        valorCancelar = valorFactura - (valorFactura * (valorIvaDescuento/100));
    }

    public double obtenerValorFactura() {
        return valorFactura;
    }

    public double obtenerValorIvaDescuento() {
        return valorIvaDescuento;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }
    
   
    @Override
    public String toString(){
        String reporte = String.format("Nombres: %s\nCédula: %s\nValor de la "
                + "Factura: $%.2f\nValor del Iva de Descuento: %.2f\n"
                + "----------------------------------------\nValor a Cancelar: "
                + "$%.2f\n",
                obtenerNombre(),
                obtenerCedula(),
                obtenerValorFactura(),
                obtenerValorIvaDescuento(),
                obtenerValorCancelar());
        
        return reporte;
    }
    
}