/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlotaVehiculos;

/**
 *
 * @author JoseManuel
 */
public class Garaje {

    private String direccion;
    private double m2;
    private int plazas;
    private Coche[] coches;

    public Garaje(String direccion, double m2, int plazas, Coche[] coches) {
        this.direccion = direccion;
        this.m2 = m2;
        this.plazas = plazas;
        this.coches = coches;
    }

    public Garaje(String direccion, double m2, int plazas) {
        this.direccion = direccion;
        this.m2 = m2;
        this.plazas = plazas;
        this.coches = new Coche[plazas];
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

    /*private Coche coche1;
    private Coche coche2;
    private Bicicleta bici1;
    private Bicicleta bici2;

    public Garaje(String direccion, double m2, Coche coche1, Coche coche2, Bicicleta bici1, Bicicleta bici2) {
        this.direccion = direccion;
        this.m2 = m2;
        this.coche1 = coche1;
        this.coche2 = coche2;
        this.bici1 = bici1;
        this.bici2 = bici2;
    }

    public Garaje() {
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

    public Coche getCoche1() {
        return coche1;
    }

    public void setCoche1(Coche coche1) {
        this.coche1 = coche1;
    }

    public Coche getCoche2() {
        return coche2;
    }

    public void setCoche2(Coche coche2) {
        this.coche2 = coche2;
    }

    public Bicicleta getBici1() {
        return bici1;
    }

    public void setBici1(Bicicleta bici1) {
        this.bici1 = bici1;
    }

    public Bicicleta getBici2() {
        return bici2;
    }

    public void setBici2(Bicicleta bici2) {
        this.bici2 = bici2;
    }*/

    
}
