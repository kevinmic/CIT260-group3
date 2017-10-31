/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import java.util.Scanner;

/**
 *
 * @author Dresen_HP
 */
class HelpMenuView {
    
    // class instance variables
    private String helpMenu; // help menu
    private String promptMessage; // enter choice prompt
    
    // constructor function called from displayHelpMenu() in MainMenuView
    public HelpMenuView(){ 
        //stores help menu and promptMessage in class instance variable.
        this.promptMessage = "\nPlease enter your choice: ";
        this.helpMenu = "\n"
                    +"\n----------------------------------------------------"
                    +"\n| Help Menu                                        |"
                    +"\n----------------------------------------------------"
                    +"\nL - Learn more about the Oregon Trail"
                    +"\nO - Objectives of the game"
                    +"\nS - Learn about each occupation"
                    +"\nQ - Quit to main menu"
                    +"\n----------------------------------------------------";
    } // returns control back to displayHelpMenu() in MainMenuView
    public void displayHelpMenuView() {
        System.out.print(helpMenu); // Prints out helpMenu class instance variable.
            boolean done = false; //set flag to not done
            do { //prompt for and get help menu choice
                String helpMenuOption = this.getHelpMenuOption();// calls getHelpMenuOption() from this class. 
                if (helpMenuOption.toUpperCase().equals("Q")) // if user wants to return to main menu
                return; // returns control backt o displayHelpMenu() in MainMenuView


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


    
}

