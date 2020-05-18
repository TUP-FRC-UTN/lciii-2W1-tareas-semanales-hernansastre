
package tareaherencia;


public class ClientePreferencial extends Cliente{
    
    private double saldo;
    private double limite;
    private String domicilio;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public ClientePreferencial(String nombre, int numero, int telefono) {
        super(numero, nombre, telefono);
       
    }
    
    @Override
    public String toString() {
        return super.toString()+ "ClientePreferencial{" + "saldo=" + saldo + ", limite=" + limite + ", domicilio=" + domicilio + '}';
    }
    
    
    
    
    
}
