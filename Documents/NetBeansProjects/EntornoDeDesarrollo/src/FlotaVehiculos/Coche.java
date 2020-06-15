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
public class Coche extends Vehiculos {

    private String matricula;
    private String carburante;
    private String potencia;
    private int cilindrada;//En caso de Coche electrico la cilindrada es 0.
    private int npuertas;
    private int plazas;

    public Coche(String matricula, String carburante, String potencia, int cilindrada, int npuertas, int plazas, String marca, String modelo, String nref, int nruedas, String color) {
        super(marca, modelo, nref, nruedas, color);
        this.matricula = matricula;
        this.carburante = carburante;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.npuertas = npuertas;
        this.plazas = plazas;
    }

    public Coche() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCarburante() {
        return carburante;
    }

    public void setCarburante(String carburante) {
        this.carburante = carburante;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getNpuertas() {
        return npuertas;
    }

    public void setNpuertas(int npuertas) {
        this.npuertas = npuertas;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

}
