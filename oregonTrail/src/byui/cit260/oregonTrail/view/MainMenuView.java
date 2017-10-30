/*
 * Comments to help understand.
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
    
    // class instance variables
    private String menu; // main menu
    private String promptMessage; // enter choice prompt
    private String helpMenu; // help menu
        
    // constructor function Called from displayNextView() in StartProgramView. 
    public MainMenuView() {
        // stores prompt message in class instance variable
        this.promptMessage = "\nPlease enter your choice: ";
        // stores main menu in class instance variable.
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

    public void displayMainMenuView() { // Called from displayNextView() in StartProgramView class.
        System.out.print(menu); // Prints out the menu.
        boolean done = false; //set flag to not done
        do {
            String menuOption = this.getMenuOption();//calls GetMenuOption from this class
            if (menuOption.toUpperCase().equals("Q")) //user wants to quit
                return; // Returns control to displayNextView() in StartProgramView. (Exit game) TODO: Why does this exit game?
            
            //Calls doAction() in this class and passes in menu option. 
            done = this.doAction(menuOption); //do the requested action and display the next view
        
        } while (!done); // repeats the loop if done = false. False value will be returned from doAction() if menuOption is invalid.
    }

    private String getMenuOption() { //Called from displayMainMenuView in this class.
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //create variable value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage); // prints out promptMessage class instance variable.
            
            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 1) { // if value is blank, print error message and repeat loop.
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break; //end the loop
        }
        
        return value; //return the value entered to displayMainMenuView
    }

    private boolean doAction(String choice) { //called from displayMainMenuView() in this class. menu choice passed in.
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice) {
            case "N": //Calls startNewGame() in this class. create and start a new game
                this.startNewGame();
                break;
            case "G": //Calls startExistingGame() in this class. get and start an existing game
                this.startExistingGame();
                break;
            case "H": //Calls displayHelpMenu() in this class. display the help menu
                this.displayHelpMenu();
                break;
            case "S": //Calls saveGame() in this class. save the current game
                this.saveGame();
                break;
            default: // Print out error message and exit loop.
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false; // this return will be reached only if invalid option is entered.
                      // false will be returned to displayMainMenuView() triggering repeat of do-while loop.
    }

    private void startNewGame() { // Called from doAction() case N in this class.
            //create a new game
        GameControl.createNewGame(OregonTrail.getPlayer()); //Calls createNewGame() from GameControl and passes in player object.
        
        //Creates new gameMenu object by calling constructor function in GameMenuView class. 
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu(); //calls displayMenu() from game menu object.
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame() function called ***");
    }

    private void displayHelpMenu() { //Called from doAction() case H in this class
        //stores help menu in class instance variable.
        this.helpMenu = "\n"
                    +"\n----------------------------------------------------"
                    +"\n| Help Menu                                        |"
                    +"\n----------------------------------------------------"
                    +"\nL - Learn more about the Oregon Trail"
                    +"\nO - Objectives of the game"
                    +"\nS - Learn about each occupation"
                    +"\nQ - Quit to main menu"
                    +"\n----------------------------------------------------";
        
  
        System.out.print(helpMenu); // Prints out helpMenu class instance variable.
            boolean done = false; //set flag to not done
            do {
                //prompt for and get players name

                String helpMenuOption = this.getHelpMenuOption();// calls getHelpMenuOption() from this class. 
                if (helpMenuOption.toUpperCase().equals("Q")) // if user wants to return to main menu
                    this.displayMainMenuView(); // calls displayMainMenuView() in this class to display the main menu.


                //do the requested action and display the next view
                done = this.helpAction(helpMenuOption);// calls helpAction() from this view and passes in helpMenuOption

            } while (!done); // repeats the loop if done = false. False will be returned from helpAction() if invalid response entered. 
            
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
    
    private boolean helpAction(String choice) { // called from displayHelpMenu() in this class. helpMenuOption passed in.
        choice = choice.toUpperCase(); //convert choicd to upper case
        switch (choice) {
            case "L": //learn about the Oregon Trail
                this.displayLearnOregonTrail();//calls displayLearnOregonTrail() from this class.
                break;
            case "O": //show the game's objectives
                this.displayObjectives();//calls displayLObjectives() from this class.
                break;
            case "S": //display different occupation options

                this.displayOccupations(); //calls displayOccupations() from this class.
                break;
            // no need for case "Q" because this is handled in displayHelpMenu() before this function called.

            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;  // if invalid option selected, error message displayed and loop exited.
        }
        
        return false; // if this return is reached, it is because an invalid option was entered.
                      // false is returned to displayHelpMenu() which causes do-while loop to repeat.
    }

    private void displayLearnOregonTrail() { // called from helpOption() in this class
        System.out.println("\n*** displayLearnOregonTrail() stub function called ***");
    }

    private void displayObjectives() { // called from helpOption() in this class
        System.out.println("\n*** displayObjectives() stub function called ***");
    }

    private void displayOccupations() { // called from helpOption() in this class
        System.out.println("\n*** displayOccupations() stub function called ***");
    }

    private void saveGame() { // called from doOption() in this class
        System.out.println("*** saveGame() function called ***");
    }
    
}
