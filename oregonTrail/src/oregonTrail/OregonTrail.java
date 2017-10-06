/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregonTrail;

import byui.cit260.oregonTrail.model.Actor;
import byui.cit260.oregonTrail.model.CharacterDialog;
import byui.cit260.oregonTrail.model.Player;
import byui.cit260.oregonTrail.model.Game;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Dresen_HP
 */
public class OregonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // test Player class
        Player playerOne = new Player();
        
        playerOne.setName("Tammy");
        playerOne.setCurrentScore(0);
        playerOne.setPace(0);
        playerOne.setSavedGameFile("Game.save");
        
        System.out.println(playerOne.toString());
        //test Game class
        Game gameOne = new Game();
        
        gameOne.setMilesTraveled(0);
        gameOne.setHighScores(0);
        gameOne.setNoPlayers(2);
        gameOne.setPercentComplete(0);
        gameOne.setPlayer(playerOne);
        gameOne.setTravelDays(0);
        
        System.out.println(gameOne.toString());
        
        // test Actor class
        System.out.println(Actor.Cayusa.getName());
        System.out.println(Actor.Cayusa.getDescription());
        System.out.println(Actor.Cayusa.getCoordinates());
        
        // test CharacterDialog class
        System.out.println(CharacterDialog.FallMountain.getDialog());
        System.out.println(CharacterDialog.FallMountain.getType());
        
    }
    
}
