/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.GameControl;
import byui.cit260.oregonTrail.model.Player;
import java.util.Scanner;

/**
 *
 * @author James
 */
public class StartProgramView {
    
    public String promptMessage;

    public StartProgramView(){
        this.promptMessage = "\nPlease enter your name: ";
        //display the banner when view is created
        this.displayBanner();
        
    }

    public void displayBanner() {
        System.out.println(
              "\n**************************************************************"
            + "\n*                                                            *"
            + "\n* This game takes place along the 1850’s era Oregon Trail.   *"
            + "\n* In this game, the player takes the place of one of several *" 
            + "\n* characters as he or she embarks along the trek west. Along *"
            + "\n* the way, the player is faced with several challenges and   *"
            + "\n* missions that he or she needs to compete in order to win   *"
            + "\n* the game.                                                  *"
            + "\n*                                                            *"
            + "\n* After starting a game, the user is prompted to select his  *"
            + "\n* or her character type (farmer, blacksmith, merchant).      *"
            + "\n* Each profession comes with it different starting amounts   *"
            + "\n* and ability to earn points. Then the traveler names each   *"
            + "\n* member of his or her party and purchases inventory to be   *"
            + "\n* used along the trail. After selecting the time of year to  *"
            + "\n* embark, the journey begins.                                *"
            + "\n*                                                            *"
            + "\n* Along the trail, the company is faced with many difficult  *"
            + "\n* decisions that could bring great rewards or exact great    *"
            + "\n* cost to the party. They will cross rivers, face sickness   *"
            + "\n* and famine, hunt for food, trade with natives or fellow    *"
            + "\n* travelers and interact with others at each checkpoint.     *"
            + "\n*                                                            *"
            + "\n* The game tests the mettle of even the most hardened        *"
            + "\n* adventure. Can you make it in the 1850’s travel west?      *"
            + "\n* Only time will tell.                                       *"
            + "\n*                                                            *"
            + "\n**************************************************************"
            );
    }

    public void displayStartProgramView() {
                              
            boolean done = false; // set flag to not done
            do {
                //prompt for and get player's name
                String playersName = this.getPlayersName();
                if (playersName.toUpperCase().equals("Q")) // user wants to quit
                    return; //exit the game
                 
                //do the requested action and display the next view
                done = this.doAction(playersName);
            } while (!done);
    }

    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break; //end the loop
        }
        
        return value; //return the value entered
    }

    private boolean doAction(String playersName) {
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
            + "The name must be greater than one character in length");
            return false;
        }
        
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) { //if unsuccessful
            System.out.println("\nError creating the player.");
            return false;
        }
        
        //display next view
        this.displayNextView(player);
        
        return true; //success!
    }

    private void displayNextView(Player player) {
        //dispaly a custom welcome message
        System.out.println("\n==========================================="
                           +"\n Welcome to the game " + player.getName()
                           +"\n We hope you have a lot of fun!"
                           +"\n==========================================="
                           );
        
        //create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        //display the main menue view
        mainMenuView.displayMainMenuView();
        
    }
}

