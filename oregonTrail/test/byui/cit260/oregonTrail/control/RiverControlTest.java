/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dresen_HP
 */
public class RiverControlTest {
    
    public RiverControlTest() {
    }

    /**
     * Test of calcRiverSuccessProbability method, of class RiverControl.
     */
    @Test
    public void testCalcRiverSuccessProbability() {
 
    /********************
         * Test case #1
         ********************/
        System.out.println("\tTest case #1");
        int riverHeight = 5;
        int guide = 1;
        long currentRiverWeather = -2;
        int startDate = 5;
        int travelDays = 20;
        RiverControl instance = new RiverControl();
        int expResult = -1;
        int result = instance.calcRiverSuccessProbability(riverHeight, guide, currentRiverWeather, startDate, travelDays);
        assertEquals(expResult, result);

        
        /********************
         * Test case #2
         ********************/
        System.out.println("\tTest case #2");
        riverHeight = 21;
        guide = 0;
        currentRiverWeather = 0;
        startDate = 5;
        travelDays = 20;
        expResult = -1;
        result = instance.calcRiverSuccessProbability(riverHeight, guide, currentRiverWeather, startDate, travelDays);
        assertEquals(expResult, result);
        
        /********************
         * Test case #3
         ********************/
        System.out.println("\tTest case #3");
        riverHeight = 10;
        guide = -1;
        currentRiverWeather = 0;
        startDate = 5;
        travelDays = 20;
        expResult = -1;
        result = instance.calcRiverSuccessProbability(riverHeight, guide, currentRiverWeather, startDate, travelDays);
        assertEquals(expResult, result);
        
        /********************
         * Test case #4
         ********************/
        System.out.println("\tTest case #4");
        riverHeight = 5;
        guide = 1;
        currentRiverWeather = 4;
        expResult = 41;
        result = instance.calcRiverSuccessProbability(riverHeight, guide, currentRiverWeather, startDate, travelDays);
        assertEquals(expResult, result);
        
        /********************
         * Test case #5
         ********************/
        System.out.println("\tTest case #5");
        riverHeight = 2;
        guide = 0;
        currentRiverWeather = -1;
        expResult = 50;
        result = instance.calcRiverSuccessProbability(riverHeight, guide, currentRiverWeather, startDate, travelDays);
        assertEquals(expResult, result);
        
        /********************
         * Test case #6
         ********************/
        System.out.println("\tTest case #6");
        riverHeight = 9;
        guide = 1;
        currentRiverWeather = 0;
        expResult = 40;
        result = instance.calcRiverSuccessProbability(riverHeight, guide, currentRiverWeather, startDate, travelDays);
        assertEquals(expResult, result);
        
        /********************
         * Test case #7
         ********************/
        System.out.println("\tTest case #7");
        riverHeight = 20;
        guide = 0;
        currentRiverWeather = 1;
        expResult =29;
        result = instance.calcRiverSuccessProbability(riverHeight, guide, currentRiverWeather, startDate, travelDays);
        assertEquals(expResult, result);
    }
}
