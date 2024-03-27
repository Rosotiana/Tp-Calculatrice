/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package mg.inclusiv.cdan008.tp.calculatrice;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Inclusiv-PC05
 */
public class CalculeTest {
    
    public CalculeTest() {
    }

    /**
     * Test of addition method, of class Calcule.
     */
    @Test
    public void testAddition() {
        Calcule add = new Calcule();
        assertEquals(-12,add.addition(-9,-3));
        assertEquals(0,add.addition(-12,12));
        assertEquals(12,add.addition(12,0));  
    }
    
    @Test
    public void testSoustraction() {
        Calcule min = new Calcule();
        assertEquals(-12,min.soustraction(-9, 3));
        assertEquals(0,min.soustraction(9, 9));
        assertEquals(9,min.soustraction(12, 3));
    }
    
    @Test
    public void testMultiplication() {
        Calcule mul = new Calcule();
        assertEquals(27,mul.multiplication(9, 3));
        assertEquals(0,mul.multiplication(9, 0));
        assertEquals(-27,mul.multiplication(-9, 3));
    }
    
    @Test
    public void testDivision(){
        Calcule div = new Calcule();
        assertEquals(12,div.division(27, 3));
    }
    
}
