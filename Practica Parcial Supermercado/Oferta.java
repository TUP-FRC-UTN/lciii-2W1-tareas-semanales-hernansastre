
package Principall;

public class Oferta {
    
    private int nroProducto;
    private String nombreProducto;
    private double precioRegular;
    private double precioOferta;
    private int cantDiasVigencia;
    private int stock;
    

    public int getNroProducto() {
        return nroProducto;
    }

    public void setNroProducto(int nroProducto) {
        this.nroProducto = nroProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioRegular() {
        return precioRegular;
    }

    public void setPrecioRegular(double precioRegular) {
        this.precioRegular = precioRegular;
    }

    public double getPrecioOferta() {
        return precioOferta;
    }

    public void setPrecioOferta(double precioOferta) {
        this.precioOferta = precioOferta;
    }

    public int getCantDiasVigencia() {
        return cantDiasVigencia;
    }

    public void setCantDiasVigencia(int cantDiasVigencia) {
        this.cantDiasVigencia = cantDiasVigencia;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public Oferta(){};

    public Oferta(int nroProducto, String nombreProducto, double precioRegular, double precioOferta, int cantDiasVigencia, int stock) {
        this.nroProducto = nroProducto;
        this.precioRegular = precioRegular;
        this.precioOferta = precioOferta;
        this.cantDiasVigencia = cantDiasVigencia;
        this.stock = stock;
        this.nombreProducto=nombreProducto;
    }

    @Override
    public String toString() {
        return "Oferta{" + "nroProducto=" + nroProducto + ", nombreProducto=" + nombreProducto + ", precioRegular=" + precioRegular + ", precioOferta=" + precioOferta + ", cantDiasVigencia=" + cantDiasVigencia + ", stock=" + stock + '}';
    }
    
    
    
    
    
}
