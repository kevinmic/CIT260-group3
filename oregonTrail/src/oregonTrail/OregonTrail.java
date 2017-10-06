/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregonTrail;

import byui.cit260.oregonTrail.model.Player;

/**
 *
 * @author Dresen_HP
 */
public class OregonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player playerOne = new Player();
        
        playerOne.setName("Tammy");
        playerOne.setCurrentScore(0);
        playerOne.setPace(0);
        playerOne.setSavedGameFile("Game.save");
        
        System.out.println(playerOne.toString());
    }
    
}
