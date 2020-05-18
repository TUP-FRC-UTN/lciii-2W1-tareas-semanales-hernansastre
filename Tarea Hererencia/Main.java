package tareaherencia;

public class Main {

    
    public static void main(String[] args) {
        
        Cliente c = new Cliente(1, "Hernan", 1233);
        System.out.println(c);
        
        ClientePreferencial c2= new ClientePreferencial("Franco",2, 1234);
        c2.setSaldo(2200);
        c2.setLimite(5000);
        c2.setDomicilio("Agustin Garzon 3700");
        
        System.out.println(c2);
        
      
    }
    
}
