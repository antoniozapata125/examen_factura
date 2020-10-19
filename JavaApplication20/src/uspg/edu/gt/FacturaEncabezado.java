/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu.gt;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Emmanuel Zapata
 */
public class FacturaEncabezado {
    int Serie;
    int Numero;
    String Fecha;
    String Nombre;
    String Direccion;
    int Nit;
    double total;
ArrayList FacturaDetalle = new ArrayList();
 
   
 
 
 FacturaEncabezado(int Serie, int Numero, String Fecha, String Nombre, String Direccion, int Nit) {
        this.Serie = Serie;
        this.Numero = Numero;
        this.Fecha = Fecha;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Nit = Nit;
        this.total = total;
    }





    FacturaEncabezado() {
       //public static List<FacturaDetalle> listFacturaDetalle = new ArrayList();
    }

     
   // FacturaEncabezado FacturaDetalle = new FacturaEncabezado();
 
    
    public int getSerie() {
        return Serie;
    }

    public void setSerie(int Serie) {
        this.Serie = Serie;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getNit() {
        return Nit;
    }

    public void setNit(int Nit) {
        this.Nit = Nit;
    }

    public double gettotal() {
        return total;
    }

    public void settotal(double total) {
        this.total = total;
    }



    }

    
    



