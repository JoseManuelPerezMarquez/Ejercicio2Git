/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlotaVehiculos;

import java.util.Scanner;

/**
 *
 * @author JoseManuel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Coche miPeugeot = new Coche("6776JHL", "Gasoil", "112CV", 1600, 5, 5, "Peugeot", "3008", "VFRTDSDR00798UJ", 4, "Gris");
        Coche miAudi = new Coche("5453AXM", "Gasoil", "600CV", 1600, 5, 5, "Audi", "R8", "VFRTDSDR00798UJ", 4, "Rojo");

        Bicicleta miScott = new Bicicleta(29, "Aluminio reforzado", "Biplato 38-24 Shimano XT", 9);
        Bicicleta miOrbea = new Bicicleta(29, "Aluminio reforzado", "Monoplato 36 Shimano XT", 11);

        Garaje miGaraje = new Garaje("Plaza España,5 ", 120, 6);

        //Coche[] misCoches= new Coche[miGaraje.getPlazas()];
        //misCoches[0]=miPeugeot;
        //misCoches[1]=miAudi;
        //miGaraje.setCoches(misCoches);
        for (int i = 0; i < miGaraje.getPlazas(); i++) {
            miGaraje.getCoches()[i] = new Coche();
            System.out.println("Introduce la marca del coche: " + (i + 1));
            miGaraje.getCoches()[i].setMarca(s.nextLine());
            System.out.println("Introduce la modelo del coche: " + (i + 1));
            miGaraje.getCoches()[i].setModelo(s.nextLine());

        }
    }

}

/*System.out.println("Los coches de mi garaje son: ");
        
        Coche[] misCochesT;
        misCochesT=miGaraje.getCoches();
       
        System.out.println(misCochesT[0].getMarca()+" "+misCochesT[0].getModelo());
        System.out.println(misCochesT[1].getMarca()+" "+misCochesT[1].getModelo());
        
        System.out.println(miGaraje.getCoches()[0].getMarca()+" "+miGaraje.getCoches()[0].getModelo());
        System.out.println(miGaraje.getCoches()[1].getMarca()+" "+miGaraje.getCoches()[1].getModelo());*/
 /*Garaje miGaraje = new Garaje("Plaza España, 2", 120, miPeugeot, miAudi, miScott, miOrbea);
        Garaje miGaraje2 = new Garaje("Avda. Los Palacios, 34", 60, new Coche("1289TPM", "Electrico", "100 KW", 0, 5, 5, "Mercedes", "EQC", "DASGDVASDIASYDIAID", 4, "Negro Mate"), null, null, null);

        System.out.println("La direccion de mi Garaje 1 es: " + miGaraje.getDireccion());
        System.out.println("El coche 1 de mi Garaje 1 es un : " + miGaraje.getCoche1().getMarca() + " " + miGaraje.getCoche1().getModelo());
        System.out.println("El coche 2 de mi Garaje 1 es un : " + miGaraje.getCoche2().getMarca() + " " + miGaraje.getCoche2().getModelo());

        System.out.println("La direccion de mi Garaje 2 es: " + miGaraje2.getDireccion());
        System.out.println("El coche 1 de mi Garaje 2 es un : " + miGaraje2.getCoche1().getMarca() + " " + miGaraje2.getCoche1().getModelo());*/
