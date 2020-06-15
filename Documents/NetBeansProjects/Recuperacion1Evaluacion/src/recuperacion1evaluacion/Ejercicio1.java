/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperacion1evaluacion;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int tamaño = 0, cantidad = 0;
        System.out.println("Bienvenido al programa para mejorar su caligrafía para la letra K");
        System.out.println("Escriba el tamaño de las letras (Valores admitidos:8,10):");
            tamaño = s.nextInt();
        while (tamaño != 8&&tamaño!=10) {
            System.out.println("Escriba el tamaño de las letras (Valores admitidos:8,10):");
            tamaño = s.nextInt();
        }
        System.out.println("Escriba la cantidad de letras a imprimir(Valores admitidos:2,3,4):");
        cantidad = s.nextInt();
        while (cantidad != 2&&cantidad!=3&&cantidad!=4) {
            System.out.print("Escriba la cantidad de letras a imprimir(Valores admitidos:2,3,4):");
            cantidad = s.nextInt();
        }
        int aux=0;
        while(aux!=cantidad){//mientras aux no sea igual a la cantidad de veces que se repite la letra, la genera hasta que se cumpla la condicion
        if(tamaño==8){
            int espacios = tamaño - 5;
        for (int i = 0; i < tamaño; i++) {
            System.out.print("*");
            if(i<3){
            for (int j = 0; j < espacios; j++) {
                
                System.out.print(" ");
                }
            }
            if(i>3){
                
            for (int j = 0; j < espacios; j++) {
                
                    
                    System.out.print(" ");
                }
            }
            System.out.print("*");
            System.out.println("");
            if(i<3){
            espacios--;
            }else if(i>3){
                espacios++;
            }
        }
        }
        if(tamaño==10){
             int espacios = tamaño - 6;
        for (int i = 0; i < tamaño; i++) {
            System.out.print("*");
            if(i<4){
            for (int j = 0; j < espacios; j++) {
                
                System.out.print(" ");
                }
            }
            if(i>4){
                
            for (int j = 0; j < espacios; j++) {
                
                    
                    System.out.print(" ");
                }
            }
            System.out.print("*");
            System.out.println("");
            if(i<4){
            espacios--;
            }else if(i>4){
                espacios++;
            }
        }
        }
            System.out.print("\n\n");
        aux++;
        }

    }
}
