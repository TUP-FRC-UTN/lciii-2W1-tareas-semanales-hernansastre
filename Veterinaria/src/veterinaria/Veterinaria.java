package veterinaria;

import java.util.Scanner;

public class Veterinaria {

  
    public static void main(String[] args) {
       Clientes[] cliente;
       
       
       Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese cantidad de clientes a cargar: ");
        int cantidad =sc.nextInt();
        
        cliente = new Clientes[cantidad];
        
        for (int i = 0; i < cliente.length; i++) {
            System.out.println("Ingrese numero de cliente " + i + ":");
            int nroCliente=sc.nextInt();
            
            System.out.println("Ingrese nombre " + i + ":" );
            sc.nextLine();
            String nombre=sc.nextLine();
            
            System.out.println("Ingrese antiguedad " + i + ":");
            int antiguedad=sc.nextInt();
            
            System.out.println("Ingrese nombre de mascota " + i + ":");
            sc.nextLine();
            String nombreMascota=sc.nextLine();
            
            System.out.println("Ingrese edad de mascota " + i + ":");
            int edadMascota=sc.nextInt();
            
            cliente[i]=new Clientes(nroCliente, nombre, antiguedad, nombreMascota, edadMascota);
            
        }
        
        for (int i = 0; i < cliente.length; i++) {
            System.out.println(cliente[i]);
        }
        
        
        int cantMas5años=0;
        for (int i = 0; i < cliente.length; i++) {
            if (cliente[i].getAntiguedad()>=5) {
                cantMas5años++;
            }
            
        }
        
        int suma=0;
        double promedio=0;
        
        for (int i = 0; i < cliente.length; i++) {
            suma+=cliente[i].getEdadMascota();
            
        }
        
        promedio= (double) suma / cliente.length;
        
        
        System.out.println("Cantidad de clientes"+cliente.length);
        System.out.println("Clientes con antigueda mayor a 5 años: "+cantMas5años);
        System.out.println("Edad promedio de las mascotas: "+promedio);
    }
    
}
