/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package suma;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumne
 */
public class MetodosTest {
    
    Metodos m;
   
    
    @Before
    public void before() {
        m = new Metodos();
    }
    

    @Test
    public void testSumar() {

        int a = 10;
        int b = 20;

        int expRes = 30;
        int res = m.Sumar(a, b);
        assertEquals(expRes, res);

    }

    /**
     * Test of getNum1 method, of class Metodos.
     */
    @Test
    public void testGetNum1() {
        int a = 10;
        int b = 20;

        int expRes = 10;
        int res = m.getNum1(a, b);
        assertEquals(expRes, res);
    }

   
    @Test
    public void testValorAbsoluto() {
        int a = -10;
        int b = 2;

        int expRes = 12;
        
        int res = m.valorAbsoluto(a, b);
        assertEquals(expRes, res);

    }
    
}
