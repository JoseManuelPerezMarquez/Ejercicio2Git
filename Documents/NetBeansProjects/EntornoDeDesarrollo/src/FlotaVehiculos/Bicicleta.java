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
public class Bicicleta extends Vehiculos {

    private int pulgadas;
    private String mcuadro;
    private String transmision;
    private int npiñones;

    public Bicicleta(int pulgadas, String mcuadro, String transmision, int npiñones, String marca, String modelo, String nref, int nruedas, String color) {
        super(marca, modelo, nref, nruedas, color);
        this.pulgadas = pulgadas;
        this.mcuadro = mcuadro;
        this.transmision = transmision;
        this.npiñones = npiñones;
    }
    
    public Bicicleta(int pulgadas, String material, String transmision, int npiñones) {
        this.pulgadas = pulgadas;
        this.mcuadro = material;
        this.transmision = transmision;
        this.npiñones = npiñones;
    }

    

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getMaterial() {
        return mcuadro;
    }

    public void setMaterial(String material) {
        this.mcuadro = material;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public int getNpiñones() {
        return npiñones;
    }

    public void setNpiñones(int npiñones) {
        this.npiñones = npiñones;
    }

    
}
