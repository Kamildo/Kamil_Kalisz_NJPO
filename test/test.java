/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kamildo
 */
public class test {
    
    
    
   
    public void test() {
    }
     @Test
    public void testrownanie(){
       
    FunkcjaKwadratowa funkcja=new FunkcjaKwadratowa(-1, 2, 3);//powinno wyjsc 3,-1
    double [] wynik=funkcja.wypiszMiejscaZerowe();
    double b=3.0;
     double a=-1.0;
       assertEquals(wynik[0], a,0);
         assertEquals(wynik[1], b,0);
     
         
    
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
