/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioTestParametrizados;

/**
 *
 * @author josem
 */

    public class CalculadoraP {
     // Atributos de la clase
   private double numero1, numero2;

    public CalculadoraP(double numero1, double numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    }

    // sets and gets

    public void setNumero1(double numero1) {
        this.numero1=numero1;
    }
    public void setNumero2(double numero2) {
        this.numero2=numero2;
    }

    public double getNumero1(){
        return numero1;
    }
    public double getNumero2(){
        return numero2;
    }

    //métodos

    public double suma() {
        double suma=numero1+numero2;
        return suma;
    }

    public double resta() {
        double resta=numero1-numero2;
        return resta;
    }

    public double multiplicacion(){
        double multiplicacion=numero1*numero2;
        return multiplicacion;
    }
    public double division() {
        double division=numero1/numero2;
        return division;
    }

}

