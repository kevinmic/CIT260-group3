/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.control;

import byui.cit260.oregonTrail.model.Game;
import java.util.Date;

/**
 *
 * @author jones_jordan
 * 
 */
public class RiverControl {
    public double calcRiverSuccessProbability(long riverHeight, int guide,  long currentRiverWeather) {
    //validate inputs
    if (riverHeight < 0) {
            return -1;
        }
    if (guide != 0 && guide != 1) {
            return -1;
        }
    if (currentRiverWeather < 0) {
            return -1;
        }
        
   //set initial values
   int chanceOfSuccess = 0;
   Date riverCrossingStartDate
           riverCrossingStartDate = setValue(Game.startDate);
        
   //return chanceOfSuccess
   return chanceOfSuccess;
}
}
