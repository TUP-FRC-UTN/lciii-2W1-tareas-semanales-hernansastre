package models;

public class Grupal extends Clase {
    
    private int cupo;
    private int cantidadClases;

   public Grupal(){};
           
    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public int getCantidadClases() {
        return cantidadClases;
    }

    public void setCantidadClases(int cantidadClases) {
        this.cantidadClases = cantidadClases;
    }

    public Grupal(int cupo, int cantidadClases, String diaHora, String materia, float costoBase) {
        super(diaHora, materia, costoBase);
        this.cupo = cupo;
        this.cantidadClases = cantidadClases;
    }

    @Override
    public String toString() {
        return "Grupal{" + "cupo=" + cupo + ", cantidadClases=" + cantidadClases + '}';
    }
    
    @Override
    public float costoClase(){
        float costo= cantidadClases*super.getCostoBase();
        return costo;
        
    }
    
    
    
}
