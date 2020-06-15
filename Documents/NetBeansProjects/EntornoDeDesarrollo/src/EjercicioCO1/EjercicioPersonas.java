/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioCO1;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class EjercicioPersonas {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Persona per1 = new Persona("", "", 0, "", 0, 0);
        Persona per2 = new Persona("", "", 0, "", 0, 0);
        Persona per3 = new Persona("", "", 0, "", 0, 0);
        System.out.println("Introduce el nombre");
        per1.setNombre(s.nextLine());
        System.out.println("Introduce los apellidos");
        per1.setApellidos(s.nextLine());
        System.out.println("Introduce el sexo");
        per1.setSexo(s.nextLine());
        System.out.println("Introduce la edad");
        per1.setEdad(s.nextInt());
        System.out.println("Introduce la altura");
        per1.setAltura(s.nextDouble());
        System.out.println("Introduce el peso");
        per1.setPeso((int) s.nextDouble());
        s.nextLine();
        System.out.println("--------------------");
        System.out.println("Introduce el nombre");
        per2.setNombre(s.nextLine());
        System.out.println("Introduce los apellidos");
        per2.setApellidos(s.nextLine());
        System.out.println("Introduce el sexo");
        per2.setSexo(s.nextLine());
        System.out.println("Introduce la edad");
        per2.setEdad(s.nextInt());
        System.out.println("Introduce la altura");
        per2.setAltura(s.nextDouble());
        System.out.println("Introduce el peso");
        per2.setPeso((int) s.nextDouble());
        s.nextLine();
        System.out.println("-----------------------");
        System.out.println("Introduce el nombre");
        per3.setNombre(s.nextLine());
        System.out.println("Introduce los apellidos");
        per3.setApellidos(s.nextLine());
        System.out.println("Introduce el sexo");
        per3.setSexo(s.nextLine());
        System.out.println("Introduce la edad");
        per3.setEdad(s.nextInt());
        System.out.println("Introduce la altura");
        per3.setAltura(s.nextDouble());
        System.out.println("Introduce el peso");
        per3.setPeso((int) s.nextDouble());
        System.out.println("--------------------------------");
        per1.setSexo(per1.sexo());
        per2.setSexo(per2.sexo());
        per3.setSexo(per3.sexo());
        System.out.println(per1.toString());
        if (per1.mayorE()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
        if (per1.imc() == -1) {
            System.out.println("Peso bajo");

        } else if (per1.imc() == 0) {
            System.out.println("Peso adecuando");
        } else {
            System.out.println("Sobre peso");
        }
        System.out.println("------------------------");
        System.out.println(per2.toString());
        if (per2.mayorE()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
        if (per2.imc() == -1) {
            System.out.println("Peso bajo");

        } else if (per2.imc() == 0) {
            System.out.println("Peso adecuando");
        } else {
            System.out.println("Sobre peso");
        }
        System.out.println("----------------------------");
        System.out.println(per3.toString());
        if (per3.mayorE()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
        if (per3.imc() == -1) {
            System.out.println("Peso bajo");

        } else if (per3.imc() == 0) {
            System.out.println("Peso adecuando");
        } else {
            System.out.println("Sobre peso");
        }

    }

}
