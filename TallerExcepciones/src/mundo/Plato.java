/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

/**
 *
 * @author Andom
 */
public class Plato {
    private String nombre;
    private String descripcion;
    private double costo;
    private int tiempoPreparacion;
    private tipoPlato tipoPlato;
    private int cantidad;
    
    public Plato(String nombre, String descripcion, double costo, int tiempoPreparacion, tipoPlato tipoPlato, int cantidad){
        this.nombre= nombre;
        this.descripcion= descripcion;
        this.costo= costo;
        this.tiempoPreparacion= tiempoPreparacion;
        this.tipoPlato= tipoPlato;
        this.cantidad= cantidad;
        
    }
    
    //getters

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public tipoPlato getTipoPlato() {
        return tipoPlato;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    public String obtenerInfo(){
        return "Nombre plato: " + nombre + ". Es un plato de: " + tipoPlato.name() + "." +
                "\nCosto unidad: " + costo + "." +
                "\nTiempo de preparación: " + tiempoPreparacion + " minutos" +
                "\nEncargó un total de: " + cantidad + " plato(s) de este tipo." + 
                "\nCosto en total (contando la cantidad que encargó): " + precioPlato();
        
    }
    public double precioPlato(){
        return cantidad*costo;
    }
    
    
    
}
