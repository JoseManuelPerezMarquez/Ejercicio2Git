/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import rec2eval.Alumno;

/**
 *
 * @author josem
 */
@RunWith (value = Parameterized.class)
public class notaModulotestPara {
    
    private double notaPractica1;
    private double notaPractica2;
    private double notaPractica3;
    private double esperado;
   
    public notaModulotestPara(double notaPractica1, double notaPractica2, double notaPractica3,double esperado) {
        this.notaPractica1 = notaPractica1;
        this.notaPractica2 = notaPractica2;
        this.notaPractica3 = notaPractica3;
        this.esperado=esperado;
    }
    
    @Parameters
    
    public static Collection<Object[]>  notasModulo(){
        
        Object[][] datos = new Object[][] {
            {2,2,2,4},
            {5,6,7,6},
            {3,3,2,4},
            {8,8,8,8},
            {10,10,10,10}
            
        };
        return Arrays.asList(datos);
                
    }
    
    @Test
    
     public void TestNotaModulo(){
         Alumno instancia = new Alumno(this.notaPractica1, this.notaPractica2,this.notaPractica3);
       
      Assert.assertEquals( "La nota media del modulo es: " , this.esperado, instancia.notaModulo(), 0.0);
         
     }
}

