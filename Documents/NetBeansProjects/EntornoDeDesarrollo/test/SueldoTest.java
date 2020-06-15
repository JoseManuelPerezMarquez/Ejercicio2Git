/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Gestion_empleado.Empleado;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author profesor
 */
public class SueldoTest {
    
    
    
    public SueldoTest() {
    }
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    
     public void TestSueldo(){
         Empleado instancia = new Empleado("Juan", "García Ruiz",32,'B', 1 , 2, 6);
         double esperado = 2100;
       
      Assert.assertEquals( " El sueldo no coincide con el esperado" , esperado, instancia.sueldoBase(), 0.0);
         
     } 
   
}





