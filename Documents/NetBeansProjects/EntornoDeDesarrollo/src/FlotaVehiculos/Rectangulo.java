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
public class Rectangulo {
    private int lado1;
    private int lado2;
    private int area;
    private int perimetro;

    public Rectangulo(int lado1,int lado2) {
        this.lado1=lado1;
        this.lado2=lado2;
        this.area=lado1*lado2;
        this.perimetro=(lado1+lado2)*2;
    }

    
    
}
