/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.GameControl;
import java.util.Scanner;
import oregonTrail.OregonTrail;

/**
 *
 * @author jordan
 */
class MainMenuView {
    
    private String menu;
    private String promptMessage;
    private String helpMenu;
        

    public MainMenuView() {
        this.promptMessage = "\nPlease enter your choice: ";
    //    this.displayMainMenuView();
        //display the banner when view is created
        
        this.menu = "\n"
                    +"\n----------------------------------------------------"
                    +"\n| Main Menu                                        |"
                    +"\n----------------------------------------------------"
                    +"\nN - Start new game"
                    +"\nG - Get and start saved game"
                    +"\nH - Get help on how to play the game"
                    +"\nS - Save game"
                    +"\nQ - Quit"
                    +"\n----------------------------------------------------";
    }

    public void displayMainMenuView() {
        System.out.print(menu);
        boolean done = false; //set flag to not done
        do {
            //prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) //user wants to quit
                return; //exit the game
            
            //do the requested actiona and display the next view
            done = this.doAction(menuOption);
        
        } while (!done);
    }

    private String getMenuOption() { 
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

    private boolean doAction(String choice) {
        choice = choice.toUpperCase(); //convert choicd to upper case
        
        switch (choice) {
            case "N": //create and start a new game
                this.startNewGame();
                break;
            case "G": //get and start an existing game
                this.startExistingGame();
                break;
            case "H": //display the help menu
                this.displayHelpMenu();
                break;
            case "S": //save the current game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void startNewGame() {
            //create a new game
        GameControl.createNewGame(OregonTrail.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame() function called ***");
    }

    private void displayHelpMenu() {
        this.promptMessage = "\nPlease enter your choice: ";
    //    this.displayMainMenuView();
        //display the banner when view is created
        
        this.helpMenu = "\n"
                    +"\n----------------------------------------------------"
                    +"\n| Help Menu                                        |"
                    +"\n----------------------------------------------------"
                    +"\nL - Learn more about the Oregon Trail"
                    +"\nO - Objectives of the game"
                    +"\nS - Learn about each occupation"
                    +"\nQ - Quit to main menu"
                    +"\n----------------------------------------------------";
        
  
        System.out.print(helpMenu);
            boolean done = false; //set flag to not done
            do {
                //prompt for and get players name
                String helpMenuOption = this.getHelpMenuOption();
                if (helpMenuOption.toUpperCase().equals("Q")) //user wants to quit
                    this.displayMainMenuView(); // return to main menu

                //do the requested actiona and display the next view
                done = this.helpAction(helpMenuOption);

            } while (!done);
            
}
    
    private String getHelpMenuOption() { 
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
    
    private boolean helpAction(String choice) {
        choice = choice.toUpperCase(); //convert choicd to upper case
        switch (choice) {
            case "L": //learn about the Oregon Trail
                this.displayLearnOregonTrail();
                break;
            case "O": //show the game's objectives
                this.displayObjectives();
                break;
            case "S": //display different occupation options
                this.displayOccupations();
                break;
                // case Q not needed because it is handled in displayHelpMenu()
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void displayLearnOregonTrail() {
        System.out.println("\n*** displayLearnOregonTrail() stub function called ***");
    }

    private void displayObjectives() {
        System.out.println("\n*** displayObjectives() stub function called ***");
    }

    private void displayOccupations() {
        System.out.println("\n*** displayOccupations() stub function called ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame() function called ***");
    }
    
}
