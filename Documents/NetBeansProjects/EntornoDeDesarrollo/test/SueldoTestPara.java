/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Gestion_empleado.Empleado;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author profesor
 */
@RunWith (value = Parameterized.class)

public class SueldoTestPara {
    
    private String nombre;
    private String apellidos;
    private  int edad;
    private char categoria; 
    private int nHijos; 
    private int nIngles; 
    private int antiguedad;
    private double esperado;

    public SueldoTestPara(String nombre, String apellidos, int edad, char categoria, int nHijos, int nIngles, int antiguedad, double esperado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.categoria = categoria;
        this.nHijos = nHijos;
        this.nIngles = nIngles;
        this.antiguedad = antiguedad;
        this.esperado = esperado;
    }
    
    @Parameters
    
    public static Collection<Object[]>  parametros(){
        
        Object[][] datos = new Object[][] {
            {"Juan", " García Pérez", 41,'B',5,2,8,2000},
            {"José", " Fernández Prado", 25,'A',0,3,3,2500},
            {"Alberto","Martín García",34,'C',1,3,5,1650},
            {"Jorge", " Martín Cabello",27,'A',1,3,5,2750}
        };
        return Arrays.asList(datos);
                
    }

    @Test
    
     public void TestSueldo(){
         Empleado instancia = new Empleado(this.nombre, this.apellidos,this.edad,this.categoria,this.nHijos ,this.nIngles,this.antiguedad);
       
      Assert.assertEquals( " El sueldo no coincide con el esperado" , this.esperado, instancia.sueldoBase(), 0.001);
         
     } 
   
}





/*

  {"Juan", " García Pérez", 41,'B',5, 2,8,2200},
  {"José", " Fernández Prado", 25,'A',0,3,3,2500},
  {"Alberto","Martín García",34,'C',1,3,5,1650}

*/