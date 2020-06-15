/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import EjercicioCO1.Persona;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josem
 */
public class CO1Test {
  private Persona objetoPer = new Persona("", "", 0, "", 0, 0);
  public CO1Test(){
      
  }   
  @BeforeClass
  public static void setUpClass(){
      System.out.println("Comienzan los tests........");
      System.out.println("");
  }
  @AfterClass
  public static void tearDownClass(){
      System.out.println("Fin de los tests.....");
      System.out.println("-------------------------");
  }
  @Before
  public void setUp(){
      System.out.println("Comineza el test...");
      System.out.println("");
  }
  @After
  public void tearDawn(){
      System.out.println("Finaliza test....");
      System.out.println("");
  }
    @Test
            //imc de sobre peso
    public void testIMC(){
        System.out.println("Test IMC");
        objetoPer.setAltura(1.70);
        objetoPer.setPeso(90);
        double espResult = 1;
        Assert.assertEquals(1, objetoPer.imc(), 0.0);
    }
    @Test
    // es mayor de edad
    public void testMayorE(){
        System.out.println("Inicando test edad");
        objetoPer.setEdad(21);
        boolean espResult = true;
        Assert.assertEquals(espResult, objetoPer.mayorE());
    }
    @Test
    //no es mayor de edad
    public void testNMayorE(){
        System.out.println("Inicando test edad");
        objetoPer.setEdad(17);
        System.out.println(objetoPer.mayorE());
        boolean espResult = false;
        Assert.assertEquals(espResult, objetoPer.mayorE());
    }
    @Test
    //sexo hombre
    public void testSexoH(){
        System.out.println("Iniciando teste sexo hombre");
        objetoPer.setSexo("H");
        String espResult = "H";
        Assert.assertEquals(espResult, objetoPer.sexo());
    }
     @Test
    //sexo mujer
    public void testSexoM(){
        System.out.println("Iniciando teste sexo hombre");
        objetoPer.setSexo("M");
        String espResult = "M";
        Assert.assertEquals(espResult, objetoPer.sexo());
    }
     @Test
    //sexo hombre
    public void testSexoV(){
        System.out.println("Iniciando teste sexo hombre");
        objetoPer.setSexo("V");
        String espResult = "H";
        Assert.assertEquals(espResult, objetoPer.sexo());
    }
    
    
}