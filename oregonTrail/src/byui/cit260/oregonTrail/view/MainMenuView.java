/*
 * Comments to help understand.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.GameControl;
import byui.cit260.oregonTrail.model.Game;
import java.util.Scanner;
import oregonTrail.OregonTrail;

/**
 *
 * @author jordan
 */
public class MainMenuView extends View {
    
    // class instance variables
    private String menu; // main menu
    private String promptMessage; // enter choice prompt

        
    // constructor function Called from displayNextView() in StartProgramView. 
    public MainMenuView() {
        super("\n"
                    +"\n----------------------------------------------------"
                    +"\n| Main Menu                                        |"
                    +"\n----------------------------------------------------"
                    +"\nN - Start new game"
                    +"\nG - Get and start saved game"
                    +"\nH - Get help on how to play the game"
                    +"\nS - Save game"
                    +"\nQ - Quit"
                    +"\n----------------------------------------------------"
                    +"\n"
                    +"\n Please enter your choice:");
   
    } // returns control back to displayNextView() in StartProgramView

    @Override
    public boolean doAction(String value) { //called from displayMainMenuView() in this class. menu choice passed in.
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
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

    private boolean startNewGame() { // Called from doAction() case N in this class.
            //create a new game
            Game currentGame = GameControl.createNewGame(OregonTrail.getPlayer()); //Calls createNewGame() from GameControl and passes in player object.
            if (currentGame == null) { //Checks to see if player created. if unsuccessful, print error message.
            System.out.println("\nError creating the game.");
            return false; // if unsuccsful, returns false to doAction so loop is repeated.
        }

            StartGameView startGameView = new StartGameView(); // creates new startGameView object by calling construtor function in StartGameView.
            startGameView.displayStartGameView(); //calls DisplayStartGameView() in StartGameView
            
            return true; //success!
            
        
        
        
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame() function called ***");
    }
    
    private void displayHelpMenu() { //Called from doAction() case H in this class
        HelpMenuView helpMenuView = new HelpMenuView(); // creates new helpMenuView object by calling constructor function in HelpMenuView
        helpMenuView.displayHelpMenuView(); // calls DisplayHelpMenuView() from helpMenuView object.
        this.display(); // if user quits main menu, control returns here and displays the main menu.
    }
    

        private void saveGame() { // called from doOption() in this class
        System.out.println("*** saveGame() function called ***");
    }
}
