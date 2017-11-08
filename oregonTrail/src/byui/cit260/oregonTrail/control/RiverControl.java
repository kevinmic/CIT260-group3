/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.control;

import byui.cit260.oregonTrail.model.Database;
import byui.cit260.oregonTrail.model.RiverScene;
import java.util.Random;

/**
 *
 * @author Group 3
 * 
 */
public class RiverControl {

    public static int calcRiverSuccessProbability(int riverHeight, int guide,  long currentRiverWeather) {
    //validate inputs
    if (riverHeight < 0) {
            return -1;
        }
    if (guide != 0 && guide != 1) {
            return -1;
        }
    if (currentRiverWeather < -2) {
            return -1;
        }
    if (riverHeight > 20) {
        return -1;
    }
        
   //declare all the variables
   int max = 100;
   int min = 1;
   int randomNum = 55;
   int chanceOfSuccess = 0;
   long month = 0;
   int currentWeatherModifier = 0;
   int adjustedRiverHeight = 0;
   int guideModifier = 0;
   int success = 0;

   
   /**create random number - but not right now
   Random rand = new Random();
   randomNum = rand.nextInt((max - min) + 1) + min; **/
   
   //get RiverHeight
   
   
   //calculate month

   // sd = (Database.INSTANCE.getGame().getStartDate());
   // dt = (Database.INSTANCE.getGame().getTravelDays());
   int sd = 60;
   int dt = 94;


    if ((sd + dt)/30 > 12) {
        month = (sd % dt)/12;
    }
    else {
        month = (sd % dt)/12;
    }
        
    //calculate currentWeatherModifier using the current month (colder weather lowers the riverHieght)       
    if (month >= 1 && month <= 2) {
        currentWeatherModifier = -2;
    }
    if (month >= 3 && month <= 4) {
        currentWeatherModifier = -1;
    }
    if (month >= 5 && month <= 8) {
        currentWeatherModifier = 0;
    }
    if (month >= 9 && month <= 11) {
        currentWeatherModifier = 1;
    }
    if (month == 12) {
        currentWeatherModifier = -2;
    }
    
    //set river height
    adjustedRiverHeight = riverHeight + currentWeatherModifier;
    
    //do you get a bonus for hiring a guide?
    if (guide == 0) {
        guideModifier = 0;
    }
    
    if (guide == 1) {
        guideModifier = 50;
    }
    
    chanceOfSuccess = adjustedRiverHeight + guideModifier;
    if (randomNum <= chanceOfSuccess) {
        success = 1;
    }
    
    if (randomNum >= chanceOfSuccess) {
        success = 0;
    }
        
   //return chanceOfSuccess
   return success;
}

    public static void calcRiverSuccessProbability() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
