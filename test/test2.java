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
public class test2 {
    
    public test2() {
    }
    
    @Test
    public void testujsortowanie(){
        long czas=System.currentTimeMillis();
    int[] a=Sortowanie.generuj_tablice();
    Sortowanie.sortuj(a, 0, 999999);
    czas=System.currentTimeMillis()-czas; 
    System.out.println(czas);
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
