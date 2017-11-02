/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.GameControl;
import byui.cit260.oregonTrail.model.Game;
import java.util.Scanner;
import oregonTrail.OregonTrail;

/**
 *
 * @author Dresen_HP
 */
class StartGameView {
    //class instance variables
    private String promptMessage; // enter choice prompt


    
    public StartGameView() { // called from startNewGame() in MainMenuView
        this.promptMessage = "\nPlease enter the name of your companion.";

}
    public void displayStartGameView() { // called from startNewGame() in MainMenuView
        
        String companion;
        do {
            System.out.print(getCompanionList());
            companion = this.getCompanionName();
            if (companion.toUpperCase().equals("Q")) 
                return; //exit to startNewGame() in MainMenuView

            this.doAction(companion);
        } while (OregonTrail.getCurrentGame().getCompanion3() == "");
        System.out.print(getCompanionList());
        this.displayNextView();
        
        
    }
    private String getCompanionList() {
        String companion1 = OregonTrail.getCurrentGame().getCompanion1(); 
            String companion2 = OregonTrail.getCurrentGame().getCompanion2();
            String companion3 = OregonTrail.getCurrentGame().getCompanion3();
            String companionList = ("\n"
                        +"\n----------------------------------------------------"
                        +"\n| Companions                                        |"
                        +"\n----------------------------------------------------"
                        +"\nYou: " + OregonTrail.getCurrentGame().getPlayer().getName()
                        +"\nCompanion 1: " + companion1              
                        +"\nCompanion 2: " + companion2
                        +"\nCompanion 3: " + companion3
                        +"\n----------------------------------------------------");
            return companionList;
    }
        
    private String getCompanionName() { // called from displayStartGameView() in this class
        Scanner keyboard = new Scanner(System.in);
        String value = ""; // create variable value to be returned
        boolean valid = false; // initialize to not valid
        
        while(!valid) { // loop while invalid value entered
            System.out.println("\n" + this.promptMessage); // print out the message to user
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading/trailing blanks
            
            if (value.length() < 1) { // if value blank, print error message.
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            break; // end loop
        }
        return value; // return value entered to displayStartGameView()
    }

    private void doAction(String companion) { // called from displayStartGameView in this class
        if (companion.length() < 2) {  // checks name length and prints error
            System.out.println("\nInvalid companion name:"
            + "The name must be greater than one character in length");
            this.getCompanionName(); // calls getCompanionName() from this class to prompt user to re-enter name.
        }
        this.setCompanionName(companion);
        return;
    } 
    public static void setCompanionName(String companion) {
        Game game = OregonTrail.getCurrentGame();
        String companion1 = game.getCompanion1();
        String companion2 = game.getCompanion2();
        String companion3 = game.getCompanion3();
        if (companion1 == "")
            OregonTrail.getCurrentGame().setCompanion1(companion);
        else if (companion2 == "")
            OregonTrail.getCurrentGame().setCompanion2(companion);
        else if (companion3 == "")
            OregonTrail.getCurrentGame().setCompanion3(companion);
        else
            return;
        
    }
    private void displayNextView() {
        OccupationView occupationView = new OccupationView();
        occupationView.displayOccupationView();
    }
}
/*GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu(); //calls displayMenu() from game menu object.*/