package FlotaVehiculos;

/**
 *
 * @author JoseManuel
 */
public class Vehiculos {
    String marca;
    String modelo;
    String nref;//numero referencia
    int nruedas;//numero ruedas
    String color;

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
