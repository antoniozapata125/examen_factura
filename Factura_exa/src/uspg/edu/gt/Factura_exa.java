/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu.gt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Emmanuel Zapata
 */
public class Factura_exa { 
      public static List<FacturaEncabezado> datosfac = new ArrayList();
      public static Scanner input = new Scanner (System.in);
    private static Object datosFac;
   
       
    public static void main(String[] args) {
        //Scanner input = new Scanner (System.in);
        //List<FacturaEncabezado> datosfac = new ArrayList();
       int serie;
       int numero;
       String fecha;
       String nombre;
       String direccion;
       int Nit;
       char ingresar = 'n';
       int opcion;
       
       do{ 
           
       
           System.out.println("****************************************************************");
           System.out.println("********* Bienvenidos a nuestro registro de facturacion ********");
           System.out.println("*** Seleccione la siguiente opcion para completar la factura ***");
           System.out.println("****************************************************************");
           System.out.println("");
           System.out.println("****************************************************************");
           System.out.println("************ Desea grabar los datos de la factura **************");
           System.out.println("****************************************************************");
           System.out.println("");
           System.out.println("****************************************************************");
           System.out.println("************* Desea Mostrar los datos de la Factura ************");
           System.out.println("****************************************************************");
          opcion=input.nextInt();
          
           switch (opcion){
           
           case 1:
             System.out.println("****************************************************************************");
             System.out.println("************* Desea Ingresar datos nuevos a la factura  Factura ************");                                   
             System.out.println("****************************************************************************");
             System.out.println("");
             do { 
             System.out.println("**************************");
             System.out.println("**** Ingrese la serie ****");
             System.out.println("**************************");
             serie= input.nextInt();
             System.out.println("************************************");
             System.out.println("**** Ingre numero de la factura ****");
             System.out.println("************************************");
             numero= input.nextInt();
             System.out.println("****************************");
             System.out.println("***** Ingrese la fecha *****");
             System.out.println("****************************");
             fecha =input.next();
             System.out.println("*********************************************");
             System.out.println("*****  Ingrese el nombre del consumidor *****");
             System.out.println("*********************************************");
             nombre=input.next();
             System.out.println("***********************************************");
             System.out.println("***** Ingrese la direccion del consumidor *****");
             System.out.println("***********************************************");
             direccion=input.nextLine();
             System.out.println("***********************************");
             System.out.println("***** Ingre el Nit del Cliente ****");
             System.out.println("***********************************");
             Nit=input.nextInt();
             
             datosFac.add(new FacturaEncabezado(serie, numero, fecha, nombre ,direccion, Nit));
               System.out.println("*******************************************");                
               System.out.println("***** Desea agregar mas datos Si o No *****");
               System.out.println("*******************************************");   
                 ingresar=input.next().charAt(0);
                 } while (ingresar == 's');
                 break;
           
           case 2:
               System.out.println("***************************************");
               System.out.println("***** Ingresa datos en la factura *****");
               System.out.println("***************************************");
               
           System.out.println("serie\t"+" numero\t"+"fecha\"+"t"nombre\t"+"\t"+"direccion\t"+"Nit\t"+");"
              
        for (FacturaEncabezado FacturaEncabezado:datosFac){ 
            System.out.println("FacturaEncabezado.getserie()+\\t"+"+FacturaEncabezado.getnumero()+\\t"+"FacturaEncabezado.getnombre()+\\t"+"FacturaEncabezado.getdireccion()+\\t"+"FacturaEncabezado.getNit()+\\t"+"());
    }
          break;
    }  

     
} while(opcion !=3);
 }
    }

       
    


