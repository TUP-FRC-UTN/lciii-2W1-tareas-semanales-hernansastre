package models;

import java.util.ArrayList;

public class AltaClases {
    
    private ArrayList<Clase> clases;

    public AltaClases() {
        this.clases = new ArrayList();
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }
    
    public void agregarClase(Clase clase)
    {
        clases.add(clase);
    }
    
   
    public float totalGanancias()
    {
        float total=0;
        for (Clase clase : clases) {
            if (clase instanceof Individual ) {
            total+=clase.costoClase();
            }
            else {
                    if (clase instanceof Grupal) {
                    total+= clase.costoClase()*((Grupal) clase).getCupo();
   
                        }
                    }
                
            }
            
            
        return total;
    }
    
  public float CantidadgananciasMayoresA(float numero){
      
      int contador=0;
      for (Clase clase : clases) {
          if (numero<clase.costoClase()) {
              contador++;
              
          }
      }
      return contador;
  }
   
  

    public Object[] listado() {
        return clases.toArray();
    }
    
    
}
