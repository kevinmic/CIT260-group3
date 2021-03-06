/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.control;

import static byui.cit260.oregonTrail.model.Occupation.Merchant;
import byui.cit260.oregonTrail.model.Game;
import byui.cit260.oregonTrail.model.InventoryItem;
import byui.cit260.oregonTrail.model.InventoryType;
import static byui.cit260.oregonTrail.model.InventoryType.Money;
import byui.cit260.oregonTrail.model.Occupation;
import byui.cit260.oregonTrail.model.Player;
import oregonTrail.OregonTrail;
import byui.cit260.oregonTrail.model.Map;

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
    /* Team Assignment #10 TODO list
    * Implement createNewGame() method
    *   Figure out number of columns and rows for line 62,63*    
    * Implement createItems() in InventoryControl (pg 15)  
    * Implement createMap() in MapControl (pg 20)
    *   See line 24 of MapControl for TODO list
    * Implement any other object needed to play the game ???
    * Create new mapView class in view package
    * Implement displayMap() in Game Menu View pg 39
    */
    public static int createNewGame(Player player) {
       if (player == null)  // if no player passed in, return null back to startNewGame() in MainMenuView
            return -1;  // return error code
            // create new game object.
            Game game =  new Game();
            // save a reference to the Player object in the game.
            game.setPlayer(player);
            // save a reference to the game in the main class. 
            OregonTrail.setCurrentGame(game);
            // create actors - not needed because enum class
            // assign actor to the player - will do that in susequent occupationView
            // Initialize companions. Will set names in subsequent companionView
            game.setCompanion1("");
            game.setCompanion2("");
            game.setCompanion3("");
            // create inventory. TODO: finish createItems() in inventoryControl
            InventoryItem[] items = InventoryControl.createItems(); 
            // save list of items in the game object.
            game.setInventory(items); 
            // create map and set it in game
            int noOfColumns = 0;
            int noOfRows = 0;
            Map map = MapControl.createMap(noOfRows, noOfColumns);
            // make sure map was created.
            if (map == null) 
                return -1;
            else {
                game.setMap(map);
                return 1; // indicates success
            }

            /*
        actors = createActors()
        Save the list of actors in the Game object
        Assign an actor to the player
 */
            

        //OregonTrail.setCurrentGame(currentGame); // calls setCurrentGame() in OregonTrail.java and passes in the game object.
        //return currentGame; // returns current game back to StartGameView */
        //return 1;
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
    
    public static void setCompanionName(String companion) { // called from doAction() in this class
        Game game = OregonTrail.getCurrentGame(); // gets current game from main
        String companion1 = game.getCompanion1(); // gets companion 1 name from game
        String companion2 = game.getCompanion2(); // gets companion 1 name from game
        String companion3 = game.getCompanion3(); // gets companion 1 name from game
        if (companion1 == "")
            OregonTrail.getCurrentGame().setCompanion1(companion); // sets companions
        else if (companion2 == "")
            OregonTrail.getCurrentGame().setCompanion2(companion);
        else if (companion3 == "")
            OregonTrail.getCurrentGame().setCompanion3(companion);
        else
            return;
        
    } // goes back to doAction()
    
    

    public static void setOccupation(Occupation choice) {
        Game game = OregonTrail.getCurrentGame();
        Occupation occupation = game.getPlayer().getOccupation();
        if (occupation == null) {
            OregonTrail.getCurrentGame().getPlayer().setOccupation(choice);
            
        }
    }

    public static void setStartDate(int startDate) {
        Game game = OregonTrail.getCurrentGame();
        int gameStartDate = game.getStartDate();
        if (gameStartDate == 0) 
            game.setStartDate(startDate);
                   
    }



    public static String thisDay(int monthNumber, int day) {
        String month = null;
        String calendarDate = null;
        // get month
        
        String[] monthList = {"January", "February", "March", "April", "May", "June",
                               "July", "August", "September", "October", "November", "December"};
        month = monthList[monthNumber];
        
        //construct calendarDate string of month and days
        calendarDate = month + day;
        // return calendarDate
        
        return calendarDate;
    }

    public static int findMonth(int startDate, int travelDays) {
        if (startDate < 0) 
            return -1;
        if (travelDays < 0)
            return -1;
        double quotient;
        int monthNumber = 1;
        double calDate = startDate + travelDays;
        quotient = calDate/30;
        monthNumber = (int) Math.ceil(quotient);
        if (monthNumber > 12)
            monthNumber = monthNumber % 12;
        if (monthNumber == 0)
            monthNumber = 12;
        monthNumber -=1;

        return monthNumber;
    }
    
    public static int findDay(int startDate, int travelDays) {
        if (startDate < 0)
            return -1;
        if (travelDays < 0)
            return -1;
        int calDate = startDate + travelDays;
        int days = calDate%30;
        if (days == 0)
            days = 30;
        return days;
    }



    
    
  
   }

    
    //public void saveGame(Player player, Game game, Database INSTANCE) {
        //TODO: Learn how to save the game.
    //}
    
    //public void loadGame(Player player, Game game, Database INSTANCE) {
        //TODO: Add statements to load game.
    //}

    //public void quitGame() {
        //TODO: Add statements to function.
    //}
    
