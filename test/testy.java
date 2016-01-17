/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.math.BigInteger;
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
public class testy {
    
    public testy() {
    }
    @Test
    public void rektest(){
    Rek a=new Rek(6);
     BigInteger wynik =a.silnia(BigInteger.valueOf(a.wartosc));
     assertEquals(wynik, BigInteger.valueOf(720));
    }
    @Test
    public void itetest(){
    Ite b=new Ite(6);
   BigInteger wynik= b.oblicz();
   
        assertEquals(wynik, BigInteger.valueOf(720));
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
