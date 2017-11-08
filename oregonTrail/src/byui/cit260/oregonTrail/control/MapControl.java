/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.control;
import java.util.Date;
import java.util.Random;
import byui.cit260.oregonTrail.model.Player;
import byui.cit260.oregonTrail.model.Location;
import byui.cit260.oregonTrail.model.Game;

/**
 *
 * @author Clausi,James
 */
public class MapControl {
    public int calcDistanceTraveled( int pace, int totalHealth){
       // validate inputs
	   // pace must be an integar >= 0 
        if (pace < 0 ) {
            return -1;
        }
		// lower boundary, health cannot be less than 0 
        if (totalHealth < 0) {
            return -1;
        }
		// cannot travel if dead aka totalHealth is 0
        if (totalHealth == 0) {
            return 1;
    }			
		// if pace is 0, the party is resting	
        if (pace == 0) {
            return 2;
    }
    
        // declare all variables
        int p = 15;
	int tH = 2;
	int travelDays = 10;
        
        pace = p * tH;
		
	int distanceTraveled = pace * travelDays;				
		
    return distanceTraveled;        
    }    
}   
/*
move(actor, locations)
visitHuntingLocation(huntingScene, actor)
visitFortLocation(fortScene, actor)
visitRiverScene(riverScene, actor)
visitBarterScene(barterScene, actor)
*/


