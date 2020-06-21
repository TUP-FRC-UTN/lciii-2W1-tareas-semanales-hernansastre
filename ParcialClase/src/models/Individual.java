package models;

public class Individual extends Clase {
    
    public boolean llegoTarde;

    public Individual(boolean llegoTarde, String diaHora, String materia, float costoBase) {
        super(diaHora, materia, costoBase);
        this.llegoTarde = llegoTarde;
    }

    public Individual(){};

    public boolean isLlegoTarde() {
        return llegoTarde;
    }

    public void setLlegoTarde(boolean llegoTarde) {
        this.llegoTarde = llegoTarde;
    }
    
    public String llegadaTarde(){
        String mensaje= "";
        if (llegoTarde) {
            mensaje = "Si llego tarde";
            
        }
        else{
            mensaje="No llego tarde";
        }
        return mensaje;
    }

    @Override
    public String toString() {
        return "Individual: " + " Dia y hora: " + diaHora + " ,  Materia: "+ materia + " , Costo Base: " + costoBase +" , " + llegadaTarde();
    }
    
    @Override
    
    public float costoClase(){
        float costo= super.getCostoBase();
        if (llegoTarde) {
            costo=(float) (super.getCostoBase()*1.20);
            
        }
        return costo;
    }
    
}
