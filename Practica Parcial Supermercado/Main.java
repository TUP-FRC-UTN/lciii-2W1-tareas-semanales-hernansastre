
package Principall;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de ofertas a cargar: ");
        int tam=sc.nextInt();
        Folleto f=new Folleto(tam);
        
        for (int i = 0; i < tam; i++) {
            System.out.println("Ingrese numero producto de oferta "+i+":");
            int nroProducto=sc.nextInt();
            System.out.println("Ingrese nombre producto de oferta "+i+":");
            sc.nextLine();
            String nombreProducto=sc.nextLine();
            System.out.println("Ingrese precio regular del producto: ");
            double precioRegular=sc.nextDouble();
            System.out.println("Ingrese precio de oferta del producto: ");
            double precioOferta=sc.nextDouble();
            System.out.println("Ingrese cantidad dias de vigencia de oferta "+i+":");
            int cantDiasVigencia=sc.nextInt();
            System.out.println("Ingrese stock producto: ");
            int stock=sc.nextInt();
            
            Oferta o = new Oferta(nroProducto, nombreProducto, precioRegular, precioOferta, cantDiasVigencia, stock); 
            f.agregarOferta(o);
            
    }
        
        System.out.println("Cantidad de artículos ofertados por más de 5 días: "+ f.cantArticOfertadosPorMas5Dias());
        System.out.println("Total de unidades que hay a la venta: "+f.unidadesEnVenta());
        System.out.println("Cantidad de artículos ofrecidos con un descuento superior a $20: "+f.cantDescuentoMayorA20());
        System.out.println("Ingrese codigo de articulo para calcular total a recaurdar: ");
        int codigo=sc.nextInt();
        System.out.println("Total a recaudar segun codigo: " + f.totalRecaudar(codigo));
     
        
        
    
        
        
}
}
