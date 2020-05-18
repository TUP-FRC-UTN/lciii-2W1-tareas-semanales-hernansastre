
package Principall;


public class Folleto {
    private String fechaInicio;
    Oferta ofertas[];
    int tam;

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Folleto(int tam) {
        
        ofertas = new Oferta[tam];
        
    }
    
    public void agregarOferta(Oferta o)
    {
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i]==null) {
                ofertas[i]=o;
                break;
                
            }
            
        }
    }
    
    public int cantArticOfertadosPorMas5Dias()
    {
        int c=0;
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i]!=null) {
                if (ofertas[i].getCantDiasVigencia()>5) {
                    c++;
                    }
                
                
            }
            
        }
        return c;
        
    }
    
    public int unidadesEnVenta()
    {
        int c=0;
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i]!=null) {
                if (ofertas[i].getStock()>0) {
                    c+=ofertas[i].getStock();
                    
                }
                
            }
            
        }
        return c;
    }
    
    public double cantDescuentoMayorA20()
    {
        double c=0;
        for (int i = 0; i < ofertas.length; i++) {
        
        if (ofertas[i]!=null) {
            if ((ofertas[i].getPrecioRegular()-ofertas[i].getPrecioOferta())>20) {
                c++;
                
            }
            
        }
        
            
        }
        return c;
   }
    
    public double totalRecaudar(int codigo)
    {
        double total=0;
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i]!=null) {
                if (ofertas[i].getNroProducto()==codigo) {
                    total=ofertas[i].getPrecioOferta()*ofertas[i].getStock();
                    
                }
                
            }
            
        }
        return total;
        
    }
}


