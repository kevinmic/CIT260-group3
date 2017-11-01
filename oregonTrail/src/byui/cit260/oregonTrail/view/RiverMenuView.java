/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.RiverControl;
import java.util.Scanner;
import oregonTrail.OregonTrail;

/**
 *
 * @author jordan
 */
public class RiverMenuView {
    private String menu;
    private String promptMessage;
    
    public RiverMenuView() {
        this.promptMessage = "\nPlease enter your choice: ";
        this.menu = "\n"
                    +"\n----------------------------------------------------"
                    +"\n| River Menu                                       |"
                    +"\n----------------------------------------------------"
                    +"\nF - Ford the river"
                    +"\nH - Hire a Guide"
                    +"\nS - Save game"
                    +"\nQ - Quit"
                    +"\n----------------------------------------------------";
    }
   
    public void displayRiverMenuView() {
        System.out.print(menu);
        boolean done = false; //set the flag to not done
        do {
            //prompt for and get the menu selection
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) //user wants to leave this menu
                return; //exit the menu
            
                //do the request action and display the next view
                done = this.doAction(menuOption);
        }
        while (!done);
}

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); //get next line typed on keybard
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
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice) {
            case "F": //ford the river
                this.fordRiver();
                break;
            case "H": //hire a guide
                this.hireGuide();
                break;
            case "S": //save the current game
                this.saveGame();
                break;
            case "Q": //quit the menu
                this.quitGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
        
        return false;
    }

    private void fordRiver() {
        //ford the river
        RiverControl.calcRiverSuccessProbability();
    }

    private void saveGame() {
        System.out.println("*** saveGame() function called ***");
    }

    private void quitGame() {
        System.out.println("*** quitGame() function called ***");
    }

    private void hireGuide() {
        System.out.println("*** hireGuide() function called ***");
    }
}
