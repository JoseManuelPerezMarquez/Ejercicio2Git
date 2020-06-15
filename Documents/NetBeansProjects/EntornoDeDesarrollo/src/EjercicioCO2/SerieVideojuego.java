/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioCO2;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class SerieVideojuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];
        String Inttitulo;
        String Intgenero;
        String Intcreador;
        String Intcompañia;
        int primeraLibre;
    
        int op;
        int cont = 1;
        for (int j = 0; j < 5; j++) {
            series[j] = new Serie();
        }
        for (int i = 0; i < 5; i++) {
            videojuegos[i] = new Videojuego();
        }
        boolean salir = false;
        while (!salir == true) {
            System.out.println("1-Introducir series\n2-Introducir videojuegos\n3-Mostrar todas las series y los videojuegos\n4-Alquilar series \n5-alquilar videojuegos\n6-Contar cuantas series y videojuegos hay alquilados\n7-Devolver serie\n8-Devolver videojuego\n9-Serie con mas temporadas\n10-Videojuegos con mas horas\n11-Salir");
            System.out.println("Introduce una opcion");
            op = s.nextInt();
            switch (op) {
                case 1:

                    primeraLibre = -1;
                    do {
                        primeraLibre++;
                    } while (!((series[primeraLibre].getTitulo()).equals("LIBRE")));
                    System.out.println("Introduce 5 series");

                    for (int i = 0; i < 5; i++) {
                        System.out.println("Serie " + cont);
                        System.out.print("Título: ");
                        Inttitulo = s.next();
                        series[i].setTitulo(Inttitulo);
                        
                        System.out.print("Género: ");
                        Intgenero = s.next();
                        series[i].setGenero(Intgenero);
                        System.out.print("Creador: ");
                        Intcreador = s.next();
                        series[i].setCreador(Intcreador);
                        cont++;
                    }
                    break;

                case 2:
                    cont = 1;
                    primeraLibre = -1;
                    do {
                        primeraLibre++;
                    } while (!((videojuegos[primeraLibre].getTitulo()).equals("LIBRE")));
                    System.out.println("Introduce 5 Videojuegos");

                    for (int i = 0; i < 5; i++) {
                        System.out.println("Videojuego " + cont);
                        System.out.print("Título: ");
                        Inttitulo = s.next();
                        videojuegos[i].setTitulo(Inttitulo);
                        
                        System.out.print("Género: ");
                        Intgenero = s.next();
                        videojuegos[i].setGenero(Intgenero);
                        System.out.print("Compañía: ");
                        Intcompañia = s.next();
                        videojuegos[i].setCompañia(Intcompañia);
                        cont++;
                    }
                    break;

                case 3:
                    cont=1;
                    System.out.println("SERIES: ");
                    for (int i = 0; i < 5; i++) {
                        if ((series[i].getTitulo()).equals("LIBRE")) {

                        } else {
                            System.out.println("Serie "+cont);
                            System.out.println(series[i].toString());
                            cont++;
                        }
                    }
                    cont=1;
                    System.out.println("VIDEOJUEGOS: ");
                    for (int j = 0; j < 5; j++) {
                        if ((videojuegos[j].getTitulo()).equals("LIBRE")) {

                        } else {
                            System.out.println("Videojuego "+cont);
                            System.out.println(videojuegos[j].toString());
                            cont++;
                        }
                    }
                    break;
                case 4:
                    int alq;
                    System.out.println("¿Qué serie desea alquilar?(opcion del 1 al 5)");
                    alq = s.nextInt();

                    for (int i = 0; i < 5; i++) {
                        if (i == alq - 1) {
                            series[i].alquilar(i);
                            System.out.println("Usted ha alquilado la serie " + series[i].getTitulo());
                        } else {

                        }
                    }

                    break;
                case 5:
                    int alqV;
                    System.out.println("¿Qué videojuego desea alquilar?(opcion del 1 al 5)");
                    alqV = s.nextInt();

                    for (int i = 0; i < 5; i++) {
                        if (i == alqV - 1) {
                            videojuegos[i].alquilar(i);
                            System.out.println("Usted ha alquilado la videojuego " + videojuegos[i].getTitulo());
                        } else {

                        }
                    }

                    break;
                case 6:
                    System.out.println("Las series alquiladas o no son las siquientes");
                    int alquilarS = 0;
                    for (int i = 0; i < 5; i++) {
                        System.out.print(series[i].getTitulo());
                           series[i].esEntregado(alquilarS);
                       
                    }
                    System.out.println("Los videojuegos alquilados o no son los siguientes");
                    int alquilarVJ=0;
                    for (int j = 0; j <5; j++) {
                        System.out.print(videojuegos[j].getTitulo());
                        
                        videojuegos[j].esEntregado(alquilarVJ);
                    }
                    

                    break;
                case 7:
                    int devS;
                    System.out.println("¿Qué serie desea devolver?(opcion del 1 al 5)");
                    devS = s.nextInt();
                    
                    for (int i = 0; i < 5; i++) {
                        if (i == devS - 1) {
                            series[i].devolver(i);
                            System.out.println("Usted ha devuelto la serie " + series[i].getTitulo());
                        } else {

                        }
                    }
                    

                    break;
                case 8:
                    int devVJ;
                    System.out.println("¿Qué serie desea devolver?(opcion del 1 al 5)");
                    devVJ = s.nextInt();
                    
                    for (int i = 0; i < 5; i++) {
                        if (i == devVJ - 1) {
                            series[i].devolver(i);
                            System.out.println("Usted ha devuelto la serie " + series[i].getTitulo());
                        } else {

                        }
                    }
                    
                    
                    break;
                case 9:
                    int tempmayor=Integer.MIN_VALUE;
                    String temporadamayor="";
                    System.out.print("La serie con más temporadas es: ");
                    for (int i = 0; i <5; i++) {
                        if(series[i].getTemporadas()>tempmayor){
                            temporadamayor=series[i].getTitulo();
                        }
                    }                            
                    System.out.println(temporadamayor);

                    
                    break;
                case 10:
                    int hmayor=Integer.MIN_VALUE;
                    String horasmayor="";
                    System.out.print("El videojuego con más horas estimadas es: ");
                    for (int i = 0; i <5; i++) {
                        if(videojuegos[i].getHorasestimadas()>hmayor){
                            horasmayor=videojuegos[i].getTitulo();
                        }
                    }
                    System.out.println(horasmayor);
                    
                    break;
                case 11:
                    System.out.println("Hasta pronto");
                    salir = true;

                    break;
                default:
                    System.out.println("Introduce una opcion válida");
                    break;

            }

        }
    }

}
