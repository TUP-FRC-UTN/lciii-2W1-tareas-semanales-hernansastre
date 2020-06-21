package models;

public abstract class Clase {
    
    protected String diaHora;
    protected String materia;
    protected float costoBase;

    public Clase(String diaHora, String materia, float costoBase) {
        this.diaHora = diaHora;
        this.materia = materia;
        this.costoBase = costoBase;
    }
    
    public Clase(){};

    public String getDiaHora() {
        return diaHora;
    }

    public void setDiaHora(String diaHora) {
        this.diaHora = diaHora;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public float getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(float costoBase) {
        this.costoBase = costoBase;
    }

    @Override
    public String toString() {
        return "Clase{" + "diaHora=" + diaHora + ", materia=" + materia + ", costoBase=" + costoBase + '}';
    }
    
    public abstract float costoClase();
    
    
}
