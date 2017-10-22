/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.control;
import java.util.Date;
import java.util.Random;
import byui.cit260.oregonTrail.model.Database;
import byui.cit260.oregonTrail.model.Player;
import byui.cit260.oregonTrail.mobel.Location;

/**
 *
 * @author Dresen_HP
 */
public class MapControl {
    public double calcDistanceTraveled(double pace, double totalHealth){
        //validate inputs
        if (pace < 0 ) {
            return -1;
        }
        if (totalHealth < 0) {
            return -1;
        }
        if (totalHealth == 0) {
            return 1;
        if (pace = 0) {
            return 2;
    }
    
        //declare all variables
        int pace = int paceChoice * int totalHealth
                
        int paceChoice = boolean paceChoiceUser;
            if (paceChoice == Rest){
                paceChoice = 0;
            }
            if (paceChoiceUser == 'Slow'){
                paceChoice = 7;
            }
            if (paceChoiceUser == 'Normal'){
                paceChoice = 10;
            }
            if (paceChoiceUser == 'Fast'){
                paceChoice = 15;
            }
            if (paceChoiceUser == 'Breakneck'){
                paceChoice = 20;
            }
}

+move(actor, locations)
+visitHuntingLocation(huntingScene, actor)
+visitFortLocation(fortScene, actor)
+visitRiverScene(riverScene, actor)
+visitBarterScene(barterScene, actor)
+calcDistanceTraveled(pace, totalHealth):double
