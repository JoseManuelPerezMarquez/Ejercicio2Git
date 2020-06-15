/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garajes;

/**
 *
 * @author usuario
 */
public class Garage {
    
    
    // Atributos
    private String nombre;
    private String direccion;
    private double m2;
    private int plazas;
    private Coche[] coches ;

    // Constructores
    public Garage(String nombre, String direccion, double m2, int plazas, Coche[] coches) {
        this.nombre=nombre;
        this.direccion = direccion;
        this.m2 = m2;
        this.plazas = plazas;
        this.coches = coches;
    }
     
     public Garage(String nombre, String direccion, double m2, int plazas) {
        this.nombre=nombre;
        this.direccion = direccion;
        this.m2 = m2;
        this.plazas = plazas;
        this.coches = new Coche[plazas];
        
    }
     public Garage(){ }
     
     
     // Getters & Setters
    public String getNombre() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getM2() {
        return m2;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public Coche[] getCoches() {
        return coches;
    }

    public void setCoches(Coche[] coches) {
        this.coches = coches;
    }
    
     
     
     
}
