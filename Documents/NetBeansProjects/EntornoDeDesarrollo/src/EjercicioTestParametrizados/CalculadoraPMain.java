/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioTestParametrizados;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class CalculadoraPMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //objeto clase scanner
        Scanner sc= new Scanner(System.in);
        System.out.println(" Introduce primer numero de la calculadora: ");
        // metodo para leer un double por teclado
        double n1 = sc.nextDouble();
        System.out.println("Introduce el segundo numero de la calcualdora: ");
        double n2 = sc.nextDouble();
    
        // instancio un objeto de clase calculadora que he creado en archivo aparte con los dos numeros pasados
        CalculadoraP casio= new CalculadoraP(n1, n2);
        
        int operacion =0;
        do {
            System.out.println(" Introduce Operacion a realizar");
            System.out.println(" 1. suma \n 2. resta \n 3. multiplicacion \n 4. division \n 5. salir");
            // leo por teclado un entero como opción del menú
            operacion =sc.nextInt();
            // segun valor elegido ejecuto método del objeto claculadora
            switch ( operacion ){
            case 1: System.out.println( " la suma es "+ casio.suma() ); break;
            case 2: System.out.println( " la resta es "+ casio.resta() ); break;
            case 3: System.out.println(" la multipilcacion es "+ casio.multiplicacion()); break;
            case 4: System.out.println(" La division es " + casio.division()); break;
            default: System.out.println(" Debes elegir una opción de 1 a 5");
            }
    
        } while ( operacion != 5 );
        
        System.out.println(" Gracias por usar la calculadora...hasta luegooooorrr");
        
        sc.close();
    }

}
