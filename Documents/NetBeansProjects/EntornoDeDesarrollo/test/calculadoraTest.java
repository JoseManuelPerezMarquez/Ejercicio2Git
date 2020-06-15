/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import EjemploCalculadora.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert.*;

/**
 *
 * @author JoseManuel
 */
public class calculadoraTest {
    
    private Calculadora objetoCalc = new Calculadora(20,10,"marca","modelo");
    
    public calculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Comenzando tests....");
        System.out.println("");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Fin de los tests....");
        System.out.println("----------------------");
    }
    
    @Before
    public void setUp() {
         System.out.println("Comienza el test....");
    }
    
    @After
    public void tearDown() {
        System.out.println("Finaliza el test....");
    }

    
    
    @Test
    public void testSuma(){
        System.out.println("Test método suma....");
        double expResult = 290;
        objetoCalc.setNum1(90);
        objetoCalc.setNum2(200);
        Assert.assertEquals(expResult, objetoCalc.suma(), 0.0);
    }
    
    @Test
    public void testResta(){
        System.out.println("Test método resta....");
        double expResult=10;
        Assert.assertEquals(expResult, objetoCalc.resta(), 0.0);
    }
    
    @Test
    public void testMultiplicacion(){
    System.out.println("Test método multiplicación....");
    double expResult=200;
    Assert.assertEquals(expResult, objetoCalc.multiplicacion(), 0.0);
}
    
    @Test
    public void testDivision(){
        System.out.println("Test método división....");
        double expResult=2;
        Assert.assertEquals(expResult, objetoCalc.division(), 0.0);
        
        
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}