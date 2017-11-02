/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.control;

import static byui.cit260.oregonTrail.model.Occupation.Merchant;
import byui.cit260.oregonTrail.model.Database;
import byui.cit260.oregonTrail.model.Game;
import byui.cit260.oregonTrail.model.InventoryItem;
import byui.cit260.oregonTrail.model.InventoryType;
import static byui.cit260.oregonTrail.model.InventoryType.Money;
import byui.cit260.oregonTrail.model.Occupation;
import byui.cit260.oregonTrail.model.Player;
import java.util.Map;
import oregonTrail.OregonTrail;

/**
 *
 * @author Dresen_HP
 */
public class GameControl {

    public static Player createPlayer(String name) { // called from doAction() in StartProgramViewClass. Player's name passed in.
        if (name == null) {  // if no player name passed in, return null back to doAction()
            return null;
        }
        
        Player player = new Player(); // Create new player object using constructor function in Player class
        player.setName(name); // set the name in the new player object.
        
        OregonTrail.setPlayer(player); // calls setPlayer in OregonTrail.java and passes in the player object.
        
        return player; // returns player object back to doAction in StartProgramView
    }
    public static Game createNewGame(Player player) {
        if (player == null)  // if no player passed in, return null back to startNewGame() in MainMenuView
            return null;
            Game currentGame =  new Game(); // create new game object.
            currentGame.setPlayer(player);
            currentGame.setCompanion1("");
            currentGame.setCompanion2("");
            currentGame.setCompanion3("");
            
            OregonTrail.setCurrentGame(currentGame); // calls setCurrentGame() in OregonTrail.java and passes in the game object.
            
            return currentGame; // returns current game back to StartGameView
   
    }



    

    public static void setOccupation(Occupation choice) {
        Game game = OregonTrail.getCurrentGame();
        Occupation occupation = game.getPlayer().getOccupation();
        if (occupation == null) {
            OregonTrail.getCurrentGame().getPlayer().setOccupation(choice);
            
        }
    

    //public static void setCompanionName(String name) {
        //Game game = OregonTrail.getCurrentGame();
        //String companion1 = game.getCompanion1();
        //String companion2 = game.getCompanion2();
        //String companion3 = game.getCompanion3();
        /*if (companion1 = null) {
            game.setCompanion1(name);
        } else if { (companion2 = null)
            game.setCompanion2(name);
        } else if { (companion3 = null)
            game.setCompanion3(name);
        } else {
            return;
        }
                
    }


    
    public void CreateNewPlayer(String name) { // called from doAction() in StartProgramView class
        
        Player player = new Player(); // creates new Player instance named player
        String playerName = player.getName(); //calls getter function for player object to get player's name.
        if (name != null) { // If the player doesn't have a name set, setter function called to set name with value passed in.
            if (playerName == null) {
                player.setName(name);
            }               
        }   
    } 
    /**public void startNewGame(String companion1, String companion2, String companion3, Occupation occupation) {
        Game game = new Game();  //TODO: How do I start database with new game?
        game.setCompanion1(companion1);
        game.setCompanion2(companion2);
        game.setCompanion3(companion3);
        Database.INSTANCE.getGame().getPlayer().setOccupation(occupation);
        Map<InventoryType, InventoryItem> items = Database.INSTANCE.getGame().getPlayer().getItems();
        InventoryItem item = items.get(Money);
        int startingPurse = 500;
        if (occupation == Merchant) {
            startingPurse = 700;
        }
        item.setQuantityInStock(startingPurse);
    }
    * **/
    
    //public void saveGame(Player player, Game game, Database INSTANCE) {
        //TODO: Learn how to save the game.
    //}
    
    //public void loadGame(Player player, Game game, Database INSTANCE) {
        //TODO: Add statements to load game.
    //}
    //TODO: Create high scores list. Do we want to remove this to simplify? Probably need to create new class to hold high scores.
    
    //TODO: Create function to initialize map. Probably need to change how Location is structured, and add list of locations.
    
    //public void quitGame() {
        //TODO: Add statements to function.
    //}
    
    //public int calculateScore(Database INSTANCE) {
        //TODO: Add statements to function. Do we want to remove score to simplify? Could just be you make it you win.
        //int score = 5;
       // return score;
    }
}
    
