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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        String nombres[] = new String[16];
        String tablero[][] = new String[4][4];
        int intentos = 2;
        nombres[0] = "Fernando";
        nombres[1] = "Fran";
        nombres[2] = "Javi";
        nombres[3] = "Jorge";
        nombres[4] = "Ruben";
        nombres[5] = "Laura";
        nombres[6] = "Maribel";
        nombres[7] = "Gema";
        nombres[8] = "Fernando";
        nombres[9] = "Fran";
        nombres[10] = "Javi";
        nombres[11] = "Jorge";
        nombres[12] = "Ruben";
        nombres[13] = "Laura";
        nombres[14] = "Maribel";
        nombres[15] = "Gema";
        int nombresAleat[] = new int[16];
        int num=0;
        int cont = 0;
        while (cont < 15) {//relleno un array auxiliar llamado nombresAleat aleatoriamente para elegir los nombres posteriormente
            num = (int) (Math.random() * 16);
            int k;
            for (k = 0; k < nombresAleat.length - 1; k++) {

                if (num == nombresAleat[k]) {
                    break;
                }
            }

            if (num != nombresAleat[k]) {
                nombresAleat[cont++] = num;
            }
        }

        int aux = 0;
        for (int i = 0; i < 4; i++) {//creo bucle for para introducir los nombres en el tablero
            for (int j = 0; j < 4; j++) {
                tablero[i][j] = nombres[nombresAleat[aux]];
                aux++;

            }
        }
        System.out.println("Bienvenido al juego de emparejar nombres.");
        System.out.println("Se le ha asignado un tablero con dimensiones: 4x4");
        System.out.println("El tablero con las palabras desordenadas queda:\n");
        for (int i = 0; i < 4; i++) {//muestro el tablero con los nombres
            for (int j = 0; j < 4; j++) {

                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }
        cont=0;
        boolean acierto = false;
        while (acierto != true) {
            System.out.println("\n¿Qué nombre quiere emparejar?:");

            String nombre = s.next();
            for (int i = 0; i < 4; i++) {

                for (int j = 0; j < 4; j++) {
                    if (nombre.equals(tablero[i][j])) {//Si el nombre introducido coincide con alguna de las posiciones del array, cambia esa valor por ACIERTO
                        tablero[i][j]="ACIERTO";
                        System.out.println("El nombre está en la posición " + i + " " + j);
                        cont++;
                        acierto = true;
                    }

                }
            }
            if(cont!=2){
            System.out.println("Le quedan " + intentos + " intentos");
            intentos--;
        }
            if(intentos==-1){
                System.out.println("\nNombre no encontrado");
               acierto=true;
            }
        }
        System.out.println("\n");
        if(cont==2){
        for (int i = 0; i < 4; i++) {//muestro el tablero con los nombres y en las posiciones donde se ha acertado
            for (int j = 0; j < 4; j++) {

                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }
            System.out.println("\nEligió correctamente el nombre en el intento "+ intentos+". Gracias por jugar.");
        }
    }

}
