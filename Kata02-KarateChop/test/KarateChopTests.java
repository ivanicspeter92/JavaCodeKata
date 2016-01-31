/*
 * To change this template, choose Tools | Templates
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
 * @author PéterIvanics
 */
public class KarateChopTests {
    
    public KarateChopTests() {
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
    public void testIterativeKarateChop()
    {
        this.testChopper(new IterativeChop());
    }
    
    @Test
    public void testRecursiveKarateChop()
    {
        this.testChopper(new RecursiveChop());
    }
    
        @Test
    public void testMyKarateChop()
    {
        this.testChopper(new MyChop());
    }
    
    /**
     * Tests the given chooper object.
     * @param chopper The IKarateChopper object to be tested.
     * 
     * @author Peter Ivanics
     * @date 02.01.2016.
     */
    public void testChopper(IKarateChop chopper)
    {
        assertEquals(-1, chopper.chop(3, new int[]{}));
        assertEquals(-1, chopper.chop(3, new int[]{1}));
        assertEquals(0,  chopper.chop(1, new int[]{1}));

        assertEquals(0,  chopper.chop(1, new int[]{1, 3, 5}));
        assertEquals(1,  chopper.chop(3, new int[]{1, 3, 5}));
        assertEquals(2,  chopper.chop(5, new int[]{1, 3, 5}));
        assertEquals(-1, chopper.chop(0, new int[]{1, 3, 5}));
        assertEquals(-1, chopper.chop(2, new int[]{1, 3, 5}));
        assertEquals(-1, chopper.chop(4, new int[]{1, 3, 5}));
        assertEquals(-1, chopper.chop(6, new int[]{1, 3, 5}));

        assertEquals(0,  chopper.chop(1, new int[]{1, 3, 5, 7}));
        assertEquals(1,  chopper.chop(3, new int[]{1, 3, 5, 7}));
        assertEquals(2,  chopper.chop(5, new int[]{1, 3, 5, 7}));
        assertEquals(3,  chopper.chop(7, new int[]{1, 3, 5, 7}));
        assertEquals(-1, chopper.chop(0, new int[]{1, 3, 5, 7}));
        assertEquals(-1, chopper.chop(2, new int[]{1, 3, 5, 7}));
        assertEquals(-1, chopper.chop(4, new int[]{1, 3, 5, 7}));
        assertEquals(-1, chopper.chop(6, new int[]{1, 3, 5, 7}));
        assertEquals(-1, chopper.chop(8, new int[]{1, 3, 5, 7}));
    }
}