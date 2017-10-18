/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dresen_HP
 */
public class HuntControlTest {
    
    public HuntControlTest() {
    }

    /**
     * Test of calcFoodWeight method, of class HuntControl.
     */
    @Test
    public void testCalcFoodWeight() {
        System.out.println("calcFoodWeight");
        
        /********************
         * Test case #1
         ********************/
        System.out.println("\tTest case #1");
        long baseWeight1 = 15;
        long baseWeight2 = 200;
        int guide = 0;
        HuntControl instance = new HuntControl();
        double expResult = 100;
        double result = instance.calcFoodWeight(baseWeight1, baseWeight2, guide);
        assertEquals(expResult, result, 0.0001);
        
        /********************
         * Test case #2
         ********************/
        System.out.println("\tTest case #2");
        baseWeight1 = 200;
        baseWeight2 = 15;
        guide = 1;
        expResult = 200;
        result = instance.calcFoodWeight(baseWeight1, baseWeight2, guide);
        assertEquals(expResult, result, 0.0001);
        
        /********************
         * Test case #3
         ********************/
        System.out.println("\tTest case #3");
        baseWeight1 = 15;
        baseWeight2 = 30;
        guide = 0;
        expResult = 45;
        result = instance.calcFoodWeight(baseWeight1, baseWeight2, guide);
        assertEquals(expResult, result, 0.0001);
        
        /********************
         * Test case #4
         ********************/
        System.out.println("\tTest case #4");
        baseWeight1 = 500;
        baseWeight2 = 15;
        guide = 3;
        expResult = -1;
        result = instance.calcFoodWeight(baseWeight1, baseWeight2, guide);
        assertEquals(expResult, result, 0.0001);
        
        /********************
         * Test case #5
         ********************/
        System.out.println("\tTest case #5");
        baseWeight1 = -1;
        baseWeight2 = 200;
        guide = 1;
        expResult = -1;
        result = instance.calcFoodWeight(baseWeight1, baseWeight2, guide);
        assertEquals(expResult, result, 0.0001);
        
        /********************
         * Test case #6
         ********************/
        System.out.println("\tTest case #6");
        baseWeight1 = 200;
        baseWeight2 = -5;
        guide = 1;
        expResult = -1;
        result = instance.calcFoodWeight(baseWeight1, baseWeight2, guide);
        assertEquals(expResult, result, 0.0001);
        
        /********************
         * Test case #7
         ********************/
        System.out.println("\tTest case #7");
        baseWeight1 = 0;
        baseWeight2 = 0;
        guide = 0;
        expResult = 0;
        result = instance.calcFoodWeight(baseWeight1, baseWeight2, guide);
        assertEquals(expResult, result, 0.0001);
        
        /********************
         * Test case #8
         ********************/
        System.out.println("\tTest case #2");
        baseWeight1 = 0;
        baseWeight2 = 0;
        guide = 1;
        expResult = 0;
        result = instance.calcFoodWeight(baseWeight1, baseWeight2, guide);
        assertEquals(expResult, result, 0.0001);
        
        /********************
         * Test case #9
         ********************/
        System.out.println("\tTest case #9");
        baseWeight1 = 0;
        baseWeight2 = 50;
        guide = 1;
        expResult = 50;
        result = instance.calcFoodWeight(baseWeight1, baseWeight2, guide);
        assertEquals(expResult, result, 0.0001);
    }
    
}
