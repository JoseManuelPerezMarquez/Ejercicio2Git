/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import rec2eval.Alumno;

/**
 *
 * @author josem
 */
public class TestJunit {
    
    private Alumno objetoAlumno=new Alumno(0, 0, 0, 0);
    
    public TestJunit() {
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
    
    public void testNotaModulo(){
        System.out.println("test NotaModulo");
        objetoAlumno.setNotaPractica1(2);
        objetoAlumno.setNotaPractica2(2);
        objetoAlumno.setNotaPractica2(2);
        
        Assert.assertEquals(4, objetoAlumno.notaModulo(),0.0);
    }
    
    @Test
    
    public void testCalModulo(){
        System.out.println("test Calificacion Modulo");
        String calificacion="Suspenso";
        Assert.assertEquals(calificacion, objetoAlumno.calificacionModulo(),0.0);
    }
    @Test
    
    public void testEntregaPracticas(){
        System.out.println("test NotaModulo");
        objetoAlumno.setNotaPractica1(0);
        objetoAlumno.setNotaPractica2(0);
        objetoAlumno.setNotaPractica3(0);
        org.junit.Assert.assertFalse(false);
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
