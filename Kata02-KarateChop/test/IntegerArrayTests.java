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
public class IntegerArrayTests {
    
    public IntegerArrayTests() {
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
    public void testSubset()
    {
        assertArrayEquals(new int[]{1, 2, 3, 4}, IntegerArray.subSet(new int[]{1,2,3,4}, 0, 3));
        assertArrayEquals(new int[]{1, 2, 3}, IntegerArray.subSet(new int[]{1,2,3,4}, 0, 2));
        assertArrayEquals(new int[]{1, 2}, IntegerArray.subSet(new int[]{1,2,3,4}, 0, 1));
        assertArrayEquals(new int[]{1}, IntegerArray.subSet(new int[]{1,2,3,4}, 0, 0));
        
        assertArrayEquals(new int[]{2, 3, 4}, IntegerArray.subSet(new int[]{1,2,3,4}, 1, 3));
        assertArrayEquals(new int[]{3, 4}, IntegerArray.subSet(new int[]{1,2,3,4}, 2, 3));
        assertArrayEquals(new int[]{4}, IntegerArray.subSet(new int[]{1,2,3,4}, 3, 3));
        assertArrayEquals(new int[]{2, 3}, IntegerArray.subSet(new int[]{1,2,3,4}, 1, 2));
        
        assertArrayEquals(new int[]{4,5,6,7,8}, IntegerArray.subSet(new int[]{1,2,3,4,5,6,7,8,9}, 3, 7));
    }
}