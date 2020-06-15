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
public class Vehiculos {
    
    private String marca;
    private String modelo;
    private String nref;
    private int nruedas;
    private String color;

    public Vehiculos(String marca, String modelo, String nref, int nruedas, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.nref = nref;
        this.nruedas = nruedas;
        this.color = color;
    }

    public Vehiculos() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNref() {
        return nref;
    }

    public void setNref(String nref) {
        this.nref = nref;
    }

    public int getNruedas() {
        return nruedas;
    }

    public void setNruedas(int nruedas) {
        this.nruedas = nruedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
