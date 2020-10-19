/*
 * Nombre                Carné
 * Emmanuel Antonio    2000196
 *
 * 
 */
package uspg.edu.gt;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
   public static List<FacturaEncabezado> listFacturaEncabezado = new ArrayList();
public static List<FacturaDetalle> listFacturaDetalle = new ArrayList();
  
   //FacturaEncabezado FacturaObjeto= new FacturaEncabezado();
/**
 *
 * @author Emmanuel Zapata
 */

    public static void main(String[] args) {
      int opcion;
        double total=0;
        
Scanner in = new Scanner(System.in);
do {

            System.out.println("Menu");
            System.out.println("1. Grabar");
            System.out.println("2. Mostrar");
            System.out.println("3. salir");
            opcion = in.nextInt();
            switch (opcion) {
                case 1:

                    System.out.println("Ingrese Serie");
                    int Serie = in.nextInt();
                    System.out.println("Ingrese Numero");
                    int Numero = in.nextInt();
                    System.out.println("Ingrese Fecha");
                    String Fecha = in.next();
                    System.out.println("Ingrese Nombre");
                    String Nombre = in.next();
                    System.out.println("Ingrese Direcciòn ");
                    String Direccion = in.next();
                    System.out.println("Ingrese Nit");
                    int Nit = in.nextInt();
                    
              listFacturaEncabezado.add(new FacturaEncabezado(Serie,Numero,Fecha,Nombre,Direccion,Nit));
                    
              int opcion1=0;
              
              
                    do{
                    System.out.println("desea agergar detalles de factura");
                    System.out.println("1. si");
                    System.out.println("2. no");  
                   opcion1 = in.nextInt();
                   
                    switch (opcion1) {
                            
                    case 1:  
                        
                        System.out.println("desea agergar detalles de factura");
                     System.out.println("1. si");
                     System.out.println("2. no");  
                    opcion1 = in.nextInt();
              
             
                    System.out.println("Ingrese Cantidad ");
                    int Cantida= in.nextInt();
                    System.out.println("Ingrese Descripcion");
                    String Descripcion = in.next();
                    System.out.println("Ingrese Valor");
                    double valor = in.nextDouble();
                    
                    //double total = in.nextDouble();
                    
                    listFacturaDetalle.add(new FacturaDetalle(Cantida ,Descripcion, valor,total));
                    }}
                    while(opcion1!=1);
           // String Cantida = "null";
            //String Descripcion = "null";
            //String valor = "null";
            //String total = "null";
            //listFacturaDetalle.add(new FacturaDetalle(Cantida ,Descripcion, valor,total));
            
                    break;
                    
                case 2:
                    
                   
                    int d = 1;
                    for (FacturaEncabezado fac : listFacturaEncabezado) {
                   System.out.println("===============================================");
                    System.out.println("Encabezado de Factura");
                    
                  
      //2
                    for (FacturaDetalle fact : listFacturaDetalle) {
                        
                     System.out.println("Serie:  "+fac.getSerie()+"\nNumero:  "+ fac.getNumero()+
                            "\nFecha:  "+ fac.getFecha()+"\nNombre:  "+ fac.getNombre()+
                            "\nDireccion:  "+ fac.getDireccion()+"\n Nit:  "+ fac.getNit()+"\n Total:  "+ fact.gettotal());
                    System.out.println("===============================================");
                    System.out.println("Detalle de Factura");
                    System.out.println("Cantidad:\t"+fact.getCantida());
                    System.out.println("Descripciòn:\t"+ fact.getDescripccion());
                    System.out.println("Valor:\t  " + fact.getValor());
                    System.out.println("total:\t " + fact.gettotal());
                    d++;
                  
                    }}
                    
                    System.out.println("===============================================");
                 break;
    }
        } while (opcion != 4);

    }

}
